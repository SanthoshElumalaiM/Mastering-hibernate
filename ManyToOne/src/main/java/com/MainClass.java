package com;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class MainClass {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Train t=new Train();
		t.setName("Chennai Express");
		t.setArrival("Chennai Central");
		t.setDeparture("kanchipuram");
		t.setTiming("7.00am");
		
		Passengers p1=new Passengers();
		p1.setName("Sant");
		p1.setGender("male");
		p1.setAge(22);
		p1.setEmail("sant@gmail.com");
		p1.setPhoneNo(978689);
		p1.setTrain(t);
		
		
		Passengers p2=new Passengers();
		p2.setName("Suresh");
		p2.setGender("male");
		p2.setAge(23);
		p2.setEmail("suresh@gmail.com");
		p2.setPhoneNo(978689);
		p2.setTrain(t);
		
		Passengers p3=new Passengers();
		p3.setName("prabha");
		p3.setGender("male");
		p3.setAge(22);
		p3.setEmail("prabha@gmail.com");
		p3.setPhoneNo(978689);
		p3.setTrain(t);

		et.begin();
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.persist(t);
		et.commit();
		System.out.println("data saved.");
		
		
	}

}
