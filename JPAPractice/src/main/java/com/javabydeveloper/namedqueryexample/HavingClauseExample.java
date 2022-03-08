package com.javabydeveloper.namedqueryexample;
import com.javabydeveloper.domain.*;
import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.persistence.*;
import java.util.*;

public class HavingClauseExample {

	 public static void main( String args[]) {  
         
         
         EntityManagerFactory emf = Persistence.createEntityManagerFactory( "Emp" );  
          EntityManager em = emf.createEntityManager();  
          em.getTransaction().begin( );  
            
  
CriteriaBuilder cb = em.getCriteriaBuilder();  
CriteriaQuery<Object[]> cq = cb.createQuery(Object[].class);  
Root<Emp> e = cq.from(Emp.class);  
  
cq.multiselect(e.get("empname"),cb.count(e)).groupBy(e.get("empno")).having(cb.ge(e.get("empno"), 2));  
       
System.out.print("empname");  
System.out.println("\t Count");  
List<Object[]> list = em.createQuery(cq).getResultList();  
for(Object[] object : list){  
    System.out.println(object[0] + " " + object[1]);  
  
}  
  
em.getTransaction().commit();  
          em.close();  
          emf.close();    
     }  
}
