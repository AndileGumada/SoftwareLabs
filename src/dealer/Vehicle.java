package dealer;
//importing the necessary libraries
import java.time.LocalDate;
import java.util.Objects;

public abstract class Vehicle implements Speed{

	//creating instance variables for the class
	private String make;
	protected String model;
	private double price;
	private LocalDate dateLaunch = java.time.LocalDate.of(2019,05,15);
	private int noOfWheels;
	
	public Vehicle() {
		
	}
	
	public Vehicle(String make, String model, double price, LocalDate dateLaunch, int noOfWheels) {
		this.make = make;
		this.model = model;
		this.price = price;
		this.dateLaunch = dateLaunch;
		this.noOfWheels = noOfWheels;
	}


	@Override
	public String toString() {
		return "\nMake :" + make + "\nModel :" + model + "\nPrice :" + price + "\nDateLaunch :" + dateLaunch+"\nNoOfWheels:"+noOfWheels;
	}

	//Overriding the speed method
	@Override
	public void speeds() {
		System.out.println("The Vehicle speeds well");
		
	}

	@Override
	public int hashCode() {
		return Objects.hash(dateLaunch, make, model, noOfWheels, price);//returns a hashCode for the object
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)//check if the object is referring to the same object
			return true;
		if (obj == null)//check if the argument passed is of type Object
			return false;
		if (!(obj instanceof Vehicle))
			return false;
		Vehicle other = (Vehicle) obj;//type casting Vehicle to obj
		return Objects.equals(dateLaunch, other.dateLaunch) && Objects.equals(make, other.make)
				&& Objects.equals(model, other.model) && noOfWheels == other.noOfWheels
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price);
	}

	public void run() {
		
	}

}
