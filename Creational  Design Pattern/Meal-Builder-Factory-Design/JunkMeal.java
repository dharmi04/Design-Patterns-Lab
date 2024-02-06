class JunkMeal implements Meal {
    @Override
    public void prepareMainCourse() {
        System.out.println("Preparing burger with fries.");
    }

    @Override
    public void prepareSide() {
        System.out.println("Preparing cola to go with the burger and fries.");
    }

    @Override
    public void serve() {
        System.out.println("Serving a junk meal.");
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