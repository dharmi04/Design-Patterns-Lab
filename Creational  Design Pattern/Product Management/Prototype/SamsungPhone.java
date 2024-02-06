class SamsungPhone implements Product {
    @Override
    public void displayInfo() {
        System.out.println("Samsung Phone: Feature-packed smartphone by Samsung.");
    }

    @Override
    public Product cloneProduct() {
        return new SamsungPhone();
    }
}