package pack_employee_updates;

import pack_employee.Employee;
import pack_employee.Salary;

public class EmployeeUpdates {
	
	boolean updateEmployee(Employee emp, Salary sal){
			emp.setSalary(sal);
		return true;
	}
	
	 void getDetails(Employee emp){
		
		int npsBonus=0;
		
		if(emp.getSalary().getisOptedForNPS()) {
			npsBonus = 4000;
		}
		
		float totalSal = emp.getSalary().getBasic()+emp.getSalary().getHra()+emp.getSalary().getTa()+npsBonus;
		
		System.out.println("Name of Employee :" + emp.getFirstName() + " " + emp.getLastName());
		
		System.out.println("Employee total Salary = " + totalSal );
		
		
	}
}
