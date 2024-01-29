public class Demo {
 public static void main(String[] args) throws CloneNotSupportedException {
    BookShop bs= new BookShop();
    bs.loadData();
    bs.setShopName("Shop 1");

    BookShop bs1 =bs.clone();
    bs1.setShopName("Shop 2"
    )
    System.out.println(bs);



 }   
}
