public class forloops {
    public static void main(String [] args) {

        for ( int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        // for loops can print out arrays
        String[] friends = { "Ishty", "Mahnaz", "Anika", "Sauda", "Faria", "Mahir" };

        for (int i = 0; i < friends.length; i++) {
            System.out.println(friends[i]);
        }
    }
}