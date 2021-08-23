package com.fitness.tracker;


import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;



public class TestHibernate {
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		
		UserEntity user = new UserEntity();
		user.setDOB(LocalDate.of(1999, 12, 31));
		user.setUser_name("Ruthvik");
		user.setAge();
		user.setEmail("rutvikvachhani718@gmail.com");
		user.setPhone_no(1234567890);
		user.setAddress_line_1("A/9,G-3,yashasvi nagar");
		user.setAddress_line_2("dhokali road,pipeline,thane");
		user.setPincode(300601);
		user.setCity("thane");
		user.setState("maharashtra");
		user.setCountry("india");
		
		
		Appointment amp = new Appointment();

		amp.setPackage_name(package_name.five_Session_per_week);
		amp.setSession_per_week(5);
		amp.setPrice_per_session(300);
		amp.setTranier_prefrence('M');
		amp.setPhysio_required(true);
		amp.setNo_of_weeks(3);
		amp.setTotal_amount();
		
		Appointment amp1 = new Appointment();

		amp1.setPackage_name(package_name.four_Session_per_week);
		amp1.setSession_per_week(4);
		amp1.setPrice_per_session(400);
		amp1.setTranier_prefrence('F');
		amp1.setPhysio_required(false);
		amp1.setNo_of_weeks(4);
		amp1.setTotal_amount();
		
		Set<Appointment> userAppointment = new HashSet<Appointment>();
		userAppointment.add(amp);
		userAppointment.add(amp1);
		
		user.setAppointment(userAppointment);
		
		session.saveOrUpdate(user);
		
		session.getTransaction().commit();
		HibernateUtil.shutdown();
	}
}
