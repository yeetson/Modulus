import java.util.ArrayList;
import java.util.Scanner;
public class Challenges
	{

		public static void main(String[] args)
		{
			EvenorOdd();
			leapYear();
			Hundred();
			The100();
		}
		public static void EvenorOdd()
		{
				Scanner userInput = new Scanner(System.in);
				System.out.println("Enter a number, even or odd.");
				int x =userInput.nextInt();
					if(x % 2 == 0)
					{
						System.out.println(x + " your number is even.");
						System.out.println();
					}
					
					else if(x % 2 ==1)
					{
						System.out.println(x + " your number is odd.");
						System.out.println();
					}
		
		}
		public static void leapYear()
		{
			Scanner userInput = new Scanner(System.in);
			System.out.println("Enter a year.");
			int year =userInput.nextInt();
			if(year % 4 == 0)
				{
					System.out.println("This is a leap year.");
					System.out.println();
				}
			
			else if(year % 1 == 0)
				{
					System.out.println("This is not a leap year.");
					System.out.println();
				}
		}
		public static void Hundred()
		{
			int Hundred [] = {2, 5, -7, 1, 3, 12, 19, -16, 4, 20};
			for(int i =0; i<Hundred.length; i++)
				{
					if(i % 3 == 0)
						{
							System.out.println(Hundred[i]);
							System.out.println();
						}
				}
		}
		public static void The100()
		{
			for(int j=1; j<101; j++)
				{
					if(j % 3 == 0)
						{
							if(j%5==0)
								{
								System.out.println("FizzBuzz");
								}
							else
								{	
							System.out.println("Fizz");
								}
						}
					else if(j % 5 == 0)
						{
							
							System.out.println("Buzz");
						
						}
					else 
						{
							System.out.println(j);
						}
				}
		}
		}
