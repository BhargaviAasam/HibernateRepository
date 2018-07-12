package com.spi.mysore;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="EMPLOYEES")
public class Employee {
	
	
	    @Id
	    @GeneratedValue(strategy=GenerationType.IDENTITY)
	    @Column(name="EMP_ID", unique = true, nullable = false)
	    private Long empId;
	    
	    @Column(name="EMP_NAME")
	    private String name;
	 
	    @Column(name="EMP_DEPT")
	    private String department;
	    
	    @Column(name="EMP_SAL")
	    private Long salary;
	 
	 
	    @OneToMany(mappedBy="employee", cascade = CascadeType.ALL)
	    private List<AssetMgnt> assetMgnt;
	 
	    public List<AssetMgnt> getAssetMgnt() {
	        return assetMgnt;
	    }
	 
		public Employee() {
			// TODO Auto-generated constructor stub
		}

		public void setAssetMgnt(List<AssetMgnt> assetMgnt) {
	        this.assetMgnt = assetMgnt;
	    }
	 
	    public Long getEmpId() {
	        return empId;
	    }
	 
	    public void setEmpId(Long empId) {
	        this.empId = empId;
	    }
	 
	    public String getName() {
	        return name;
	    }
	 
	    public void setName(String name) {
	        this.name = name;
	    }
	 
	    public String getDepartment() {
	        return department;
	    }
	 
	    public void setDepartment(String department) {
	        this.department = department;
	    }
	 
	    public Long getSalary() {
	        return salary;
	    }
	 
	    public void setSalary(Long salary) {
	        this.salary = salary;
	    }
	 
	  

		@Override
		public String toString() {
			return "Employee [empId=" + empId + ", name=" + name + ", department=" + department + ", salary=" + salary
					 + ", assetMgnt=" + assetMgnt + "]";
		}
	 

}
