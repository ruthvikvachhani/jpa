package com.onetoone.relation.mapsid;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
public class EmployeeEntity {

	@OneToOne(cascade = CascadeType.ALL)
	@PrimaryKeyJoinColumn
	private AccountEntity account;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int employee_id;

	
	private String email;
	
	private String firstName;
	
	private String lastName;
	

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public AccountEntity getAccount() {
		return account;
	}

	public void setAccount(AccountEntity account) {
		this.account = account;
	}
	
	
}
