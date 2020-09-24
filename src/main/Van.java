package main;

public class Van extends Vehicles {
	protected int doors;
	protected String fuel;
	
	public Van(String fuel) {
		super();
		this.fuel = "petrol";
		System.out.println("the car is red!");
	}

	public Van(String name, int age, int ID, int doors, String fuel) {
		super(name, age, ID);
		this.doors = doors;
		this.fuel = fuel;

	}

	@Override
	public void cost() {
		System.out.println(this.getName() + " £5 ");
	}

}
