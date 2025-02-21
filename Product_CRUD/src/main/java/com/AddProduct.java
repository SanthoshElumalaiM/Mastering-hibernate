package com;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence; 

public class AddProduct {

	public static void main(String[] args) {
		
		Product p=new Product();
		p.setProduct_id(1);
		p.setProduct_name("laptop");
		p.setBrand("lenovo");
		p.setColour("black");
		p.setPrice(18927);
		p.setQuantity(1);
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		em.persist(p);
		et.commit();
		System.out.println("Product Added Successfully.........");
	}

}
