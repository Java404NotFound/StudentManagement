package com.rjxy.action;

import java.util.List;

import javax.servlet.ServletContext;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.opensymphony.xwork2.ActionSupport;
import com.rjxy.domian.Student;

import com.rjxy.service.StudentService;

public class StudentAction extends ActionSupport {
	private Integer sid;
	private Student student;
	/**
	 * <p>首页 <p>
	 * 入参 无 
	 * <p>返回 index.jsp<p>
	 * 
	 * @return
	 */
	public String index() {
		ServletContext sc = ServletActionContext.getServletContext();
		WebApplicationContext ac = WebApplicationContextUtils.getWebApplicationContext(sc);
		StudentService studentService = (StudentService) ac.getBean("studentService");
		List<Student> findAllStudent = studentService.findAllStudent();
		ServletActionContext.getRequest().setAttribute("studetList", findAllStudent);
		return "index";
	}

	/**
	 * <p>修改 Student的准备<p>
	 *  入参 sid 返回 updateStudent.jsp
	 * 
	 * @return
	 */
	public String updStudent() {
		ServletContext sc = ServletActionContext.getServletContext();
		WebApplicationContext ac = WebApplicationContextUtils.getWebApplicationContext(sc);
		StudentService studentService = (StudentService) ac.getBean("studentService");
		Student studentBySid = studentService.getStudentBySid(sid);
		ServletActionContext.getRequest().setAttribute("student", studentBySid);
		return "toStudentUp";

	}
	
	/**
	 * <p>查询班级的所有Student<p>
	 *  入参 sid 返回 updateStudent.jsp
	 * 
	 * @return
	 */
	public String findStudentByBanji(){
		ServletContext sc = ServletActionContext.getServletContext();
		WebApplicationContext ac = WebApplicationContextUtils.getWebApplicationContext(sc);
		StudentService studentService = (StudentService) ac.getBean("studentService");
		List<Student> findStudentByBanji = studentService.findStudentByBanji(student.getBanji());
		ServletActionContext.getRequest().setAttribute("student", findStudentByBanji);
		return "tobanji";
	}

	/**
	 * <p>修改 Student <p>
	 * 入参 Student 返回 index.jsp
	 * 
	 * @return
	 */
	public String updateStudents() {
		ServletContext sc = ServletActionContext.getServletContext();
		WebApplicationContext ac = WebApplicationContextUtils.getWebApplicationContext(sc);
		StudentService studentService = (StudentService) ac.getBean("studentService");
		studentService.updateStudent(student);
		return "toindex";
	}

	/**
	 * <p>删除 Student<p>
	 *  入参 Student 返回 index.jsp
	 * 
	 * @return
	 */
	public String delStudent() {
		ServletContext sc = ServletActionContext.getServletContext();
		WebApplicationContext ac = WebApplicationContextUtils.getWebApplicationContext(sc);
		StudentService studentService = (StudentService) ac.getBean("studentService");
		studentService.deleteStudent(sid);
		return "toindex";
	}

	/**
	 * <p>根据 sid 获取Student<p>
	 *  入参 Sid 返回 toStudent.jsp
	 * 
	 * @return
	 */
	public String getStudentbyId() {
		ServletContext sc = ServletActionContext.getServletContext();
		WebApplicationContext ac = WebApplicationContextUtils.getWebApplicationContext(sc);
		StudentService studentService = (StudentService) ac.getBean("studentService");
		Student studentBySid = studentService.getStudentBySid(sid);
		ServletActionContext.getRequest().setAttribute("student", studentBySid);
		return "toStudent";
	}

	/**
	 * <p>添加Student</p>
	 * 入参 Student 返回 index.jsp
	 * 
	 * @return
	 */
	public String addStudent() {
		ServletContext sc = ServletActionContext.getServletContext();
		WebApplicationContext ac = WebApplicationContextUtils.getWebApplicationContext(sc);
		StudentService studentService = (StudentService) ac.getBean("studentService");
		studentService.saveStudent(student);
		return "toindex";

	}
	/**
	 *  <p>根据姓名模糊查询Student</p>
	 *  
	 *   入参 sname 返回 selectStudentName.jsp
	 * @return
	 */
	public String findStudentBySname() {
		ServletContext sc = ServletActionContext.getServletContext();
		WebApplicationContext ac = WebApplicationContextUtils.getWebApplicationContext(sc);
		StudentService studentService = (StudentService) ac.getBean("studentService");
		List<Student> studentByNames = studentService.findStudentByName(student.getSname());
		ServletActionContext.getRequest().setAttribute("studentByNames", studentByNames);
		return "toStudentName";
	}

	public Integer getSid() {
		return sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

}
