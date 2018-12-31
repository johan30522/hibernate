package com.gbm.hibernate.dao;

import java.util.List;

import com.gbm.hibernate.model.Teacher;

public interface TeacherDAO {
	
	void saveTeacher(Teacher teacher);
	
	List<Teacher> findAllTeacher();
	
	Teacher findTeacherById(Long id);
	
	void deleteTeacherById(Long id);
	
	void updateTeacher(Teacher teacher);
	
}
