package dynamic;

import java.util.List;
import java.util.Scanner;

import com.Product;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class LowToHigh {

	public static void main(String[] args) {

		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		
		
		Query q=em.createQuery("select p from Product p order by p.price  ");
		 
		List<Product> list=q.getResultList();
		for(Product p:list)
		{
			System.out.println(p);
		}
			
	}

}
