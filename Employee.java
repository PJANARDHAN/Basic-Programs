package co.product.employee;

public class Employee {
	String Name;
	double Salary;
	Address address;
	Project project;
	public Employee(String name, double salary, Address address, Project project) {
		super();
		Name = name;
		Salary = salary;
		this.address = address;
		this.project = project;
	}
	public void EmployeeDetails() {
		System.out.println("Employee Name :" + Name);
		System.out.println("Employee Salary :" + Salary);
		//System.out.println("Employee Address :" + address);
		//System.out.println("Employee Projects :" + project);
		project.showProject();
		address.displayAddress();
	}
	
	
}
