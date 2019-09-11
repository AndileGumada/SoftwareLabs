package dealer;

/*Objectives:     
*Reviewing OCA Concepts
*Access modifiers
*Overloading and Overriding
*Abstract Classes
*Static and Final
*imports
*Using instanceof
*Understanding Virtual Method Invocation
*Annotating Overriden Methods
*toString
*.equals
*hashCode
*Working with Enums 
*Using Enums in Switch Statement
*Adding Constructors, Fields  and Methods
*Creating Nested Classes
*Member Inner Classes
*Anonymous Inner Classes
*Use package and import statements
*/
import java.time.LocalDate;


import dealer.Honda.Motorbike;
import dealer.Test.Teams;

public class TestDriver {

	

	public static void main(String[] args){
		
		System.out.println("----------------------------");
		
		LocalDate date = LocalDate.of(2019, 05, 15);//using the LocalDate
		//creating objects
		Motorbike motorbike = new Motorbike("DUCATI","MM300",250.00,(date),2);
		Motorbike motorbike2 = new Motorbike("DUCATI","MM300",250.00,(date),2);
		
		System.out.println(motorbike.toString());
		motorbike.speeds();//calling the interface 
		System.out.println("------instanceof-----");
		System.out.println(motorbike instanceof Vehicle);//prints true because the Motorbike extends Vehicle
		System.out.println(motorbike instanceof Speed);//true because motorbike implements Speed
		System.out.println(motorbike instanceof Object);//true because the Object is super parent class for all class
		
		System.out.println("--------HashCode-------");
		//comparing two objects 
		if (motorbike.equals(motorbike2)){//returns a hashCode of the object
		if(motorbike.hashCode() == motorbike2.hashCode()) 
				System.out.println("These Objects are Equal");
			else
				System.out.println("Objects are not EQUAL");
			}
			else
				System.out.println("Both objects are not equal");
		
		//creating objects for the enumerated
		String str = "Chelsea";
		Test objT = new Test(Teams.valueOf(str));//using valueOf
		objT.teamsAreLike();
		Teams.CHELSEA.printStatues();
		String str2 = "ManUnited";
		Test objT2 = new Test(Teams.valueOf(str2));
		objT2.teamsAreLike();

		//calling or invoking the method of the inner class method	
		System.out.println("----Nested, Static Nested and Anonymous Classes----");
		//calling the member class method
		Honda objH = new Honda();
		objH.callMotor();
		
		//creating the objects of the nested classes
		Cruz.Car objInner = new Cruz().new Car();
		objInner.speeds();
		
	};

}
