class MealDirector {
    public Meal constructMeal(MealBuilder mealBuilder) {
        mealBuilder.buildMainCourse();
        mealBuilder.buildSide();
        mealBuilder.getMeal().serve();
        return mealBuilder.getMeal();
    }
}