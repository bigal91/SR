package model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class User implements ITokenable{
	private String userName;
	
	private String userPassword;
	
	private String userMail;

	private Token token;
	
	public User(){
		// -- 
	}
	
	public User(String userName, String userPassword, String userMail){
		this.userName = userName;
		this.userPassword = userPassword;
		this.userMail = userMail;
	}
	
	@Id
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserMail() {
		return userMail;
	}

	public void setUserMail(String userMail) {
		this.userMail = userMail;
	}

	/**
	 * Gets the token of the user
	 * 
	 * @return the Token Object for this user
	 */
	@Override
	@OneToOne(cascade = CascadeType.ALL)
	public Token getToken() {
		return token;
	}

	/**
	 * Sets the Token of the User
	 * 
	 * @param token - the Token Object to set
	 */
	@Override
	public void setToken(Token token) {
		this.token = token;
	}
}
