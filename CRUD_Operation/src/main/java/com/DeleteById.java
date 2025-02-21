package com;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class DeleteById {

	public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Employee e=em.find(Employee.class, 2);
		if(e!=null) {
			et.begin();
			em.remove(e);
			et.commit();
			System.out.println("Data is Deleted...");
		}
		else {
			System.out.println("Data is Not Found..");
		}

	}

}
