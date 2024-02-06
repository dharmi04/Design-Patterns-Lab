public class parts {
    public static void main(String[] args) {
        Component table = new Leaf(1500, "Table");
        Component chair = new Leaf(800, "Chair");
        Component gamingLaptop = new Leaf(250000, "Gaming Laptop");
        Component dailyUseLaptop = new Leaf(120000, "Daily Use Laptop");
        Component iphone13 = new Leaf(55000, "iPhone 13");
        Component iphone14 = new Leaf(70000, "iPhone 14");
        Component iphone15 = new Leaf(75000, "iPhone 15");
        Component samsungA = new Leaf(25000, "Samsung Galaxy A");
        Component samsungS = new Leaf(76000, "Samsung Galaxy S");
        Component samsungM = new Leaf(20000, "Samsung Galaxy M");

        Composite furniture = new Composite("Furniture");
        furniture.addComponent(table);
        furniture.addComponent(chair);

        Composite laptop = new Composite("Laptop");
        laptop.addComponent(gamingLaptop);
        laptop.addComponent(dailyUseLaptop);

        Composite iphone = new Composite("iPhone");
        iphone.addComponent(iphone13);
        iphone.addComponent(iphone14);
        iphone.addComponent(iphone15);

        Composite samsung = new Composite("Samsung");
        samsung.addComponent(samsungA);
        samsung.addComponent(samsungS);
        samsung.addComponent(samsungM);

        Composite smartphones = new Composite("Smartphones");
        smartphones.addComponent(iphone);
        smartphones.addComponent(samsung);

        Composite Products = new Composite("Products");

        Products.addComponent(furniture);
        Products.addComponent(smartphones);
        Products.addComponent(laptop);

        Products.showPrice();

    }
}