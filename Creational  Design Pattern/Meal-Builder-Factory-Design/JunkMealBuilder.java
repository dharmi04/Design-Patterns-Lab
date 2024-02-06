class JunkMealBuilder implements MealBuilder {
    private Meal meal;

    public JunkMealBuilder(String mainCourse, String side) {
        this.meal = new JunkMeal();
    }

    @Override
    public void buildMainCourse() {
        meal.prepareMainCourse();
    }

    @Override
    public void buildSide() {
        meal.prepareSide();
    }

    @Override
    public Meal getMeal() {
        return meal;
    }
}
