package org.jsp.many_to_many_bi.entityclasses;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.Data;
@Entity
@Data
public class Subjects {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	private int id;
	private String name;
	@ManyToMany
	private List<Students> students;
}