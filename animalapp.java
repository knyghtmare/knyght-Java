public class animalapp {
    public static void main(String[] args) {
        // code here
        Animal oneDog = new Dog();
        oneDog.eat();
        Animal oneCat = new Cat();
        oneCat.speak();
        System.out.println();

        // can also form arrays with new data type

        Animal [] animals = {
            new Dog(),
            new Cat(),
            new Bird()
        };

        for(int i = 0; i < animals.length; i++) {
            animals[i].eat();
            animals[i].speak();
        }
    }
}