package com;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class FetchUsingLike {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		
		Query q=em.createQuery("select e from Employee e where e.name like 's%'");
		List<Employee> list=(List<Employee>)q.getResultList();
		for(Employee e: list)
		{
			System.out.println(e);
		}
	}

}
