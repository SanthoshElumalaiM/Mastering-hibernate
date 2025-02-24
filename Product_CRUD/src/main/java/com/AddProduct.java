package com;

import java.util.Scanner;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence; 

public class AddProduct {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Product p=new Product();
		System.out.println("Enter ID");
		p.setProduct_id(sc.nextInt());
		System.out.println("Enter ProductName");
		p.setProduct_name(sc.next());
		System.out.println("Enter Brand");
		p.setBrand(sc.next());
		System.out.println("Enter Color");
		p.setColour(sc.next());
		System.out.println("Enter price");
		p.setPrice(sc.nextDouble());
		System.out.println("Enter Quantity");
		p.setQuantity(sc.nextInt());
		System.out.println("Enter rating");
		p.setRating(sc.nextDouble());
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		em.persist(p);
		et.commit();
		System.out.println("Product Added Successfully.........");
	}

}
