package model;

import java.util.Calendar;
import java.util.Random;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import util.HibernateUtil;

@Entity
public class Token {
	
	private String token;
	
	private long validUntil; // timestamp
	
	private String userName;
	
	
	// Contains all signs except q in CAPITAL and NON-CAPITAL letters and numbers 0 - 9
	private static final String[] tokenPool = new String[] {"a", "e", "i", "o", "u", "b", "c", "d", "f", "g", "h", "j", "k", "l", "m", "n", "p", "r", "s", "t", "v", "w", "x", "y", "z", "A", "E", "I", "O", "U", "B", "C", "D", "F", "G", "H", "J", "K", "L", "M", "N", "P", "R", "S", "T", "V", "W", "X", "Y", "Z", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};
	
	public Token(){
		// -- 
	}
	
	/**
	 *
	 */
	public static interface SaveTokenCallback {
		
		/**
		 * @param token -
		 * @param hibSess -
		 * @return -
		 */
		boolean save(Token token, Session hibSess);
	}
	
	
	/**
	 * Generates a Token from a pool of (currently) 60 signs. <br>
	 * Can be used for Random Passwords, tickets, etc. <br>
	 * Note: The length L of the token determines the number of possible different (generated) tokens. <br>
	 * The possible variations are calculated by 60^(L), where 60 is the number of different signs in the pool.<br>
	 * 
	 * @param length - the length of the token
	 * @return a random String token with the given length
	 */
	private static String createRandomString(final int length) {
		StringBuilder token = new StringBuilder();
		Random randomGenerator = new Random();
		for (int i = 0; i < length; i++) {
			token.append(tokenPool[randomGenerator.nextInt(tokenPool.length - 1)]);
		}
		return token.toString();
	}
	
	/**
	 * This class creates Tokens, until it created one, that is not existent.<br>
	 * This Token is then returned. This method is synchronized an uses a callback to avoid <br>
	 * Token collisions, when saving them in a database for 2 (or more) different users at the same time. <br>
	 * 
	 * @param length - the length of the desired token
	 * @param cb - the callBack parameter, for synchronization
	 * @return -
	 */
	public static synchronized Token createToken(final int length, final SaveTokenCallback cb) {
		boolean unique = false;
		
		Session hibSess = HibernateUtil.getSessionFactory().openSession();
		Criteria criteria = hibSess.createCriteria(Token.class);
		Token token = new Token();
		try {
			Transaction tx = hibSess.beginTransaction();
			
			while (!unique) {
				String generatedToken = createRandomString(length);
				token.setToken(generatedToken);
				criteria.add(Restrictions.eq("token", generatedToken));
				Object userGroup = criteria.uniqueResult();
				unique = userGroup == null;
			}
			hibSess.save(token);
			if (cb != null) {
				if (cb.save(token, hibSess)) {
					tx.commit();
				} else {
					tx.rollback();
				}
			}
		} finally {
			hibSess.close();
		}
		
		return token;
	}
	
	/**
	 * @return -
	 */
	@Id
	public String getToken() {
		return this.token;
	}
	
	/**
	 * @param token -
	 */
	public void setToken(final String token) {
		this.token = token;
	}
	
	/**
	 * @return -
	 */
	public long getValidUntil() {
		return this.validUntil;
	}
	
	/**
	 * @param validUntil -
	 */
	public void setValidUntil(final long validUntil) {
		this.validUntil = validUntil;
	}
	
	/**
	 * @return -
	 */
	public String getUserName() {
		return this.userName;
	}
	
	/**
	 * @param userName -
	 */
	public void setUserName(final String userName) {
		this.userName = userName;
	}
	
	/**
	 * @return -
	 */
	@Transient
	public boolean isValid() {
		return (this.validUntil > Calendar.getInstance().getTimeInMillis());
	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return this.token;
	}
	
}
