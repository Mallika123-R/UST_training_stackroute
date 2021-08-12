package temp;

public class Car {
	public int fuelcapacity;
	
	public Car() {
		System.out.println("Car default Constructor");
		fuelcapacity=10;
		System.out.println(fuelcapacity);
	}
	
	public Car(int fuelcapacity) {
		fuelcapacity=100;
		System.out.println("Car overloaded Constructor");
		this.fuelcapacity=fuelcapacity;
	}
	
	public void start() {
		
	}
	
	public void stop() {
		
	}
	
	public void refuel() {
		System.out.println("refuel");
	}
	
	public void refuel(int amount) {
		System.out.println("refuel amount "+amount);
	}
	
	public void refuel(int amount,String time) {
		System.out.println("refuel amount "+amount+" at time "+time);
	}
}
