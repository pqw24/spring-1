package com.pqw.test;

public class Car {
	private String brand;
	private String crop;
	private double price;
	private int max;
	public Car(String brand, String crop, double price) {
		super();
		this.brand = brand;
		this.crop = crop;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Car [brand=" + brand + ", crop=" + crop + ", price=" + price + ", max=" + max + "]";
	}
	public Car(String brand, String crop, int max) {
		super();
		this.brand = brand;
		this.crop = crop;
		this.max = max;
	}
	
	

}
