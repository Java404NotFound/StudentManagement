package com.rjxy.dao;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.rjxy.domian.Student;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TsetStudentDao {
	@Autowired
	private StudentDao studentDao;

	@Test
	public void testfindCustomLisSixe() {
		List<Student> findAllStudent = studentDao.findAllStudent();
		System.out.println("------");
		for (Student s : findAllStudent) {
			System.out.println("------");
			System.out.println(s.getAge());
		}
	}

	@Test
	public void testfindCustomLisSixe2() {
		Student student = studentDao.getStudentBySid(1);
		System.out.println(student);
	}

	public StudentDao getStudentDao() {
		return studentDao;
	}

	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}

}
