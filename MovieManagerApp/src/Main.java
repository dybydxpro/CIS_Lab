import moviemanager.Customer;
import moviemanager.Movie;
import moviemanager.Rental;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Sunimal", "Malwaththa Road, Dambana.", "User");

        ArrayList<Movie> movies = new ArrayList<Movie>();
        movies.add(new Movie("Luck", 2022, 6.4, 25));
        movies.add(new Movie("The Lost City", 2022, 6.0, 30));
        movies.add(new Movie("The Bad Guys", 2022, 8.1, 20));

        Rental rental = new Rental("15/09/2023", movies, customer);

        rental.findReturnDate(10);
        System.out.println("Return date: " + rental.getReturndate());

        rental.calculateRentalAmount();
        System.out.println("Rental amount: " + rental.getAmount());
    }
}