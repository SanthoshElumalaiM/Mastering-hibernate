package com;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class DeletePassenger {

	public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Passengers p=em.find(Passengers.class, 3);
		if(p!=null)
		{
			et.begin();
			em.remove(p);
			et.commit();
			System.out.println("Data deleted");
		}
		else {
			System.out.println("Data Not Found");
		}

	}

}
