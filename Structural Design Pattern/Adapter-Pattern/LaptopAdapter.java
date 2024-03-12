

// Adapter classes
class LaptopAdapter implements Product{
    private LaptopFactory laptopFactory;

    public LaptopAdapter(LaptopFactory laptopFactory) {
        this.laptopFactory = laptopFactory;
    }

    @Override
    public void createProduct() {
        laptopFactory.createLaptop();
    }
}

