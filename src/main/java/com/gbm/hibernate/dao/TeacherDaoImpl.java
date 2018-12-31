package com.gbm.hibernate.dao;

import java.util.List;

import com.gbm.hibernate.model.Teacher;

public class TeacherDaoImpl extends SessionHibernate implements TeacherDAO {
	private SessionHibernate sessionHibernate;
	public TeacherDaoImpl() {
		sessionHibernate=new SessionHibernate();
	}

	public void saveTeacher(Teacher teacher) {

		sessionHibernate.getSession().persist(teacher);//persist permite salvar igual que save
		sessionHibernate.getSession().getTransaction().commit();
		sessionHibernate.getSession().evict(teacher);
	}

	public List<Teacher> findAllTeacher() {
		return sessionHibernate.getSession().createQuery("from Teacher").list();
	}

	public Teacher findTeacherById(Long id) {
		// TODO Auto-generated method stub
		Teacher teacher=(Teacher) sessionHibernate.getSession().createQuery("from Teacher t where t.idTeacher=" + id).uniqueResult();
		return teacher;
	}

	public void deleteTeacherById(Long id) {

		Teacher teacher=findTeacherById(id);
		sessionHibernate.getSession().delete(teacher);//persist permite salvar igual que save
		sessionHibernate.getSession().getTransaction().commit();

	}

	public void updateTeacher(Teacher teacher) {
	
		sessionHibernate.getSession().update(teacher);
		sessionHibernate.getSession().getTransaction().commit();

	}

}
