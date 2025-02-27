package com;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class FetchAadharCard {

	public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		
		AadharCard a=em.find(AadharCard.class, 368539947);
		
		Person p=a.getPerson();

		System.out.println(a);
		System.out.println(p);
	}

}
