import java.util.ArrayList;
import java.util.List;

public class MealBuilder implements Cloneable {
    private List<Meal> mealList;

    public MealBuilder() {
        this.mealList = new ArrayList<>();
    }

    public void addMeal(Meal meal) {
        mealList.add(meal);
    }

    public List<Meal> getMealList() {
        return new ArrayList<>(mealList); // Return a copy to prevent external modification
    }

    @Override
public MealBuilder clone() {
    try {
        MealBuilder clonedBuilder = (MealBuilder) super.clone();
        // Perform a deep copy of the meals in the builder
        clonedBuilder.mealList = new ArrayList<>();
        for (Meal meal : this.mealList) {
            clonedBuilder.mealList.add(new Meal(meal.getMealname(),
 meal.getRestname()));
            }
            return clonedBuilder;
        } catch (CloneNotSupportedException e) {
            // Handle clone not supported exception
            return null;
        }
    }
    
}
