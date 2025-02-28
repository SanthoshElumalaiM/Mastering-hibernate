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
		
		Person p=new Person();
		p.setName("Sant");
		p.setGender("male");
		p.setEmail("sant@gmail.com");
		p.setPhoneNo(978601163);
		
		
		AadharCard a=new AadharCard();
		
		a.setAno(368539947);
		a.setFatherName("Elumalai");
		a.setAddress("cheyyar");
		a.setDob("20/12/2002");
		a.setPerson(p);
		
		p.setAadharCard(a);
		
		et.begin();
		em.persist(a);
		em.persist(p);
		et.commit();
		System.out.println("Data Saved....");
	}

}
