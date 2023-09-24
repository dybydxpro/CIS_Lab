package moviemanager.Modals;

import java.util.*;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class Rental {
	private String renteddate;
	private String returndate;
	private double amount;
	private ArrayList<Movie> movies;
	private Customer customer;
	
	public Rental(String renteddate, String returndate, double amount, ArrayList<Movie> movies, Customer customer) {
		super();
		this.renteddate = renteddate;
		this.returndate = returndate;
		this.amount = amount;
		this.movies = movies;
		this.customer = customer;
	}

	public String getRenteddate() {
		return renteddate;
	}

	public void setRenteddate(String renteddate) {
		this.renteddate = renteddate;
	}

	public String getReturndate() {
		return returndate;
	}

	public void setReturndate(String returndate) {
		this.returndate = returndate;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public ArrayList<Movie> getMovies() {
		return movies;
	}

	public void setMovies(ArrayList<Movie> movies) {
		this.movies = movies;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}


	public void calculateRentalAmount() {
		try {
			double val = 0;
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MMM-dd");
			Date dt1 = new SimpleDateFormat("dd-MM-yyyy").parse(this.renteddate);
			Date dt2 = new SimpleDateFormat("dd-MM-yyyy").parse(this.returndate);
			long diff = dt2.getTime() - dt1.getTime();
			int days = (int)((diff)/(1000*60*60*24));
			
			for(int i = 0; i > movies.size(); ++i) {
				double amount = movies.get(i).getDailyrate() * days;
				val = val + amount;
			}
			
			this.amount = val;
		}
		catch(Exception e) {
			this.amount = 0;
		}
	}
	
	public void findReturnDate(int numberOfDays) {
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			Calendar c = Calendar.getInstance();
			c.setTime(new Date());
			c.add(Calendar.DATE, numberOfDays);
			String output = sdf.format(c.getTime());
			this.returndate = output;
		}
		catch(Exception e) {}
	}
}
