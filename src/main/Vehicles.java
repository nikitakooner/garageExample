package main;

public class Vehicles {
	private String name;
	protected int age;
	protected int ID;

	public Vehicles(String name, int age, int ID) {
		this.name = getName();
		this.age = age;
		this.ID = ID;
	}

	public Vehicles() {

	}

	public void noise() {
		System.out.println(this.name + " the car is revivng");
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public void cost() {
		System.out.println(this.name + "costs: ");
	}
}