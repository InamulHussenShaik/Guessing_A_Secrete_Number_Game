package Start_Playing_a_Game;
import java.util.Scanner; 

public class Krishna 
{
	public static void main(String[]args)
	{
		int pgn[] = new int[5];
		int krishna_points = 0;
		int secrete_number = 1;
		System.out.println("NOTE :Each correct Guess is euall to 10 points : total 5 turns for each player");
		System.out.println("Krishna Press 0 and then Enter to start the game...!");
		Scanner scan = new Scanner( System.in);
		if(scan.nextInt()==0)
		{
			for(int i =0; i<=4;i++)
			{
				System.out.println("Krishna guess the secret Number between 1 to 10 :");
				int guessing_number=scan.nextInt();
				if(guessing_number==secrete_number)
				{
					krishna_points = krishna_points + 10;
					secrete_number=secrete_number+2;
					pgn[i]=guessing_number;
				}
			}
			System.out.println("Dear Krishna  your turns are over !!");
			System.out.println("Your correct guesses are:");
			for(int i=0; i< pgn.length; i++)
			{
				if (pgn[i]!=0)
					System.out.println("The guess " + pgn[i]+ " is correct!");
			}
			System.out.println("Each correct guess carries 10 Points "+": so your total points are: "+krishna_points);
			System.out.println("-----------------------------------------------------------------------------------------");
			System.out.println();
			int result=Enam.Enamulhussen();
			if (result > secrete_number )
			{
				System.out.println("-------------------------------------------------------------------------------------");
				System.out.println();
				System.out.println("Enamul you have won the game ! with the points:"+result);
			}
			else if (result<secrete_number)
			{
				System.out.println("###########################################################################10");
				System.out.println();
				System.out.println("Krishna you have won the game with the points:"+krishna_points);
			}
			else 
			{
				System.out.println("***********************************");
				System.out.println("Match Tie ! Play again");
				Krishna.main(null);

			}
		}

	}
}



