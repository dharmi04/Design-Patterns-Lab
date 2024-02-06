class ApplePhone implements Product {
    @Override
    public void displayInfo() {
        System.out.println("Apple Phone: Premium smartphone by Apple.");
    }

    @Override
    public Product cloneProduct() {
        return new ApplePhone();
    }
}