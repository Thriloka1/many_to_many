package org.jsp.many_to_many_bi.controllers;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.many_to_many_bi.entityclasses.Subjects;

public class SaveSubjetcs {
	public static void main(String[] args) {
		EntityManager em = Persistence.createEntityManagerFactory("dev").createEntityManager();
		EntityTransaction et = em.getTransaction();

		Subjects sub = new Subjects();
		sub.setName("maths");

		et.begin();
		em.persist(sub);
		et.commit();

		System.out.println("done!");

	}
}
