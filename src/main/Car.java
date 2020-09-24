package main;

public class Car extends Vehicles {
	public String colour;
	protected int doors;

	public Car(String colour) {
		super();
		this.colour = "red";
		System.out.println("the car is red!");
	}

	public Car(String name, int age, int ID, String colour, int doors) {
		super(name, age, ID);
		this.colour = colour;
		this.doors = doors;

	}

	@Override
	public void cost() {
		System.out.println(this.getName() + " £5 ");
	}

}
