public class inheritance {
    public static void main(String [] args) {
        Chef normalChef = new Chef();

        normalChef.makeChicken();
        normalChef.makeSalad();
        normalChef.makeSpecial();

        ItalianChef italianChef = new ItalianChef();

        italianChef.makeSpecial();
    }
}