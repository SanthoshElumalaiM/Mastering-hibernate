package Dynamic;

import java.util.List;
import java.util.Scanner;

import com.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class FetchBySal {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Starting Salary:");
		double start=sc.nextDouble();
		
		System.out.println("Enter The Ending Salary:");
		double end=sc.nextDouble();
		
		Query q=em.createQuery("select e from Employee e where e.sal between ?1 and ?2");
		q.setParameter(1, start);
		q.setParameter(2, end);
		
		List<Employee> list=(List<Employee>)q.getResultList();
		for(Employee e:list)
		{
			System.out.println(e);
		}

	}

}
