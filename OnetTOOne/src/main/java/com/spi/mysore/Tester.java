package com.spi.mysore;

public class Tester {
	public static void main(String[] args) {
		  Address a=new Address();
	       a.setAddressId(1);
	 	   a.setStreet("cavery");
	 	   a.setCity("Mysore");
	 	   a.setState("karnataka");
	 	   a.setPincode(515508);
	 	
		
		Student s1= new Student();
		System.out.println("inside main method");
	     s1.setStudentId(1);
	     s1.setStudentName("Bhargavi");
	     
	     
	
          s1.setStudentAddress(a);


        	AddressDAO add= new AddressDAO();
	
	       add.save(s1);
	      System.out.println(s1);
	
	

	
	}	
	
	
}
