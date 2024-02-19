interface Product {
    void displayInfo();
}

class ApplePhone implements Product {
    @Override
    public void displayInfo() {
        System.out.println("Apple Phone: Premium smartphone with iOS.");
    }

    // Factory method for creating instances of ApplePhone
    public static ApplePhone create() {
        return new ApplePhone();
    }
}

class Chair implements Product {
    @Override
    public void displayInfo() {
        System.out.println("Chair: A comfortable seating option.");
    }

    // Factory method for creating instances of Chair
    public static Chair create() {
        return new Chair();
    }
}

class DailyUseLaptop implements Product {
    @Override
    public void displayInfo() {
        System.out.println("Daily-Use Laptop: Reliable laptop for everyday tasks.");
    }

    // Factory method for creating instances of DailyUseLaptop
    public static DailyUseLaptop create() {
        return new DailyUseLaptop();
    }
}

class GamingLaptop implements Product {
    @Override
    public void displayInfo() {
        System.out.println("Gaming Laptop: High-performance laptop for gaming enthusiasts.");
    }

    // Factory method for creating instances of GamingLaptop
    public static GamingLaptop create() {
        return new GamingLaptop();
    }
}

class SamsungPhone implements Product {
    @Override
    public void displayInfo() {
        System.out.println("Samsung Phone: Feature-rich Android smartphone.");
    }

    // Factory method for creating instances of SamsungPhone
    public static SamsungPhone create() {
        return new SamsungPhone();
    }
}

class Table implements Product {
    @Override
    public void displayInfo() {
        System.out.println("Table: A flat surface for various purposes.");
    }

    // Factory method for creating instances of Table
    public static Table create() {
        return new Table();
    }
}

public class Demo {
    public static void main(String[] args) {
        // Create and display different types of products using factory methods
        ApplePhone.create().displayInfo();
        Chair.create().displayInfo();
        DailyUseLaptop.create().displayInfo();
        GamingLaptop.create().displayInfo();
        SamsungPhone.create().displayInfo();
        Table.create().displayInfo();
    }
}
