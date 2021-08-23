package com.fitness.tracker;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.Period;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class UserEntity implements Serializable{
	
	private static final long serialVersionUID = -1798070786993154676L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer user_id;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="ID")
	private Set<Appointment> appointment;
	
	private String user_name;
	private LocalDate DOB;
	private Integer age;
	private String email;
	private long phone_no;
	private String address_line_1;
	private String address_line_2;
	private String city;
	private String state;
	private String country;
	private int pincode;
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public Set<Appointment> getAppointment() {
		return appointment;
	}
	public void setAppointment(Set<Appointment> appointment) {
		this.appointment = appointment;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public LocalDate getDOB() {
		return DOB;
	}
	public void setDOB(LocalDate dOB) {
		DOB = dOB;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhone_no() {
		return phone_no;
	}
	public void setPhone_no(long phone_no) {
		this.phone_no = phone_no;
	}
	public String getAddress_line_1() {
		return address_line_1;
	}
	public void setAddress_line_1(String address_line_1) {
		this.address_line_1 = address_line_1;
	}
	public String getAddress_line_2() {
		return address_line_2;
	}
	public void setAddress_line_2(String address_line_2) {
		this.address_line_2 = address_line_2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public Integer getAge() {
		return age;
	}

	public void setAge() {
		this.age = Period.between(this.DOB,LocalDate.now()).getYears();
	}
}
