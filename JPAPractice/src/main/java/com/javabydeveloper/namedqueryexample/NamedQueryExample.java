package com.javabydeveloper.namedqueryexample;
import com.javabydeveloper.domain.*;
import javax.persistence.*;
import java.util.*;

public class NamedQueryExample {

	public static void main(String[] args) {
		EntityManagerFactory emf = null;
		EntityManager em = null;
		try {
			emf=Persistence.createEntityManagerFactory("Emp");
			em = emf.createEntityManager();
			List<Emp> empnamedquery = em.createNamedQuery("Emp.findAll").getResultList();
			for(Emp next:empnamedquery) {
				System.out.println("Employee Id: "+next.getEmpno());
				System.out.println("Employee Name: "+next.getEmpname());
			}
			
			List<Emp> emporderby = em.createNamedQuery("Emp.OrderByEmpName").getResultList();
			for(Emp next: emporderby) {
				System.out.println("Employee Id: "+next.getEmpno());
				System.out.println("Employee Name: "+next.getEmpname());
			}
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
