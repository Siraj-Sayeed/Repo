import java.util.*;

public class MovieDriver_Task1 {

	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);		

		
		Movie theMovie = new Movie();
		
		System.out.println("Enter name of a movie");
		theMovie.setTitle(key.nextLine());
		
		System.out.println("Enter the rating of the movie");
		theMovie.setRating(key.nextLine());
		
		System.out.println("Enter the number of tickets sold for this movie");
		theMovie.setSoldTickets(key.nextInt());
		
		System.out.println(theMovie);
		
		System.out.print("Goodbye");

	}

}
