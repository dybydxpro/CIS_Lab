package moviemanager;

/**
 * @author TharinduD
 */
public class Movie {
    private String title;
    private int year;
    private double rating;
    private int dailyrate;

    /**
     * Movie constructor with parameters.
     *
     * @param title
     * @param year
     * @param rating
     * @param dailyrate
     */
    public Movie(String title, int year, double rating, int dailyrate) {
        this.title = title;
        this.year = year;
        this.rating = rating;
        this.dailyrate = dailyrate;
    }

    /**
     * Get title from Movie class.
     *
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Set title to Movie class.
     *
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Get year from Movie class.
     *
     * @return year
     */
    public int getYear() {
        return year;
    }

    /**
     * Set year to Movie class.
     *
     * @param year
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * Get rating from Movie class.
     *
     * @return rating
     */
    public double getRating() {
        return rating;
    }

    /**
     * Set rating to Movie class.
     *
     * @param rating
     */
    public void setRating(double rating) {
        this.rating = rating;
    }

    /**
     * Get dailyrate from Movie class.
     *
     * @return dailyrate
     */
    public int getDailyrate() {
        return dailyrate;
    }

    /**
     * Set dailyrate to Movie class.
     *
     * @param dailyrate
     */
    public void setDailyrate(int dailyrate) {
        this.dailyrate = dailyrate;
    }
}
