package main;

import java.util.ArrayList;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car car11 = new Car("black");
		car11.noise();
		car11.cost();
		Car car1 = new Car("silver");
		Car car2 = new Car("Honda", 12, 123, "blue", 5);
		Motorbike bike1 = new Motorbike("red");
		Van van1 = new Van("green");
		Motorbike bike2 = new Motorbike("yellow");
		car1.setName("mazda");
		car2.setName("bmw");
		bike1.setName("harley");
		ArrayList<Vehicles> garageList = new ArrayList<>();

		garageList.add(car11);
		garageList.add(car1);
		garageList.add(bike1);
		garageList.add(van1);
		garageList.add(bike2);
		garageList.add(car2);

		for (Vehicles obj : garageList) {
			if (obj instanceof Vehicles) {
				obj.noise();
				Vehicles target = (Vehicles) obj;
				target.noise();

			} else {
				obj.noise();
			}

			//garageList.remove(3).getName();
			System.out.println(garageList.get(1).getName());
			// garageList.set(2, bike2);
			// garageList.clear();
			//System.out.println(garageList);

		}

	}
}

//remove Vehicle(s) (By ID, By Vehicle Type) 
//3. fix Vehicle (Calculate bill)
