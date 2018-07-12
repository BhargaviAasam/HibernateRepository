package com.spi.mysore;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="Student")
public class Student {
	
	@Id
	@GeneratedValue(generator="bhargavi")
	@GenericGenerator(name = "bhargavi", strategy = "increment")
	@Column(name = "student_id")
	private long studentId;

	@Column(name = "student_name")
	private String studentName;
	
	 @OneToOne(cascade = CascadeType.ALL)
	  @JoinColumn(name="address_id")
	private Address studentAddress;
	

	
	public long getStudentId() {
		return studentId;
	}
	
	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public Address getStudentAddress() {
		return studentAddress;
	}
	
	
	
	public void setStudentAddress(Address studentAddress) {
		this.studentAddress = studentAddress;
	}


	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAddress=" + studentAddress
				+ "]";
	}
	
	


}
