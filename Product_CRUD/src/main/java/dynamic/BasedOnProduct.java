package dynamic;

import java.util.List;
import java.util.Scanner;

import com.Product;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class BasedOnProduct {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter product Name:");
		String name=sc.next();
		Query q=em.createQuery("select p from Product p where p.product_name=?1");
		q.setParameter(1,name );
		
		List<Product> list=q.getResultList();
		for(Product p:list)
		{
			System.out.println(p);
		}

	}

}
