package com.demo.jpaMapMapping;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.demo.jpaMapMapping.entity.Address;
import com.demo.jpaMapMapping.entity.Employee;

public class MapMapping {
    public static void main( String[] args ){
    	EntityManagerFactory emf=Persistence.createEntityManagerFactory("Collection_Types");  
	    EntityManager em=emf.createEntityManager();  
	    em.getTransaction().begin();  
	 
	   Address a1 =new Address(400401, "Noida", "Uttar Pradesh");   
	   Employee e1= new Employee("Vijay");
	   e1.getAddress().put(1, a1);
	   
	   Address a2 =new Address(403331, "Jaipur", "Rajasthan");
	   Employee e2 = new Employee("John");
	   e2.getAddress().put(2, a2);
//	   e2.getAddress().
	   
	   
	   
	    
		em.persist(e1);  
		em.persist(e2);  	      
		em.getTransaction().commit();  
		  
		em.close();  
		emf.close();
    }
}