package anudip.com;

import java.util.List;

import javax.persistence.Query;

public class Main 
{

	public static void main(String[] args) 
	{
        EmployeeRepo employee= new EmployeeRepoImp();
		//creating objects and assigning values
		Employee e1 = new Employee();
	
		e1.setEname("Akhila");
		e1.setAge(21);
		e1.setExp(5);
		employee.insertEmployee(e1);
		
		Employee e2 = new Employee();
		
		e2.setEname("Samanvi");
		e2.setAge(22);
		e2.setExp(3);
		employee.insertEmployee(e2);
		
		
		Employee e3 = new Employee();
		
		e3.setEname("Kavitha");
		e3.setAge(25);
		e3.setExp(4);
		employee.insertEmployee(e3);
		
		
		employee.updateEmployee(e1);
		
		
		employee.selectEmployee();
		
	}

}

