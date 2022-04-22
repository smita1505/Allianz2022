package pack_main;

import pack_employee.Employee;
import pack_employee.Salary;
import pack_employee_updates.EmployeeUpdates;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		
		e1.setFirstName("Naruto");
		e1.setLastName("Uzumaki");
		
		Salary salE1 = new Salary();
		
		salE1.setBasic(50000);
		salE1.setHra(2000);
		salE1.setOptedForNPS(false);
		salE1.setTa(5000);
		
		e1.setSalary(salE1);
			
		System.out.println(e1.getFirstName());
		System.out.println(e1.getSalary().getBasic());
		
		
		

	}
}
