package com;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Update {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Employee e=em.find(Employee.class,2);
		if(e!=null)
		{
			e.setJob("Tester");
			e.setName("Sanjay");
			et.begin();
			em.merge(e);
			et.commit();
			System.out.println("Data Updated sucessfully");
		}
		else {
			System.out.println("Data is Not Found");
		}

	}

}
