package com.gbm.hibernate.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="course")
public class Course implements Serializable {
	
	@Id
	@Column(name="id_course")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idCourse;
	@Column(name="name")
	private String name;
	@Column(name="proyect")
	private String proyect;
	@Column(name="themes")
	private String themes;
	
	@ManyToOne(optional=true,fetch=FetchType.EAGER)//optional indica que no es necesario para crear un curso. FetchType.EAGER fuerza el manejador a devolver los datos del teacher
	@JoinColumn(name="id_teacher")
	private Teacher teacher;

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	


	public Course(String name, String proyect, String themes) {
		super();
		this.name = name;
		this.proyect = proyect;
		this.themes = themes;
	}
	public String getProyect() {
		return proyect;
	}

	public void setProyect(String proyect) {
		this.proyect = proyect;
	}

	public String getThemes() {
		return themes;
	}

	public void setThemes(String themes) {
		this.themes = themes;
	}

	public Long getIdCourse() {
		return idCourse;
	}
	public void setIdCourse(Long idCourse) {
		this.idCourse = idCourse;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	
	
	
}
