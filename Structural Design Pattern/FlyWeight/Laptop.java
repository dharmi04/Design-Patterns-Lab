public class Laptop implements Product {
    private String color;

    public Laptop(String color){
        this.color = color;
    }

    public void create(){
        System.out.println("Creating a " + color + " laptop");
    }
}
