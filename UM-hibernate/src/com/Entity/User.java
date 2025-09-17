package com.Entity;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import com.Enums.Role;

public class User {

	private int uid;

	@Column(nullable = false, length = 20)
	private String uname;

	private String email;

	private String pwd;

	private int age;

	@Column(updatable = false, insertable = false)
	private boolean isIndian;

	@Column(updatable = false, insertable = false)
	private String cmpName;

	@Enumerated(EnumType.STRING)
	private Role role;
	
	@Enumerated(EnumType.STRING)
	private AccountStatus status;
	
	
	
	public Role getRole() {
		return role;
	}



	public void setRole(Role role) {
		this.role = role;
	}



	public AccountStatus getStatus() {
		return status;
	}



	public void setStatus(AccountStatus status) {
		this.status = status;
	}



	public static void main(String[] args) {
		User user = new User();
		user.setRole(Role.Manager);
		user.setStatus(AccountStatus.Active);
	}

}
