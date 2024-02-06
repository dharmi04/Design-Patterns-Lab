public class Demo {
    public static void main(String[] args) {
        MealBuilder originalBuilder = new MealBuilder();

        Meal meal1 = new Meal();
        meal1.setMealname("Burger");
        meal1.setRestname("Fast Food Place");

        Meal meal2 = new Meal();
        meal2.setMealname("Salad");
        meal2.setRestname("Healthy Restaurant");

        originalBuilder.addMeal(meal1);
        originalBuilder.addMeal(meal2);

        // Clone the original builder
        MealBuilder clonedBuilder = originalBuilder.clone();

        // Add a new meal to the cloned builder
        Meal newMeal = new Meal();
        newMeal.setMealname("Pizza");
        newMeal.setRestname("Italian Restaurant");
        clonedBuilder.addMeal(newMeal);

        // Display meals in the original and cloned builders
        System.out.println("Original Builder Meals:");
        for (Meal meal : originalBuilder.getMealList()) {
            System.out.println(meal);
        }

        System.out.println("\nCloned Builder Meals:");
        for (Meal meal : clonedBuilder.getMealList()) {
            System.out.println(meal);
        }
    }
}
