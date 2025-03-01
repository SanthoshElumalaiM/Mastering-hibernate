package com;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class AddDepartment {

	public static void main(String[] args) {
	
		EntityManagerFactory emf =Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		College c=em.find(College.class, 1);
		
		if(c!=null)
		{
			List<Department> list= c.getDepartments();
			
			Department d=new Department();
			
			d.setDeptName("ECE");
			d.setHod("Murugan");
			d.setNoOfStudents(25);
			d.setFee(40000);
		
			list.add(d);
			
			et.begin();
			em.persist(d);
			em.merge(c);
			et.commit();
			System.out.println("Data Saved");
		}
		else {
			System.out.println("college is Not Found");
		}
	}

}
