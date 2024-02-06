class HealthyMealBuilder implements MealBuilder {
    private Meal meal;

    public HealthyMealBuilder(String mainCourse, String side) {
        this.meal = new HealthyMeal();
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