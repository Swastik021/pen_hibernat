package com.jsp.pen;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class PenSave {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("swastik");	
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		//Create a entity 1obj. employee
		Pen pen = new Pen();
		//employee.setId(1);
		//pen.setId(1);
		pen.setPencol("Black");
		pen.setTypeofpen("Gel");
		pen.setPrice(10);
		
		entityTransaction.begin();
		entityManager.persist(pen);
         entityTransaction.commit();
         

	}

}
