package com.rjxy.service;

import java.util.List;

import com.rjxy.domian.Student;

public interface StudentService {
	/**
	 * 查询所有Student
	 * 
	 * @return
	 */
	public List<Student> findAllStudent();
	/**
	 * 根据班级名查询所有的Student
	 * 
	 * @return
	 */
	public List<Student> findStudentByBanji(String banji);
	

	/**
	 * 根据sid 查询Student
	 * 
	 * @return
	 */
	public Student getStudentBySid(Integer sid);

	/**
	 * 更新Student
	 * 
	 * @return
	 */
	public int updateStudent(Student student);

	/**
	 * 删除Student
	 * 
	 * @return
	 */
	public int deleteStudent(Integer sid);

	/**
	 * 根据sname模糊查询Student
	 * 
	 * @return
	 */
	public List<Student> findStudentByName(String sname);

	/**
	 * 增加Student
	 * 
	 * @return
	 */
	public int saveStudent(Student student);
}
