

class FurnitureAdapter implements Product {
    private FurnitureFactory furnitureFactory;

    public FurnitureAdapter(FurnitureFactory furnitureFactory) {
        this.furnitureFactory = furnitureFactory;
    }

    @Override
    public void createProduct() {
        furnitureFactory.createFurniture();
    }
}


