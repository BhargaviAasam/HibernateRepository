package com.spi.mysore;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="person")
public class PersonDTO {
	
	@Id
	@Column(name="p_id")
	private int id;
	@Column(name="p_name")
	private String name;
	@Column(name="p_height")
	private double height;
	@Column(name="p_nation")
	private String nation;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
	@Override
	public String toString() {
		return "PersonDTO [name=" + name + ", height=" + height + ", nation=" + nation + ", id=" + id + "]";
	}
	

}
