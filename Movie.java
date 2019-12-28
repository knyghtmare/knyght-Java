public class Movie {
    public String title;
    public String director;
    private String rating;
    private static int moviecount = 0;

    public Movie(String title, String director, String rating) {
        // code here
        this.title = title;
        this.director = director;
        this.setRating(rating);
        moviecount++;
        System.out.println(moviecount);
    }

    public void setRating(String rating) {
        // code here
        if (rating.equals("G") || rating.equals("R") || rating.equals("NR") || rating.equals("PG-13")) {
            this.rating = rating;
        } else {
            this.rating = "NR";
            rating = "NR";
        }
    }

    public String getRating() {
        return rating;
    }
}