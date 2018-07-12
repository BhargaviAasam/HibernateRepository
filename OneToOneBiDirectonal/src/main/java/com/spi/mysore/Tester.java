package com.spi.mysore;

public class Tester {
	public static void main(String[] args) {
		
		Earth e=new Earth();
		Moon moon= new Moon();
		e.setId(1);
		e.setArea(1250);
		e.setMoon(moon);
		
		moon.setId(1);
		moon.setArea(1147);
		moon.setEarth(e);
		 
		
		
		EarthDAO dao= new EarthDAO();
		dao.save(e);
		
		
		
		
		
	}

}
