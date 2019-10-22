import java.util.Scanner;

public class HowOldAreYou {
	
	public static void main ( String [] args ) {
		int drive = 16;
		int vote = 18;
		int rentCar = 25;
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Hey, what's your name?");
		String userName = input.next();
		if (userName.toLowerCase().contentEquals("quit")) {
			System.out.println("Nobody likes a quitter...");
			System.exit(0);
		}
		
	}

}
