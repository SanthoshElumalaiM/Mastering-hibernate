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
		
		Address a=new Address();
		a.setStreet("padasalai Street");
		a.setCity("cheyyar");
		a.setState("Tamilnadu");
		a.setPincode(604402);
		
		Person p=new Person();
		p.setName("sant");
		p.setGender("male");
		p.setEmail("sant@gmail.com");
		p.setPhone(7895544);
		p.setAddress(a);
	
		et.begin();
		em.persist(a);
		em.persist(p);
		et.commit();
		
		System.out.println("data saved..");
		

	}

}
