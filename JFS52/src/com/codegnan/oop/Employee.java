package com.codegnan.oop;

public class Employee {
	int id;
	String name;
	double salary;
	public void displayEmployeeDetails(Employee e) {
	System.out.println(e.id);
	System.out.println(e.name);
	System.out.println(e.salary);
	}
	public Employee getEmployee(int id,String name,double salary)
	{
		Employee emp=new Employee();
		emp.id=id;
		emp.name=name;
		emp.salary=salary;
		return emp;
	}

	public static void main(String[] args) {
		System.out.println("-----Employee Details-----");
		Employee emp=new Employee();
		emp.id=100;
		emp.name="Harsha";
		emp.salary=20000.00;
		emp.displayEmployeeDetails(emp);
		System.out.println();
		Employee e=emp.getEmployee(101,"sathvik",30000.00);
		e.displayEmployeeDetails(e);
		
		Employee empArray[]=new Employee[2];
		empArray[0]=emp;
		empArray[1]=e;
		System.out.println("-----Employee Details Using Array-----");
		for(Employee e1:empArray)
		{
			System.out.println();
			e1.displayEmployeeDetails(e1);
		}
	}
}
