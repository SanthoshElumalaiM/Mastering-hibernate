package com;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class SaveEmployee
{

	public static void main(String[] args) 
	{
		
		Employee e=new Employee();
		e.setId(3);
		e.setName("Prabha");
		e.setJob("developer");
		e.setSal(1000);
		e.setPhoneNo(787835);
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		et.begin();
		em.persist(e);
//		em.merge(e);
			
		et.commit();
		System.out.println("data saved");
		

	}

}
