package co.product.employee;

public class Address {
	String StreetName;
	String city;
	int StreetNo;
	int PhoneNo;
	public Address(String streetName, String city, int streetNo, int phoneNo) {
		super();
		StreetName = streetName;
		this.city = city;
		StreetNo = streetNo;
		PhoneNo = phoneNo;
	}
	
	public void displayAddress() {
		System.out.println("\naddress details :-");
		System.out.println("Street name   :"+ StreetName);
		System.out.println("city          :"+ city);
		System.out.println("Street number :"+ StreetNo);
		System.out.println("phone number  :"+ PhoneNo);
	}
	
	
	
	
}
