package com.spi.mysore;

public class Tester {
	public static void main(String[] args) {
		PersonDTO dto=new PersonDTO() ; 
		dto.setId(2);
		dto.setName("Prince");
		dto.setHeight(5.11);
		dto.setNation("india");
		System.out.println(dto);
		PersonDAO dao=new PersonDAO();
		dao.save(dto);

}
}
