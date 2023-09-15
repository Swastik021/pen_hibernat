package com.jsp.pen;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pen {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;
	private String pencol;
	private int price;
	private String typeofpen;
	
	//@GeneratedValue(strategy= GenerationType.IDENTITY)

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPencol() {
		return pencol;
	}
	public void setPencol(String pencol) {
		this.pencol = pencol;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getTypeofpen() {
		return typeofpen;
	}
	public void setTypeofpen(String typeofpen) {
		this.typeofpen = typeofpen;
	}
	

}
