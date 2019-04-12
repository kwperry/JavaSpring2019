import java.util.Scanner;
public class RPSSimulator {



	public static int getInput(String str)
	{
		int input;
		switch(str)
		{
		case "rock":
			input = 0;
			break;
		case "paper":
			input = 1;
			break;
		case "scissors":
			input = 2;
			break;
		default:
			input = -1;
			break;
		}
		return input;
	}
	public static String stringInput(int num)
	{
		String str = "";
		switch(num)
		{
			case 0:
				str = "rock";
				break;
			case 1:
				str = "paper";
				break;
			case 2:
				str = "scissors";
				break;

		}
		return str;
	}


	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		int userChoice;
		boolean isWon = false;
		int compChoice = (int) Math.floor(Math.random()*3);
		
		//keep user trapped in loop until they enter the correct input
		do
		{
			System.out.print("Please enter 'rock', 'paper' or 'scissors' : ");
			userChoice = getInput(keyboard.next());
			if(userChoice == -1)
			{
				System.out.println("Invalid option. Select Again");
			}
		}while(userChoice == -1);
		keyboard.close();
		
		//checks for draw
		if(userChoice == compChoice)
		{
			System.out.println("It was a draw");
			return;
		}

		else if(userChoice > compChoice)
		{
			if(compChoice == 0 && userChoice == 2)
			{
				isWon = false;
			} else 
			{
				isWon = true;
			}
		} else if(compChoice > userChoice)
		{
			if(userChoice == 0 & compChoice == 2)
			{
				isWon = true;
			} else 
			{
				isWon = false;
			}
		}
		
		System.out.println((isWon ? "You won" : "You lost") + "\nYou were " + stringInput(userChoice) + 
				" Computer  was " + stringInput(compChoice));
	}

	

}
