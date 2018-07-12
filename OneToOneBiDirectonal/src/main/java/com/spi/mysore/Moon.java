package com.spi.mysore;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="moon")
public class Moon {
	
	@Id
	@Column(name="m_id")
	private int id;
	
	@Column(name="m_area")
	private int area;
	
	@OneToOne(fetch=FetchType.LAZY)
	   @JoinColumn(name = "e_id")
	private Earth earth;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getArea() {
		return area;
	}
	public void setArea(int area) {
		this.area = area;
	}
	public Earth getEarth() {
		return earth;
	}
	public void setEarth(Earth earth) {
		this.earth = earth;
	}
	@Override
	public String toString() {
		return "Moon [id=" + id + ", area=" + area + ", earth=" + earth + "]";
	}

}
