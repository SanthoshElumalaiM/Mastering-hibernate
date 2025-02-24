package Dynamic;

import java.util.List;
import java.util.Scanner;

import com.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class FetchByJob {

	public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	EntityManager em=emf.createEntityManager();
	
	Scanner s=new Scanner(System.in);
	System.out.println("Enter Your Job");
	String job=s.next();
	Query q=em.createQuery("select e from Employee e where job=:j");
	q.setParameter("j", job);
	List<Employee> l=q.getResultList();
	for(Employee e:l)
	{
	System.out.println(e);	
	}
	}

}
