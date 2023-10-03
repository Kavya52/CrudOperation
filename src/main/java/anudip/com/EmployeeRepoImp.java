package anudip.com;
import java.util.Iterator;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class EmployeeRepoImp implements EmployeeRepo
{
	StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("Hibernate.config.xml").build();
	Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();
	
	SessionFactory sfactory=meta.buildSessionFactory();

	//insertion
	
	public void insertEmployee(Employee e)
	
	{
		Session session = sfactory.openSession();
		org.hibernate.Transaction transaction = session.beginTransaction();
		session.save(e);
		transaction.commit();
		
	}
    //updation
	
	public void updateEmployee(Employee e)
	{
		Session session = sfactory.openSession();
		org.hibernate.Transaction transaction = session.beginTransaction();
	    session.save(e);
		transaction.commit();
		
	}

	//selecting the values
	
	public void selectEmployee() 
	{
		Session session = sfactory.openSession();
		Query q = session.createQuery("from Employee");
		List<Employee> list = q.getResultList();
		Iterator<Employee> i = list.iterator();
		while(i.hasNext())
			System.out.println(i.next());
		
		//fetching names from Employee
		Query q1 = session.createQuery("select ename from Employee");
		List<Employee> names = q1.getResultList();
		Iterator<Employee> itr = names.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
		//count of names
		Query q2 = session.createQuery("select count(ename) from Employee ");
		List<Integer> count = q1.getResultList();
		Iterator<Integer> itr1 = count.iterator();
			System.out.println("Records updated"+count);
			
			//max function
		Query q3 = session.createQuery("select max(age) from Employee");
		List<Integer> a = q3.getResultList();
		Iterator<Integer> itr2 = a.iterator();
		System.out.println("Maximum age of Employee is "+a);
		
		//min function
		Query q4 = session.createQuery("select min(age) from Employee");
		List<Integer> b = q4.getResultList();
		Iterator<Integer> itr3 = b.iterator();
		System.out.println("Minimum age of Employee is "+b);
		
		//average function
		Query q5 = session.createQuery("select avg(age) from Employee");
		List<Integer> c = q5.getResultList();
		Iterator<Integer> itr4 = c.iterator();
		System.out.println("Average age of Employee is "+c);
	}
	
	//deletion
	
	public void deleteEmployee(Employee e) 
	{
		Session session = sfactory.openSession();
		org.hibernate.Transaction transaction = session.beginTransaction();
		session.save(e);
		transaction.commit();
		
	}
}


