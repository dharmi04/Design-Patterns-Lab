public class SmartPhone implements Product {
    private String color;

    public SmartPhone(String color){
        this.color = color;
    }

    public void create(){
        System.out.println("Creating a " + color + " iPhone");
    }
}
