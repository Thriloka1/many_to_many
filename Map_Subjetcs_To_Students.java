package org.jsp.many_to_many_bi.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.many_to_many_bi.entityclasses.Students;
import org.jsp.many_to_many_bi.entityclasses.Subjects;

public class Map_Subjetcs_To_Students {
	public static void main(String[] args) {
		EntityManager em = Persistence.createEntityManagerFactory("dev").createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Students std5 = em.find(Students.class, 5);
		Students std6 = em.find(Students.class, 6);
		Students std7 = em.find(Students.class, 7);
		Students std8 = em.find(Students.class, 8);
		
		Subjects sub5 = em.find(Subjects.class, 5);
		Subjects sub6 = em.find(Subjects.class, 6);
		Subjects sub7 = em.find(Subjects.class, 7);
		Subjects sub8 = em.find(Subjects.class, 8);
		
		List<Subjects> sub51 = std5.getSubjects();
		ArrayList<Subjects> al51=new ArrayList<Subjects>(sub51);
		al51.add(sub5);
		al51.add(sub6);
		al51.add(sub7);
		al51.add(sub8);
		
		std5.setSubjects(al51);
		et.begin();
		em.merge(std5);
		et.commit();
		
		//2
		List<Subjects> sub61 = std6.getSubjects();
		ArrayList<Subjects> al61=new ArrayList<Subjects>(sub61);
		al61.add(sub5);
		al61.add(sub6);
		al61.add(sub7);
		al61.add(sub8);
		
		std6.setSubjects(al61);
		et.begin();
		em.merge(std6);
		et.commit();
		
		//3
		List<Subjects> sub71 = std7.getSubjects();
		ArrayList<Subjects> al71=new ArrayList<Subjects>(sub71);
		al71.add(sub5);
		al71.add(sub6);
		al71.add(sub7);
		al71.add(sub8);
		
		std7.setSubjects(al71);
		et.begin();
		em.merge(std7);
		et.commit();
		
		//4
		List<Subjects> sub81 = std8.getSubjects();
		ArrayList<Subjects> al81=new ArrayList<Subjects>(sub81);
		al81.add(sub5);
		al81.add(sub6);
		al81.add(sub7);
		al81.add(sub8);
		
		std8.setSubjects(al81);
		et.begin();
		em.merge(std8);
		et.commit();
		em.close();
		System.out.println("done!...");
	}
}
