package dealer;

import java.time.LocalDate;

	class Cruz implements Speed{//this is the outer class

		//Car is the nested inner class for the outer class Cruz	
		class Car extends Vehicle implements Speed {

		public Car() {
			
		}
		public Car(String make, String model, double price, LocalDate dateLaunch, int noOfWheels) {
			super(make, model, price, dateLaunch, noOfWheels);
		
		}
		
		@Override
		public void speeds() {
		System.out.println("The Car class is the nessted inner class of the outer class Cruz");
		
		}
		}
		//Anonymous class from the interface
		Speed speed = new Speed() {
		@Override
		public void speeds() {
			System.out.println("This the anoynmous class for the interface");
			
		}
	};
		@Override
		public void speeds() {
			// TODO Auto-generated method stub
			
		}
	}