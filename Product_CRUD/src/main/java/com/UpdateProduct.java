package com;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class UpdateProduct {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Product p=em.find(Product.class, 1);
		if(p!=null)
		{
			et.begin();
			p.setQuantity(10);
			p.setRating(2.5);
			p.setPrice(14999);
			em.merge(p);
			et.commit();
			System.out.println("Data Updated Successfully");
		}
		else {
			System.out.println("Data is not present");
		}

	}

}
