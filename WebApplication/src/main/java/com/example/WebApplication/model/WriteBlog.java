package com.example.WebApplication.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class WriteBlog {
	private String stateName;
	private String tag;
	@Id
	private String email;
	private String comment;
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	
	@Override
	public String toString() {
		return "state name"+stateName+"Tag"+tag+"Email"+email+"Comment"+comment;
	}

}
