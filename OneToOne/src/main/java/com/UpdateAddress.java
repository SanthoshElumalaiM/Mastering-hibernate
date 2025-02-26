package com;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class UpdateAddress {
	public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Address a=em.find(Address.class, 1);
		if(a!=null)
		{
			a.setCity("Tv malai");
		
			et.begin();
			em.merge(a);
			et.commit();
			System.out.println("data Updated");
		}
		else {
			System.out.println("data not found");
		}
	}

}
