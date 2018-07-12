package com.spi.mysore;

import java.util.ArrayList;
import java.util.List;

public class Tester {
	public static void main(String[] args) {
		 Employee e =new Employee();
		List<AssetMgnt> lst= new ArrayList<AssetMgnt>();
		AssetMgnt asset=new AssetMgnt(1l,"house", "hdj") ;
		AssetMgnt asset1=new AssetMgnt(2l,"car", "hdj") ;
		asset.setEmployee(e);
        asset1.setEmployee(e);
        lst.add(asset);
        lst.add(asset1);
        
   e.setEmpId(1l);
   e.setDepartment("ITO");
   e.setName("Bhargavi");
   e.setSalary(1000l);
   e.setAssetMgnt(lst);
   EmployeeDAO emp=new EmployeeDAO();
   emp.save(e);
System.out.println(emp);
	}
   
   
	
	

}
