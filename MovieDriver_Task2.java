import java.util.*;

public class MovieDriver_Task2 {

	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		String loop = "y";
		
		
		do {
		
		Movie theMovie = new Movie();
		
		System.out.println("Enter name of a movie");
		theMovie.setTitle(key.nextLine());
		
		System.out.println("Enter the rating of the movie");
		theMovie.setRating(key.nextLine());
		
		System.out.println("Enter the number of tickets sold for this movie");
		theMovie.setSoldTickets(key.nextInt());
		
		System.out.println(theMovie);
		
		key.nextLine();
		
		System.out.println("Do you want to enter another? (y or n)");
		loop = key.nextLine();
		
		}while(!loop.equals("n"));
		
		System.out.print("Goodbye");

	}

}
