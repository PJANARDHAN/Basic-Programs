package co.product.employee;

public class MainEmployeeTest {

	public static void main(String[] args) {
		
		// object injection to initialization of address
		Project p1=new Project("lib system", "JAVA", 1, 1000);
		Project p2=new Project("bus system", "C", 2, 2000);
		Project p3=new Project("visitor system", "PYTHON", 3, 3000);
		Project p4=new Project("water system", "JAVA SCRIPT", 4, 4000);
		
		Address ad1=new Address("vijayanagar", "Banglore", 5,959438453);
		Address ad2=new Address("shivaginagar", "Manglore", 6,12345);
		Address ad3=new Address("mekri", "Mysore", 7,677897);
		Address ad4=new Address("guttahalli", "Hydrabad", 8,7653334);


		Employee emp1=new Employee("Rajesh", 9000, ad1, p1);
		Employee emp2=new Employee("Sujith", 8000, ad2, p2);
		Employee emp3=new Employee("Manju", 3000, ad3, p3);
		Employee emp4=new Employee("Kiran", 5000, ad4, p4); 
		
		Employee arr[]= {emp1,emp2,emp3,emp4};
		int i,index=0;
		double max=arr[0].Salary;
		for(i=1;i<arr.length;i++)
		{
			if(arr[i].Salary>max) {
				max=arr[i].Salary;
				index=i;
			}
		}
		System.out.println(max);
		arr[index].EmployeeDetails();
		System.out.println("--------------------------------------");
		for(i=0;i<arr.length;i++)
		{
			arr[i].EmployeeDetails();
			System.out.println("---------------------------------------------------");
		}
	}
}
