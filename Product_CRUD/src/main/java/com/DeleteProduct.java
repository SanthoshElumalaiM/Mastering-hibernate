package com;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class DeleteProduct {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Product p=em.find(Product.class, 2);
		if(p!=null)
		{
			et.begin();
			em.remove(p);
			et.commit();
			System.out.println("Data is deleted successfully");
		}
		else {
			System.out.println("Data is not found");
		}
	}

}
