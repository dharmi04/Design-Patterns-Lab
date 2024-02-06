class DailyUseLaptop implements Product {
    @Override
    public void displayInfo() {
        System.out.println("Daily-Use Laptop: Reliable laptop for everyday tasks.");
    }

    @Override
    public Product cloneProduct() {
        return new DailyUseLaptop();
    }
}