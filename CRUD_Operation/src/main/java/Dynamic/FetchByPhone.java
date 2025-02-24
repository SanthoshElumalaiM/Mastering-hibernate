package Dynamic;

import java.util.Scanner;

import com.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class FetchByPhone {

	public static void main(String[] args) {
	
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter PhoneNo:");
		long phoneNo=sc.nextLong();
		Query q=em.createQuery("select e from Employee e where phoneNo=?1");
		q.setParameter(1, phoneNo);
		
		Employee e=(Employee)q.getSingleResult();
		System.out.println(e);
	}

}
