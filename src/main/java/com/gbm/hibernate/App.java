package com.gbm.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.gbm.hibernate.dao.TeacherDaoImpl;
import com.gbm.hibernate.model.Course;
import com.gbm.hibernate.model.Teacher;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
	{
		try {

			//Teacher teacher=new Teacher("Randy", "avatar2");
			

			TeacherDaoImpl teacherDaoImpl= new TeacherDaoImpl();
			//teacherDaoImpl.saveTeacher(teacher);
			//teacher.setName("Max");
			Teacher teacher2=teacherDaoImpl.findTeacherById(1L);
			teacher2.setName("johan");
			teacherDaoImpl.updateTeacher(teacher2);
			//List<Teacher> teachers=teacherDaoImpl.findAllTeacher();

			/*for (Teacher t : teachers) {
				System.out.println(t.getName());
			}*/
			//Long id=4L;
			//teacherDaoImpl.deleteTeacherById(id);
	


		} catch (Exception e) {

			// TODO: handle exception
			e.printStackTrace();
		}


	}
}
