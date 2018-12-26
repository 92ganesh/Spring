package com.ganesh.SpringTest;

public class Tyre {
	private String brand,brand2;

	public Tyre(String brand,String brand2) {
		this.brand = brand;
		this.brand2 = brand2;
	}

	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Tyre [brand : "+brand+"-"+brand2+"]";
	}

}
