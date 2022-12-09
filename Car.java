
public class Car {
	int speed,amountOfFuel; 
	String brand,model;
	
	//set the speed
	public void setSpeed(int speed) {
		this.speed=speed;
	}
	//set the brand
	public void setBrand(String brand) {
		this.brand=brand;
	}
	public void setModel(String model) {
		this.model=model;
	}
	public void getModel() {
		System.out.println(this.model);
	}
	public void setAmountOfFuel(int amountOfFuel) {
		this.amountOfFuel=amountOfFuel;
	}
	
	public void getSpeed() {
		System.out.println(this.speed);
	}
	public void getBrand() {
		System.out.println(this.brand);
	}
	public void brack() {
	    System.out.println("Car is breaking");
	}
	public void accelerate() {
		if (amountOfFuel > 0) {
	    System.out.println("Car is accelerating");
	    this.amountOfFuel -=1;
		}
		else
			System.out.print("No fuel");
	}
	//create refuel method
	public void refuel() {
		if (amountOfFuel!=0) {	
			this.amountOfFuel = amountOfFuel - 1;
			System.out.println("Car is accelerating");}
			else
			System.out.println("Please refill the car");
			if (amountOfFuel == 5) {
				amountOfFuel = amountOfFuel + 10;
			}
	}
	
	public void printData() {
	    System.out.println(this.brand);
	    System.out.println(this.model);
	    System.out.println(this.amountOfFuel);
	}
}
