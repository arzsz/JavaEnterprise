package com.example.jsfdemo.domain;

import java.util.Date;

import javax.validation.constraints.Min;
import javax.validation.constraints.Past;

public class Camera {

	private String name = "unknown";
	private String brand = "";
	private Date dateOfProd= new Date();
	private double weight;
	private boolean isHD;
	private int amount;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	@Past
	public Date getDateOfProd() {
		return dateOfProd;
	}
	public void setDateOfProd(Date dateOfProd) {
		this.dateOfProd = dateOfProd;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public boolean isHD() {
		return isHD;
	}
	public void setHD(boolean isHD) {
		this.isHD = isHD;
	}
	@Min(0)
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}

}
