package com;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class DeleDepartment {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		College c=em.find(College.class, 1);
		if(c!=null)
		{
			List<Department> list=c.getDepartments();
			Department d=em.find(Department.class, 4);
			list.remove(d);
			
			et.begin();
			em.merge(c);
			em.remove(d);
			et.commit();
			System.out.println("Department 4 is deleted");
		}
		else
		{
			System.out.println("College is not found");
		}
	}

}
