class SmartphoneAdapter implements Product {
    private SmartphoneFactory smartphoneFactory;

    public SmartphoneAdapter(SmartphoneFactory smartphoneFactory) {
        this.smartphoneFactory = smartphoneFactory;
    }

    @Override
    public void createProduct() {
        smartphoneFactory.createSmartphone();
    }
}