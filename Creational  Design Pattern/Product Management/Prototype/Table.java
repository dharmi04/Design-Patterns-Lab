class Table implements Furniture {
    @Override
    public void displayInfo() {
        System.out.println("Table: A flat surface for various purposes.");
    }

    @Override
    public void assemble() {
        System.out.println("Assembling a table.");
    }

    @Override
    public Product cloneProduct() {
        return new Table();
    }
}