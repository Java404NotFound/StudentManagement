package com.rjxy.dao;

import java.util.List;

import com.rjxy.domian.Student;

public interface StudentDao {
	public List<Student> findAllStudent();

	public Student getStudentBySid(Integer sid);

	public int updStudent(Student student);

	public int delStudent(Integer sid);

	public int saveStudent(Student student);

	public List<Student> findStudentByName(String sname);

	public List<Student> findStudentByBanji(String banji);

}
