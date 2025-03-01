package com;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class UpdateDepartment {

	public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Department d=em.find(Department.class, 1);
		if(d!=null)
		{
			d.setNoOfStudents(50);
			et.begin();
			em.merge(d);
			et.commit();
			System.out.println("Data Updated");
		}
		else {
			System.out.println("Department is not found");
		}
				
	}

}
