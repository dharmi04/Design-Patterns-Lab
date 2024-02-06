class Smartphone implements Product {
    private String base;
    private String additionalFeatures;

    public void setBase(String base) {
        this.base = base;
    }

    public void setAdditionalFeatures(String additionalFeatures) {
        this.additionalFeatures = additionalFeatures;
    }

    @Override
    public void displayInfo() {
        System.out.println("Smartphone - Base: " + base + ", Additional Features: " + additionalFeatures);
    }
}