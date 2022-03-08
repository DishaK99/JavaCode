package com.javabydeveloper;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.javabydeveloper.domain.Emp;
 

/**
 * JPA Hello world!
 *
 */
public class DeleteEmployee {

	public static void main(String[] args) {

		try {
		EntityManagerFactory emf =Persistence.createEntityManagerFactory("Emp");
		EntityManager em =emf.createEntityManager();
 

			Query q = em.createQuery("select e from Emp e");

			List<Emp> resultList = q.getResultList();
			System.out.println("num of employees:" + resultList.size());
			
			System.out.println("Before insert of list of Employee's:");
			for (Emp next : resultList) {
				System.out.println("Employee:No " + next.getEmpno());
				System.out.println("Employee:Name " + next.getEmpname());
			}
			
			em.getTransaction().begin();
			//int empno=1;
			Emp emp1=(Emp)em.find(Emp.class, 1);
			em.remove(emp1);
			em.getTransaction().commit();
			
			
			Query q1 = em.createQuery("select e from Emp e");

			List<Emp> resultList1 = q1.getResultList();
			
			
			System.out.println("After insert of list of Employee's:");
			for (Emp next : resultList) {
				System.out.println("Employee:No " + next.getEmpno());
				System.out.println("Employee:Name " + next.getEmpname());
			}
			
			emf.close();
			em.clear();

		} catch (Exception e) {
			System.out.println(e); 
		}  
	}
}
