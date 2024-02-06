class HealthyMeal implements Meal {
    @Override
    public void prepareMainCourse() {
        System.out.println("Preparing grilled chicken with steamed vegetables.");
    }

    @Override
    public void prepareSide() {
        System.out.println("Preparing quinoa salad.");
    }

    @Override
    public void serve() {
        System.out.println("Serving a healthy meal.");
    }

    @Override
    public Object getMainCourse() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getMainCourse'");
    }

    @Override
    public Object getSide() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getSide'");
    }
}