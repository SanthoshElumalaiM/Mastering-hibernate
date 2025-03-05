package com;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class MainClass {

	public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Department d1=new Department();
		d1.setDeptName("CSE");
		d1.setHod("Sukkrivan");
		d1.setNoOfStudents(45);
		d1.setFee(45000);

		Department d2=new Department();
		d2.setDeptName("IT");
		d2.setHod("Sharmila");
		d2.setNoOfStudents(20);
		d2.setFee(50000);
		
		Department d3=new Department();
		d3.setDeptName("ECE");
		d3.setHod("PremKumar");
		d3.setNoOfStudents(30);
		d3.setFee(35000);
		
		List<Department> d=new ArrayList<Department>();
		d.add(d1);
		d.add(d2);
		d.add(d3);
		
		
		
		College c=new College();
		c.setCollegeName("Apce");
		c.setLocation("Ranipet");
		c.setEmail("Apce@gmail.com");
		c.setContact(8993334);
		c.setDepartments(d);
		
		et.begin();
		em.remove(c);
		em.remove(d1);
		em.remove(d2);
		em.remove(d3);
		
//		em.persist(d1);
//		em.persist(d2);
//		em.persist(d3);
		et.commit();
		System.out.println("Data Saved...");
	}

}
