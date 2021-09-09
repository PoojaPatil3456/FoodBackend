package com.example.WebApplication.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Blog {

		@Id
		private int userID;
		private String userName;
		private String password;
		private String userEmail;
		
		public int getUserID() {
			return userID;
		}
		public void setUserID(int userID) {
			this.userID = userID;
		}
		
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		
		public String getUserEmail() {
			return userEmail;
		}
		public void setUserEmail(String userEmail) {
			this.userEmail = userEmail;
		}
		
		@Override
		public String toString() {
			
			return "User ID:"+userID+"User Name:"+userName+"Password"+password+"Email:"+userEmail;
		}
}
