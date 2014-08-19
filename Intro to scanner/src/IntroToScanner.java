import java.util.Scanner;

public class IntroToScanner {


	public static void main(String[] args) {
		String name, choice;
		System.out.println("What is your name? ");

		Scanner userInput1 = new Scanner(System.in);
		name = userInput1.nextLine();

		System.out.println("Hi, lets play the game " + name);
		choice = userInput1.nextLine();

		System.out.println("Ok... good ");
		{
			if ("yes".equals(choice))
				System.out
						.println("You approach a door, you walk in without knocking or you knock?");
			{
				if ("knock" != null)
					;
				choice = userInput1.nextLine();
				System.out
						.println("You win and get a diamond sword! Awesome lucky you! Have a good day!");
			}
		}
		{
			if ("walk in without knocking!?" != null)
				;
			choice = userInput1.nextLine();
			if ("no".equals(choice))
				;

		}
	}
}
