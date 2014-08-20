package util;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import model.ITokenable;
import model.Token;
import model.User;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class CleanupUtil extends AbstractScheduler {
	
	
	private Set<Class<?>> classesToCleanUp = new HashSet<Class<?>>();
	
	
	/**
	 * 
	 */
	public CleanupUtil() {
		this.classesToCleanUp.add(User.class);
	}
	
	@Override
	public String getDisplayName() {
		return "Cleanup";
	}
	
	@Override
	public long getTimePeriod() {
		return ONE_DAY;
	}
	
	/**
	 * @param currentClass
	 * @param hibSess
	 */
	private void deleteTokenFrom(final Class<?> currentClass, final Session hibSess) throws Exception {
		
		Criteria tokenCrit = hibSess.createCriteria(currentClass);
		List<?> tokenList = tokenCrit.list();
		for (Object o : tokenList) {
			if (o instanceof ITokenable) {
				ITokenable obj = (ITokenable) o;
				// if token is not valid until "now", delete it
				if (obj.getToken() != null) {
					if (!obj.getToken().isValid()) {
						Token token = obj.getToken();
						obj.setToken(null);
						hibSess.save(obj);
						hibSess.delete(token);
					}
				}
			}
		}
		
	}
	
	@Override
	public void executeSchedulerTask() {
		
		Session hibSess = HibernateUtil.getSessionFactory().openSession();
		try {
			Transaction tx = hibSess.beginTransaction();
			
			for (Class<?> currentClass : this.classesToCleanUp) {
				deleteTokenFrom(currentClass, hibSess);
			}
			tx.commit();
		} catch (Exception e) {
			Logger.err("Something went wrong with the TokenCleanup.");
		} finally {
			hibSess.close();
		}
		
	}
	
}