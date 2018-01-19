package com.rjxy.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate5.HibernateCallback;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.rjxy.domian.Student;

public class StudentDaoImpl extends HibernateDaoSupport implements StudentDao {
	@Override
	public List<Student> findAllStudent() {
		// Criteria
		DetachedCriteria dc = DetachedCriteria.forClass(Student.class);
		@SuppressWarnings("unchecked")
		List<Student> list = (List<Student>) getHibernateTemplate().findByCriteria(dc);
		return list;
	}

	@Override
	public Student getStudentBySid(final Integer sid) {
		// TODO Auto-generated method stub
		return getHibernateTemplate().execute(new HibernateCallback<Student>() {
			@Override
			public Student doInHibernate(Session session) throws HibernateException {
				String hql = "from Student where sid = ?";
				Query query = session.createQuery(hql);
				query.setParameter(0, sid);
				List list = query.list();
				if (list != null) {
					return (Student) list.get(0);
				}
				return null;
			}
		});
	}

	@Override
	public int updStudent(Student student) {
		getHibernateTemplate().update(student);
		return 0;
	}

	@Override
	public int delStudent(Integer sid) {
		Student student = this.getStudentBySid(sid);
		getHibernateTemplate().delete(student);
		return 0;
	}

	@Override
	public int saveStudent(Student student) {
		getHibernateTemplate().save(student);
		return 0;
	}

	@Override
	public List<Student> findStudentByName(final String sname) {

		return getHibernateTemplate().execute(new HibernateCallback<List<Student>>() {

			@SuppressWarnings("unchecked")
			@Override
			public List<Student> doInHibernate(Session arg0) throws HibernateException {
				String hql = "from Student  where sname like '%" + sname + "%'";
				Query query = arg0.createQuery(hql);
				return query.list();
			}
		});
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<Student> findStudentByBanji(final String banji) {
		// TODO Auto-generated method stub
		return getHibernateTemplate().execute(new HibernateCallback<List<Student>>() {
			@Override
			public List<Student> doInHibernate(Session session) throws HibernateException {
				String hql = "from Student where banji like ?";
				Query query = session.createQuery(hql);
				query.setParameter(0, banji);
				List list = query.list();
				return list;
			}
		});
	}
}
