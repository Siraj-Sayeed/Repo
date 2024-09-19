/*
  Class: CMSC203 
  Instructor: Professor Khandan Monshi
  Description: ESPGame: Program randomly selects color for user to guess, after 3 rounds, 
  outputs number user correctly guessed
  Due: 09/18/2024
  I pledge that I have completed the programming assignment 
  independently. I have not copied the code from a student or 
  any source. I have not given my code to any student.
  Print your Name here: Siraj Sayeed
*/

import java.util.*;
import java.io.*;

public class ESPGame {
	
	
	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("CMSC203 Assignment 1: Test your ESP skills!");
		
		System.out.print("Enter a file name: ");
		String fname = key.nextLine();
		
		File theFile = new File(fname);
		Scanner reader = new Scanner(theFile);
		Scanner output = new Scanner(theFile);
		Scanner counter = new Scanner(theFile);
		int numColors = 0;
		
		while(counter.hasNextLine()) {
			numColors++;
			counter.nextLine();
		}
		
		System.out.println("There are " + numColors + " colors from a file");
		
		while(output.hasNextLine()) {
			System.out.println(output.nextLine());
		}
			
		reader.nextInt();
		final String COLOR_BLACK = reader.nextLine().substring(1);
		
		reader.nextInt();
		final String COLOR_WHITE = reader.nextLine().substring(1);
		
		reader.nextInt();
		final String COLOR_GRAY = reader.nextLine().substring(1);
		
		reader.nextInt();
		final String COLOR_SILVER = reader.nextLine().substring(1);
		
		reader.nextInt();
		final String COLOR_MAROON = reader.nextLine().substring(1);
		
		reader.nextInt();
		final String COLOR_RED = reader.nextLine().substring(1);
		
		reader.nextInt();
		final String COLOR_PURPLE = reader.nextLine().substring(1);
		
		reader.nextInt();
		final String COLOR_FUCHSIA = reader.nextLine().substring(1);
		
		reader.nextInt();
		final String COLOR_GREEN = reader.nextLine().substring(1);
		
		reader.nextInt();
		final String COLOR_LIME = reader.nextLine().substring(1);
		
		reader.nextInt();
		final String COLOR_OLIVE = reader.nextLine().substring(1);
		
		reader.nextInt();
		final String COLOR_YELLOW = reader.nextLine().substring(1);
		
		reader.nextInt();
		final String COLOR_NAVY = reader.nextLine().substring(1);
		
		reader.nextInt();
		final String COLOR_BLUE = reader.nextLine().substring(1);
		
		reader.nextInt();
		final String COLOR_TEAL = reader.nextLine().substring(1);
		
		reader.nextInt();
		final String COLOR_AQUA = reader.nextLine().substring(1);
		
		String compColor = "";
		String guess = "";
		int correctCounter = 0;
		
		for(int i = 1; i <= 3; i++) {
			
			// randomize color to guess
			Random r = new Random();
			int colorNum = r.nextInt(1, 17);
			
			// get intial input
			System.out.println("Round " + i + "\n");		
			System.out.println("I am thinking of a color.");
			System.out.println("Is it one of the listed colors above?");
			System.out.println("Enter your guess: ");
			// input correction
			guess = key.nextLine();
			guess = guess.toLowerCase();
			
			
			
			switch(colorNum) {
			
				case 1:
					compColor = COLOR_BLACK;
					if(guess.equals(COLOR_BLACK))
						correctCounter++;
					break;
				
				case 2:
					compColor = COLOR_WHITE;
					if(guess.equals(COLOR_WHITE))
						correctCounter++;
					break;
					
				case 3:
					compColor = COLOR_GRAY;
					if(guess.equals(COLOR_GRAY))
						correctCounter++;
					break;
					
				case 4:
					compColor = COLOR_SILVER;
					if(guess.equals(COLOR_SILVER))
						correctCounter++;
					break;
				
				case 5:
					compColor = COLOR_MAROON;
					if(guess.equals(COLOR_MAROON))
						correctCounter++;
					break;
				
				case 6:
					compColor = COLOR_RED;
					if(guess.equals(COLOR_RED))
						correctCounter++;
					break;
					
				case 7:
					compColor = COLOR_PURPLE;
					if(guess.equals(COLOR_PURPLE))
						correctCounter++;
					break;
					
				case 8:
					compColor = COLOR_FUCHSIA;
					if(guess.equals(COLOR_FUCHSIA))
						correctCounter++;
					break;
			
				case 9:
					compColor = COLOR_GREEN;
					if(guess.equals(COLOR_GREEN))
						correctCounter++;
					break;
					
				case 10:
					compColor = COLOR_LIME;
					if(guess.equals(COLOR_LIME))
						correctCounter++;
					break;
					
				case 11:
					compColor = COLOR_OLIVE;
					if(guess.equals(COLOR_OLIVE))
						correctCounter++;
					break;
					
				case 12:
					compColor = COLOR_YELLOW;
					if(guess.equals(COLOR_YELLOW))
						correctCounter++;
					break;
					
				case 13:
					compColor = COLOR_BLUE;
					if(guess.equals(COLOR_BLUE))
						correctCounter++;
					break;
					
				case 14:
					compColor = COLOR_NAVY;
					if(guess.equals(COLOR_NAVY))
						correctCounter++;
					break;
					
				case 15:
					compColor = COLOR_TEAL;
					if(guess.equals(COLOR_TEAL))
						correctCounter++;
					break;
					
				case 16:
					compColor = COLOR_AQUA;
					if(guess.equals(COLOR_AQUA))
						correctCounter++;
					break;
					
					
				default:
					break;
			
			}
			
			System.out.println("\nI was thinking of " + compColor.substring(0,1).toUpperCase() + compColor.substring(1) + ".");
			
			
			
		}
		
		System.out.println("\nGame Over");
		
		System.out.println("\nYou guessed " + correctCounter + " out of 3 correctly.");
		
		// get user info
		System.out.print("Enter your name: ");
		String name = key.nextLine();
		
		System.out.print("Describe yourself: ");
		String description = key.nextLine();

		System.out.print("Due Date: ");
		String dueDate = key.nextLine();
		
		System.out.println("Student Name: " + name);
		System.out.println("User Description: " + description);
		System.out.println("Due Date: " + dueDate);
		
		key.close();
		
		
	}

}
