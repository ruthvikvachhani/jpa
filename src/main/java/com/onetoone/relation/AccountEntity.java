package com.onetoone.relation;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class AccountEntity {
	
	@OneToOne(mappedBy = "account")
	private EmployeeEntity employee;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int account_id;
	
	private String accountNumber;
	

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	
}
