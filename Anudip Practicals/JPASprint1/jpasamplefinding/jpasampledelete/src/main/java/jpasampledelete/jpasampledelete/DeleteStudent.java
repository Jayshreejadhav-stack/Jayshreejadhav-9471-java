package jpasampledelete.jpasampledelete;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import jpasampledelete.jpasampledelete.entity.StudentEntity;

public class DeleteStudent {  
   
public static void main(String args[])  
 {  
 EntityManagerFactory emf=Persistence.createEntityManagerFactory("Student_details");  
 EntityManager em=emf.createEntityManager();  
 em.getTransaction().begin();  
   
 StudentEntity s=em.find(StudentEntity.class,102);
 
 System.out.println("Before Deletion");  
 System.out.println("Student id = "+s.getS_id());  
 System.out.println("Student Name = "+s.getS_name());  
 System.out.println("Student Age = "+s.getS_age()); 

 em.remove(102); 
 em.getTransaction().commit();  
 emf.close();  
 em.close();  
            
 System.out.println("After Deletion");  
 System.out.println("Student id = "+s.getS_id());  
 System.out.println("Student Name = "+s.getS_name());  
 System.out.println("Student Age = "+s.getS_age());  
   

 }  
}

