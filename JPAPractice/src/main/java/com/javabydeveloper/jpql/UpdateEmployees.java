package com.javabydeveloper.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class UpdateEmployees {
	public static void main(String args[])
	{
		try
		{
			EntityManagerFactory emf =Persistence.createEntityManagerFactory("Emp");
			EntityManager em =emf.createEntityManager();
	 
             em.getTransaction().begin();
				Query query = em.createQuery("update Emp set empname=Smita where empno=1");
                  query.executeUpdate();
                  em.getTransaction().commit();
                  em.close();
                  emf.close();
                  System.out.println("Recorde updated succesfully");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
