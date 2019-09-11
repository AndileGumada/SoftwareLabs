package dealer;

import java.time.LocalDate;

//Honda the outer class
class Honda {
	
	private static String runs = "This Honda runs Fast";//using the static 

	public static class Motorbike extends Vehicle implements Speed {//

		//
		public static int repeat = 3;

		public Motorbike() {

		}

		public Motorbike(String string, String string2, double price, LocalDate date, int noOfWheels) {

			super(string, string2, price, date, noOfWheels);
		}

		@Override
		public void speeds() {
			System.out.println("The Motorbike speed very fast!");
		}

		@Override
		public String toString() {
			return "Motorbike :" + super.toString();
		}

		public void go() {
			for (int i = 0; i < repeat; i++)//use a for loop to repeat the method three times
				System.out.println(runs);
	}
}
	//
	public void callMotor() {
			Motorbike objM = new Motorbike();

			objM.go();
		}
}