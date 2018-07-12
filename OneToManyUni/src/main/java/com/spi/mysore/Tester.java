package com.spi.mysore;

import java.util.HashSet;
import java.util.Set;

public class Tester {
	public static void main(String[] args) {


		Set<Phone> phoneNumbers = new HashSet<Phone>();
		phoneNumbers.add(new Phone("jkhvj","32354353"));
		phoneNumbers.add(new Phone("sfgfg","9889343423"));

		Student student = new Student("Eswdfsdar", phoneNumbers);
		StudentDAO sd= new StudentDAO();
		sd.save(student);
	
	}
}
