package com.SpringBootWithMongoDb;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author Atul A121
 *
 */
@Document(collection = "Users")
public class Users {
	public String email;
	public String telephone;
	public String userName;
	public String timePreference;
	public boolean subscribe;
	
	public Users(String email, String telephone, String userName, String timePreference, boolean subscribe) {
		super();
		this.email = email;
		this.telephone = telephone;
		this.userName = userName;
		this.timePreference = timePreference;
		this.subscribe = subscribe;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getTimePreference() {
		return timePreference;
	}
	public void setTimePreference(String timePreference) {
		this.timePreference = timePreference;
	}
	public boolean isSubscribe() {
		return subscribe;
	}
	public void setSubscribe(boolean subscribe) {
		this.subscribe = subscribe;
	}
	@Override
	public String toString() {
		return "Users [email=" + email + ", telephone=" + telephone + ", userName=" + userName + ", timePreference="
				+ timePreference + ", subscribe=" + subscribe + "]";
	}
	
}
