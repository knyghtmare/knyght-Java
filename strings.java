public class strings {
    public static void main(String [] args) {
        System.out.println("Knyght \"Codes\""); 

        String phrase = "Knyght Codes";

        // upper case
        System.out.println( phrase.toUpperCase() );

        // lower case
        System.out.println( phrase.toLowerCase() );

        // length - returns an integer
        System.out.println( phrase.length() );

        // contains - returns boolean
        System.out.println( phrase.contains("Code") );

        // charAt - returns a char
        System.out.println( phrase.charAt(7) );

        // indexOf - returns an int
        System.out.println( phrase.indexOf('y') );

        // substring
        System.out.println( phrase.substring(7, 11) );
    }
}