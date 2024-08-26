package org.jsp.many_to_many_bi.controllers;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.many_to_many_bi.entityclasses.Students;

public class SaveStudents {
	public static void main(String[] args) {
		EntityManager em = Persistence.createEntityManagerFactory("dev").createEntityManager();
		EntityTransaction et = em.getTransaction();

		Students std = new Students();
		std.setName("raju");

		et.begin();
		em.persist(std);
		et.commit();
		em.close();
		
		System.out.println("done!");

	}
}
