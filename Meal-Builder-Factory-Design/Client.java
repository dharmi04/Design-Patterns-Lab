import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Client {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            createAndShowGUI();
        });
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Meal Builder");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);
        frame.setLayout(null);

        JButton healthyMealButton = new JButton("Healthy Meal");
        healthyMealButton.setBounds(20, 20, 120, 30);

        JButton junkMealButton = new JButton("Junk Meal");
        junkMealButton.setBounds(160, 20, 120, 30);

        frame.add(healthyMealButton);
        frame.add(junkMealButton);

        healthyMealButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String mainCourse = JOptionPane.showInputDialog("Enter main course for Healthy Meal:");
                String side = JOptionPane.showInputDialog("Enter side for Healthy Meal:");
                MealBuilder mealBuilder = new HealthyMealBuilder(mainCourse, side);
                constructAndDisplayMeal(mealBuilder);
            }
        });

        junkMealButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String mainCourse = JOptionPane.showInputDialog("Enter main course for Junk Meal:");
                String side = JOptionPane.showInputDialog("Enter side for Junk Meal:");
                MealBuilder mealBuilder = new JunkMealBuilder(mainCourse, side);
                constructAndDisplayMeal(mealBuilder);
            }
        });

        frame.setVisible(true);
    }

    private static void constructAndDisplayMeal(MealBuilder mealBuilder) {
        MealDirector mealDirector = new MealDirector();
        Meal meal = mealDirector.constructMeal(mealBuilder);
        displayMealDetails(meal);
    }

    private static void displayMealDetails(Meal meal) {
        JOptionPane.showMessageDialog(null, getMealDetails(meal), "Meal Details", JOptionPane.INFORMATION_MESSAGE);
    }

    private static String getMealDetails(Meal meal) {
        StringBuilder details = new StringBuilder();
        details.append("Meal Details:\n");
        details.append("-------------------\n");
        details.append("Main Course: ").append(meal.getMainCourse()).append("\n");
        details.append("Side: ").append(meal.getSide()).append("\n");
        details.append("Serving: ");
        meal.serve();

        return details.toString();
    }
}
