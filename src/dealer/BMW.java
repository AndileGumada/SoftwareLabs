package dealer;

import java.time.LocalDate;

//make the BMW class final so that it can not 

public final class BMW extends Vehicle implements Speed{

	public BMW() {
		super();
		
	}

	public BMW(String make, String model, double price, LocalDate dateLaunch, int noOfWheels) {
		super(make, model, price, dateLaunch, noOfWheels);
		
	}

	@Override
	public String toString() {
		return "BMW :" + model + ", toString()=" + super.toString() + ", hashCode()=" + hashCode()
				+ ", getClass()=" + getClass();
	}

	
}
