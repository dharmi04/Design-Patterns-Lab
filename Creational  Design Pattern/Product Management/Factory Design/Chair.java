class Chair implements Furniture {
    @Override
    public void displayInfo() {
        System.out.println("Chair: A comfortable seating option.");
    }

    @Override
    public void assemble() {
        System.out.println("Assembling a chair.");
    }
}