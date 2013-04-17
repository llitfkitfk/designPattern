package org.abstractClass;

public abstract class Item {
	String name;
	float price;
	
	public Item(String name, float price) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.price = price;
	}
	
	void display() {
		System.out.println(this.name + " : " + this.price);
	}
}
