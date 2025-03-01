package com;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class UpdateCollege {

	public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em =emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		College c=em.find(College.class, 1);
		if(c!=null)
		{
			c.setCollegeName("APCE");
			et.begin();
			em.merge(c);
			et.commit();
			System.out.println("Data Updated Successfully");
		}
		else {
			System.out.println("College is Not found");
		}
	}

}
