package com;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Mainclass {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Batch b=new Batch();
		
		b.setBcode("M7");
		b.setSubject("java");
		b.setTrainer("tabrez");
		b.setTiming("10:00am");
		b.setNoOfStudents(70);
		
		Student s1=new Student();
		s1.setName("sant");
		s1.setGender("male");
		s1.setAge(22);
		s1.setEmail("sant@gmail.com");
		s1.setPhoneNo(978678);
		s1.setBatch(b);
		
		Student s2=new Student();
		s2.setName("sursh");
		s2.setGender("male");
		s2.setAge(23);
		s2.setEmail("suresh@gmail.com");
		s2.setPhoneNo(93978);
		s2.setBatch(b);
		
		Student s3=new Student();
		s3.setName("prabha");
		s3.setGender("male");
		s3.setAge(22);
		s3.setEmail("prabha@gmail.com");
		s3.setPhoneNo(9398);
		
		s3.setBatch(b);
		
		List<Student> st=new ArrayList<Student>();
		
		st.add(s1);
		st.add(s2);
		st.add(s3);
		
		b.setStudents(st);
		
		et.begin();
		
		em.persist(s1);
		em.persist(s2);
		em.persist(s3);
		em.persist(b);
		et.commit();
		
		System.out.println("Data saved");
		
		

	}

}
