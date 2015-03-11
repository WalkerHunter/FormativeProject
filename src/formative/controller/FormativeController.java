package formative.controller;

import java.util.Scanner;

public class FormativeController
{
	private Scanner scan;
	
	private String userOption;
	
	public FormativeController()
	{
		scan = new Scanner(System.in);
	}
	
	private String rockPaperScissors(String input)
	{
		String game = "";

		int randomPosition = (int) (Math.random() * 3);
		if (randomPosition == 0)
		{
			if (rockChecker(input))
			{
				game = "User wins!";
			}
			else if(paperChecker(input))
			{
				game = "Computer wins.";
			}
			else if(scissorChecker(input))
			{
				game = "It's a tie!";
			}
		}
		else if (randomPosition == 1)
		{
			if (paperChecker(input))
			{
				game = "User wins!";
			}
			else if(scissorChecker(input))
			{
				game = "Computer wins.";
			}
			else if(rockChecker(input))
			{
				game = "It's a tie!";
			}
		}
		else if (randomPosition == 2)
		{
			if (scissorChecker(input))
			{
				game = "User wins!";
			}
			else if(rockChecker(input))
			{
				game = "Computer wins.";
			}
			else if(paperChecker(input))
			{
				game = "It's a tie!";
			}
		}
		
		System.out.println(game + "\nPress '1' to play again");
		userOption = scan.nextLine();
		return game;
	}
	
	private boolean rockChecker(String input)
	{
        boolean rock = false;
		
		if(input != null && input.equalsIgnoreCase("rock"))
		{
			rock = true;
		}
		
		return rock;
	}
	
	private boolean paperChecker(String input)
	{
        boolean paper = false;
		
		if(input != null && input.equalsIgnoreCase("paper"))
		{
			paper = true;
		}
		
		return paper;
	}
	
	private boolean scissorChecker(String input)
	{
        boolean scissor = false;
		
		if(input != null && input.equalsIgnoreCase("scissors"))
		{
			scissor = true;
		}
		
		return scissor;
	}
	
	public void start()
	{
		System.out.println("Rock, Paper, or Scissors?\n");
		userOption = scan.nextLine();
		
		
		rockPaperScissors(userOption);
	
		if(userOption.equals("1")) 
		{
			start();
		}
		
	}
	
}
