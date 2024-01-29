// Client.java
public class Client {
    public static void main(String[] args) {
        Builder builder1 = new ConcreteBuilder1();
        Director director1 = new Director(builder1);
        director1.construct("Burger", "Coke");
        Product product1 = builder1.getResult();
        System.out.println("Food Item from Builder1(Main Course): " + product1);

        Builder builder2 = new ConcreteBuilder2();
        Director director2 = new Director(builder2);
        director2.construct("Brownie", "Ice-cream");
        Product product2 = builder2.getResult();
        System.out.println("Food Item from Builder2(Dessert): " + product2);
    }
}
