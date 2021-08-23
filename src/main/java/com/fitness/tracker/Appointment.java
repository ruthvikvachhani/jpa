package com.fitness.tracker;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Appointment implements Serializable {

	private static final long serialVersionUID = -6790693372846798580L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@ManyToOne
	private UserEntity user;

	private package_name package_name;
	private Integer session_per_week;
	private Integer price_per_session;
	private char tranier_prefrence;
	private boolean physio_required;
	private Integer no_of_weeks;
	private float total_amount;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public UserEntity getUser() {
		return user;
	}
	public void setUser(UserEntity user) {
		this.user = user;
	}
	public package_name getPackage_name() {
		return package_name;
	}
	public void setPackage_name(package_name package_name) {
		this.package_name = package_name;
	}
	public Integer getSession_per_week() {
		return session_per_week;
	}
	public void setSession_per_week(Integer session_per_week) {
		this.session_per_week = session_per_week;
	}
	public Integer getPrice_per_session() {
		return price_per_session;
	}
	public void setPrice_per_session(Integer price_per_session) {
		this.price_per_session = price_per_session;
	}
	public char getTranier_prefrence() {
		return tranier_prefrence;
	}
	public void setTranier_prefrence(char tranier_prefrence) {
		this.tranier_prefrence = tranier_prefrence;
	}
	public boolean isPhysio_required() {
		return physio_required;
	}
	public void setPhysio_required(boolean physio_required) {
		this.physio_required = physio_required;
	}
	public Integer getNo_of_weeks() {
		return no_of_weeks;
	}
	public void setNo_of_weeks(Integer no_of_weeks) {
		this.no_of_weeks = no_of_weeks;
	}
	public float getTotal_amount() {
		return total_amount;
	}
	public void setTotal_amount() {
		this.total_amount = this.price_per_session*this.session_per_week*this.no_of_weeks;
	}
	
	
}
