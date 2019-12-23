public class objects {
    public static void main(String [] args) {
        // code here
        Student myStudent = new Student();
        myStudent.firstName = "Ishty";
        myStudent.lastName = "Ahmed";
        myStudent.major = "ENV studies";
        myStudent.gpa = 3.50;
        myStudent.age = 23;
        myStudent.onProbation = false;

        // System.out.println(myStudent.onProbation);

        Book myBook = new Book("Lord of the Rings", "Tolkien", 1000);
        /*
        myBook.title = "Lord of the Rings";
        myBook.pages = 1000;
        myBook.author = "Tolkien";
        */

        System.out.println(myBook.title);
    }
}
