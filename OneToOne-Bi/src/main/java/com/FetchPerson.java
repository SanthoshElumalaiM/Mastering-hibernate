package com;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class FetchPerson {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		
		Person p=em.find(Person.class, 1);
		
		AadharCard a=p.getAadharCard();
		System.out.println(p);
		System.out.println(a);

	}

}
