package Start_Playing_a_Game;
import java.util.Scanner; 

public class Enam 
{
	static int enamul_points = 0;
	@SuppressWarnings("resource")
	static int Enamulhussen()
	{
		Scanner scan = new Scanner( System.in);
		System.out.println("Enamul now your turn..! press 1 and then Enter to start the game..!");
		if(scan.nextInt()==1)
		{

			int correct_guessing_number[]=new int [5]; 
			int secrete_number = 5;
			for(int i =0; i<=4;i++)
			{
				System.out.println("Enamul guess the secret Number between 1 to 10:");
				int guessing_number=scan.nextInt();
				if(guessing_number==secrete_number)
				{
					enamul_points = enamul_points + 10 ;
					secrete_number=secrete_number+1;
					correct_guessing_number[i]=guessing_number;
				}
			}

			System.out.println("Dear Enamul Hussen your turns are over!!");
			System.out.println("  your correct guesses are : ");
			for(int i=0; i < correct_guessing_number.length; i++)
			{
				if ( correct_guessing_number[i]!=0)
					System.out.println("The guess " + correct_guessing_number[i]+ " is Correct!");
			}
			System.out.println("Each correct guess carries 10 points "+": so your total points:"+enamul_points);
		}
		return(enamul_points);

	}
}

