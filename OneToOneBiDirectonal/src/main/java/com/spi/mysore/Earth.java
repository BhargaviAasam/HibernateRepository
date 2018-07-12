package com.spi.mysore;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="earth")
public class Earth {
	@Id
	@GeneratedValue(generator="bhargavi")
	@GenericGenerator(name = "bhargavi", strategy = "increment")
	@Column(name="e_id")
	private int id;
	
	@Column(name="e_area")
	private int area;
	
	
	@OneToOne(cascade = CascadeType.ALL , mappedBy = "earth", fetch = FetchType.LAZY)
	  @JoinColumn(name="m_id")
	private Moon moon;
	
	
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
	public Moon getMoon() {
		return moon;
	}
	public void setMoon(Moon moon) {
		this.moon = moon;
	}
	@Override
	public String toString() {
		return "Earth [id=" + id + ", area=" + area + ", moon=" + moon + "]";
	}

	
	
}
