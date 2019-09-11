package dealer;

//class that contains the Object of the teams

public class Test {
	
	//used an enum to store the constant teams in a league is used when you know the 
	enum Teams{
		 CHELSEA("Champions League Position"), MANCHESTERUNITED("Eu"), MANCHESTERCITY("Raining Champs"), LIVERPOOL("2nd place"),Spurs("3rd place"), Wolfs("6th place"),
		 BRIGHTON("Relageted"), WADFORD("7th"), WESTHAM("8th place"), ASERNAL("5th");
		
		private String statues;
		
		private Teams(String statues) {
			this.statues = statues;
		}
		public void printStatues() {
			System.out.println(statues);
		}
	}
		 Teams teams;
		 
		 //Constructor
		 public Test(Teams teams){
			 this.teams = teams;
		 }
		 //prints a line about the teams using the switch statement
		 public  void teamsAreLike() {
			 
			 switch(teams) {
			 case CHELSEA:
				 System.out.println("Chelsea is the best");
				 break;
			 case MANCHESTERUNITED:
				 System.out.println("ManUnited was the best");
				 break;
			 case MANCHESTERCITY:
			 case LIVERPOOL:
				 System.out.println("This teams are great currently");
				 break;
			default:
				System.out.println("These teams are really good");
				break;
			 
			 }
		 }
}
