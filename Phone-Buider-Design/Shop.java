

public class Shop {
    public static void main(String[] args) {
        // phone p= new phone("Android",8, "Intel", 3100);
        phone p=new Phone_Builder().setOs("Android").setBattery(2500).getPhone();
        System.out.println(p);//
    }
}
