package com.rjxy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rjxy.dao.StudentDao;
import com.rjxy.domian.Student;

@Component("studentService")
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentDao studentDao;

	@Override
	public List<Student> findAllStudent() {
		// TODO Auto-generated method stub
		return studentDao.findAllStudent();
	}

	@Override
	public Student getStudentBySid(Integer sid) {
		// TODO Auto-generated method stub
		return studentDao.getStudentBySid(sid);
	}

	@Override
	public int updateStudent(Student student) {
		// TODO Auto-generated method stub
		return studentDao.updStudent(student);
	}

	@Override
	public int deleteStudent(Integer sid) {
		// TODO Auto-generated method stub
		return studentDao.delStudent(sid);
	}

	@Override
	public int saveStudent(Student student) {
		// TODO Auto-generated method stub
		return studentDao.saveStudent(student);
	}

	public StudentDao getStudentDao() {
		return studentDao;
	}

	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}

	@Override
	public List<Student> findStudentByName(String sname) {
		// TODO Auto-generated method stub
		return studentDao.findStudentByName(sname);
	}

	@Override
	public List<Student> findStudentByBanji(String banji) {
		// TODO Auto-generated method stub
		return studentDao.findStudentByBanji(banji);
	}

}
