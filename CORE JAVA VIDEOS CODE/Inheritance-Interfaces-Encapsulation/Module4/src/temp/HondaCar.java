package temp;

public class HondaCar extends Car{
	public int fuelCapacity;
	
	public HondaCar() {
		System.out.println("Honda Car default Constructor");
	}
	
	public HondaCar(int fuelcapacity) {
		System.out.println("Honda Car overloaded Constructor");
		this.fuelcapacity=fuelcapacity;
	}
	
	public void refuel(int amount,String time,String city) {
		System.out.println("refuel amount "+amount+" at time "+time);
	}
	
	@Override
	public void refuel(int amount) {
		System.out.println("refuel amount "+amount);
		fuelCapacity=fuelCapacity+amount;
	}

	
}
