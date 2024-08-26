package org.jsp.many_to_many_bi.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.many_to_many_bi.entityclasses.Students;
import org.jsp.many_to_many_bi.entityclasses.Subjects;

public class Map_Students_To_Subjects {
	public static void main(String[] args) {
		EntityManager em = Persistence.createEntityManagerFactory("dev").createEntityManager();
		EntityTransaction et = em.getTransaction();

		Subjects sub1 = em.find(Subjects.class, 1);

		Students std1 = em.find(Students.class, 1);

		List<Students> stl1 = sub1.getStudents();
		ArrayList<Students> al1 = new ArrayList<Students>(stl1);
		al1.add(std1);

		sub1.setStudents(al1);
		et.begin();
		em.merge(sub1);
		et.commit();

		System.out.println("done!...");
	}
}
