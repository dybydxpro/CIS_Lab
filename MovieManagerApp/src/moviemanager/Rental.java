package moviemanager;

import java.util.*;
import java.text.SimpleDateFormat;

/**
 * @author TharinduD
 */
public class Rental {
    private String renteddate;
    private String returndate;
    private double amount;
    private ArrayList<Movie> movies;
    private Customer customer;

    /**
     * Rental constructor without returndate & amount.
     *
     * @param renteddate
     * @param movies
     * @param customer
     */
    public Rental(String renteddate, ArrayList<Movie> movies, Customer customer) {
        this.renteddate = renteddate;
        this.movies = movies;
        this.customer = customer;
    }

    /**
     * Get renteddate from Rental class.
     *
     * @return renteddate
     */
    public String getRenteddate() {
        return renteddate;
    }

    /**
     * Set renteddate to Rental class.
     *
     * @param renteddate
     */
    public void setRenteddate(String renteddate) {
        this.renteddate = renteddate;
    }

    /**
     * Get returndate from Rental class.
     *
     * @return returndate
     */
    public String getReturndate() {
        return returndate;
    }

    /**
     * Set returndate to Rental class.
     *
     * @param returndate
     */
    public void setReturndate(String returndate) {
        this.returndate = returndate;
    }

    /**
     * Get amount from Rental class.
     *
     * @return amount
     */
    public double getAmount() {
        return amount;
    }

    /**
     * Set amount to Rental class.
     *
     * @param amount
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }

    /**
     * Get movies from Rental class.
     *
     * @return movies
     */
    public ArrayList<Movie> getMovies() {
        return movies;
    }

    /**
     * Set movies to Rental class.
     *
     * @param movies
     */
    public void setMovies(ArrayList<Movie> movies) {
        this.movies = movies;
    }

    /**
     * Get customer from Rental class.
     *
     * @return customer
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     * Set customer to Rental class.
     *
     * @param customer
     */
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    /**
     * This function for calculate rental amount.
     *
     * @throws RuntimeException
     */
    public void calculateRentalAmount() {
        try {
            /**
             * Create variable as "netValue"
             */
            double netValue = 0;

            /**
             * The "renteddate" variable type is String.
             * "renteddate" convert as Date value.
             */
            Date dt1 = new SimpleDateFormat("dd/MM/yyyy").parse(this.renteddate);

            /**
             * The "returndate" variable type is String.
             * "returndate" convert as Date value.
             */
            Date dt2 = new SimpleDateFormat("dd/MM/yyyy").parse(this.returndate);

            /**
             * Get difference between rented date and returned date
             */
            long diff = dt2.getTime() - dt1.getTime();

            /**
             * Date difference convert to Number (to integer value).
             */
            int days = (int)((diff)/(1000*60*60*24));

            /**
             * Calculate net amount of rental fee.
             */
            for(int i = 0; i < movies.size(); ++i) {
                double amount = movies.get(i).getDailyrate() * days;
                netValue = netValue + amount;
            }

            /**
             * Set the net rental fee as amount
             */
            this.amount = netValue;
        }
        catch(Exception e) {
            /**
             * If there any issue in above-mentioned process.
             */
            throw new RuntimeException(e);
        }
    }

    /**
     * This function for find the return date.
     *
     * @param numberOfDays
     * @throws RuntimeException
     */
    public void findReturnDate(int numberOfDays) {
        try {
            /**
             * Make simple date format
             */
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

            /**
             * Make calander instance.
             */
            Calendar c = Calendar.getInstance();

            /**
             * Set renteddate to calander instance.
             */
            c.setTime(new SimpleDateFormat("dd/MM/yyyy").parse(this.renteddate));

            /**
             * Add number of days that given by parameter
             */
            c.add(Calendar.DATE, numberOfDays);

            /**
             * Convert returneddate to String.
             */
            String output = sdf.format(c.getTime());

            /**
             * Set return date as output value.
             */
            this.returndate = output;
        }
        catch(Exception e) {
            /**
             * If there any issue in above-mentioned process.
             */
            throw new RuntimeException(e);
        }
    }
}
