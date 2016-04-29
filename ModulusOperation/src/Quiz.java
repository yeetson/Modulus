import java.util.Scanner;

public class Quiz
	{

		public static void main(String[] args)
			{
				QuizA();
			
			}
		public static void QuizA()
		{
			System.out.println("How many questions would you like to answer");
			Scanner userInput = new Scanner(System.in);
			int number = userInput.nextInt();
			int counter=0;
					for(int i=0; i<number-2; i++)
						{
			int randomNumber = (int)(Math.random()*40+10);
			int randomNumber1 = (int)(Math.random()*10+1);
			System.out.println("what is "+randomNumber+ " % " +randomNumber1+ " ?");
			Scanner userInput1 = new Scanner(System.in);
			int num = userInput1.nextInt();
			System.out.println();
				{
			if(randomNumber % randomNumber1==num)
				{
					System.out.println("you are correct");
					counter++;
					System.out.println();
				}
			else 
				{
					System.out.println("you are wrong");
					System.out.println();
				}
			}
		}
					int randomNumber = (int)(Math.random()*40+10);
					System.out.println("what is "+randomNumber+ " % " +randomNumber+ " ?");
					Scanner userInput2 = new Scanner(System.in);
					int num = userInput2.nextInt();
					System.out.println();
						{
							if (randomNumber % randomNumber==num) 
								{
									System.out.println("you are correct");
									counter++;
									System.out.println();
								}
						}
		
							int randomNumber2 = (int)(Math.random()*10+6);
							int randomNumber3 = (int)(Math.random()*5+1);
							System.out.println("what is "+randomNumber3+" % "+randomNumber2+ " ?");
							Scanner userInput3 = new Scanner(System.in);
							int numb = userInput3.nextInt();
							System.out.println();
								{
									if(randomNumber3 % randomNumber2==numb)
										{
											System.out.println("you are correct");
											counter++;
											System.out.println();
										}
								}
								System.out.println("you got "+counter+" right");
								
	}
}