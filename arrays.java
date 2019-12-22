public class arrays {
    public static void main(String[] args) {
        String [] friends = {"Ishty", "Mahnaz", "Anika", "Sauda", "Faria", "Mahir"};

        System.out.println(friends[3]);
        // length of an array
        System.out.println(friends.length);

        // defining a blank array
        String [] anime = new String[3];
        anime[0] = "Neon Genesis Evangelion";
        anime[1] = "Kimetsu no Yaiba";
        anime[2] = "Code Geass";

        System.out.println(anime[1]);
    }
}