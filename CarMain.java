
public class CarMain {

	public static void main(String[] args) {
		
		  Car carnew= new Car();
		  carnew.setBrand("Honda"); 
		  carnew.getBrand();
		  carnew.setModel("Fit");
		  carnew.getModel();
		  Car car2=new Car(); car2.setSpeed(60); car2.getSpeed();
		  car2.setBrand("Toyota"); car2.getBrand();
		 
	
		carnew.brack();
		carnew.setAmountOfFuel(19);
		carnew.accelerate();
		System.out.println("New fuel amount "+carnew.amountOfFuel);
		carnew.printData();
		carnew.accelerate();
		carnew.accelerate();
		carnew.accelerate();
		System.out.println("   New fuel amount "+carnew.amountOfFuel);
		carnew.refuel();
	}

}
