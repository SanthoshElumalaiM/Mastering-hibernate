package dynamic;

import java.util.List;
import java.util.Scanner;

import com.Product;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class PriceRange {

	public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter starting price:");
		int start=sc.nextInt();
		System.out.print("Enter Ending price:");
		int end=sc.nextInt();
		Query q=em.createQuery("select p from Product p where p.price between :s and :e ");
		q.setParameter("s", start);
		q.setParameter("e", end);
		List<Product> list=q.getResultList();
		for(Product p:list)
		{
			System.out.println(p);
		}
			
	}

}
