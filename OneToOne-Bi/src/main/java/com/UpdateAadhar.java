package com;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class UpdateAadhar {

	public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		AadharCard a=em.find(AadharCard.class, 368539947);
		
		if(a!=null)
		{
			a.setAddress("cheyyar");
			et.begin();
			em.merge(a);
			et.commit();
			System.out.println("Date Updated...");
		}
		else {
			System.out.println("Date Not Found...");
		}
	}

}
