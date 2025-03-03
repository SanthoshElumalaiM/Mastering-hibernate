package com;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class UpdatePassengers {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Passengers p=em.find(Passengers.class, 2);
		if(p!=null)
		{
			p.setPhoneNo(45282);
			et.begin();
			em.merge(p);
			et.commit();
			System.out.println("Data updated");
		}
		else {
			System.out.println("Data is not Found");
		}
	}

}
