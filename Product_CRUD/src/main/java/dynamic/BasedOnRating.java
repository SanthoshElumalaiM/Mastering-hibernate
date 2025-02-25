package dynamic;

import java.util.List;
import java.util.Scanner;

import com.Product;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class BasedOnRating {

	public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the rating which is consider as staring of the rating:");
		double rating=sc.nextDouble();
		
		Query q=em.createQuery("select p from Product p where rating >:r");
		q.setParameter("r", rating);
		List< Product> list=q.getResultList();
		for(Product p:list)
		{
			System.out.println(p);
		}
	}

}
