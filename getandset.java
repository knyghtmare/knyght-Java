public class getandset {
    public static void main(String [] args) {
        // code here
        Movie movie1 = new Movie("The Avengers", "Joss Whedon", "R");
        Movie movie2 = new Movie("The Avengers", "Joss Whedon", "R");
        Movie movie3 = new Movie("The Avengers", "Joss Whedon", "R");

        movie1.setRating("Trash");
        System.out.println(movie1.getRating());
    }
}