package com.farooq.DemoHibernate;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;




public class App {
	public static void main( String[] args ){

		// set the full name of student that will be stored in the data base
		StudentName fullName = new StudentName();
		fullName.setFname("Farooq");
		fullName.setMname("Tahsin");
		fullName.setLname("Qafisha");
		
		// set all information about the student
		Student saveStudent = new Student();
		saveStudent.setName(fullName);
		saveStudent.setId(2141467);
		saveStudent.setMajor("SW"); // this field will not store in the data base
		
    	Configuration con = new Configuration().configure().addAnnotatedClass(Student.class);
    	StandardServiceRegistry reg = new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
    	SessionFactory sf = con.buildSessionFactory(reg);
    	Session session = (Session) sf.openSession();
    	Transaction tx = session.beginTransaction();
    	// save the student to the data base
    	session.save(saveStudent);
        tx.commit();
        
        // fetch the student that has id=2141467 from the data base
		Student fetchStudent = null;
		fetchStudent = session.get(Student.class, 2141467);
        System.out.print(fetchStudent.toString());
        
    }
}
