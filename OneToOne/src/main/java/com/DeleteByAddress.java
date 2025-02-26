package com;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class DeleteByAddress {

	public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Address a=em.find(Address.class, 1);
		
		if(a!=null)
		{
			et.begin();
			em.remove(a);
			et.commit();
			System.out.println("Data Deleted");
		}
		else {
			System.out.println("Data Not found");
		}
	}
	
}
