class Smartphone implements Product {
    @Override
    public void displayInfo() {
        System.out.println("Smartphone: Portable communication device.");
    }

    @Override
    public Product cloneProduct() {
        return new Smartphone();
    }
}