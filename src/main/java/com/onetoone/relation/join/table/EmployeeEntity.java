package com.onetoone.relation.join.table;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;

@Entity
public class EmployeeEntity {

	@OneToOne(cascade = CascadeType.ALL)
	@JoinTable(name="EMPLOYEE_ACCOUNT",joinColumns = @JoinColumn(name="EMPLOYEE_ID"),
	inverseJoinColumns = @JoinColumn(name="ACCOUNT_ID"))
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
