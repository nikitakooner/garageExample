package main;

public class Motorbike extends Vehicles {

	protected int wheels;
	protected String model;

	public Motorbike(String wheels) {
		super();
		this.wheels = 2;
		System.out.println("The motorbike has 2 wheels");
	}

	public Motorbike(String name, int age, int ID, int doors, int wheels) {
		super(name, age, ID);
		this.wheels = wheels;

	}

	@Override
	public void cost() {
		System.out.println(this.getName() + " £400 ");
	}

}
