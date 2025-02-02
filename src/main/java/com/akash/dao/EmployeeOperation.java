package com.akash.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;

import com.akash.config.ReadCFGConfig;
import com.akash.entity.Employee;

public class EmployeeOperation {

	SessionFactory sessionFactory;

	public String saveEmployee(Employee emp) {
		String message;
		Session session = null;
		try {
			sessionFactory = ReadCFGConfig.readXMLFileGiveSessionFactroyObj();

			session = sessionFactory.openSession();

			Transaction transaction = session.beginTransaction();

			session.save(emp);

			transaction.commit();

			message = "data saved";

		} catch (Exception e) {

			e.printStackTrace();

			message = "something goining to be wrong";
		} finally {

			session.close();
		}

		return message;
	}

	public Employee getEmployee(int id) {
		Employee employee = null;
//		Session session = null ;
		try {
			sessionFactory = ReadCFGConfig.readXMLFileGiveSessionFactroyObj();

			Session session = sessionFactory.openSession();

			employee = session.get(Employee.class, id);

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(" record not found ");
		}

//		finally {
//			session.close();
//		}
		return employee;
	}

	public List<Employee> getAllEmployee() {
		List<Employee> list = null;
		Session session = null;
		try {
			sessionFactory = ReadCFGConfig.readXMLFileGiveSessionFactroyObj();

			session = sessionFactory.openSession();
			Criteria criteria = session.createCriteria(Employee.class);
			list = criteria.list();

		} catch (Exception e) {
			e.printStackTrace();
		}

//		finally {
//			session.close();
//		}
		return list;
	}

	// let use Restriction and Project in this method
	// -------------------------------------------
//	Session session = openSession();
//	
//	User user = (User) session.get( User.class, id );

//	Query query = session.createQuery( "SELECT u FROM User u WHERE u.id=:id" );
//	query.setParameter( "id", id );
//	User user = (User) query.uniqueResult();

//	User user = (User) session.createCriteria( User.class )
//			.add( Restrictions.eq( "id", id ) )
//			.uniqueResult();

//	Hibernate.initialize( user.getTools() );
//	Hibernate.initialize( user.getSkills() );
//	
//	session.close();
//	
//	return user;
//}
	public Employee myMethod(String id) {
		Employee employee = null;
		sessionFactory = ReadCFGConfig.readXMLFileGiveSessionFactroyObj();
		Session session = sessionFactory.openSession();
		employee = session.get(Employee.class, id);

		Query query = session.createQuery("SELECT e FROM Employee e WHERE e.empId=: empId");
		query.setParameter("empId", id);
		employee = (Employee) query.uniqueResult();

		employee = (Employee) session.createCriteria(Employee.class).add(Restrictions.eq("empId", id)).uniqueResult();
//
//		List<Employee> value=(List<Employee>) session.createCriteria(Employee.class).setProjection(Projections.sum("empSalary"));
//		System.out.println(value.getFirst());
		return employee;

	}
}
