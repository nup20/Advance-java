import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Employee;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
		cfg.configure("hiber.cfg.xml");
		
		
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Employee id=");
		int a=sc.nextInt();
		System.out.println("Enter the Employee name=");
		String b=sc.nextLine();
		System.out.println("Enter the Employee Address=");
		String c=sc.nextLine();
		Employee s=new Employee(a,b,c);
		
		
		session.save(s);
       //session.update(s);
		//session.delete(s);
        
        
		tx.commit();
		session.close();
		
		System.out.println("Data inserted");

	}

}
