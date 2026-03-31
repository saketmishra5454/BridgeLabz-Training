import java.util.*;

// Base interface for all meal plans
interface MealPlan {
    String getType();      // returns name e.g., "Vegetarian"
    String getMenuItems(); // returns food items
}

// Subtype for Vegetarian Meal
class VegetarianMeal implements MealPlan {

    @Override
    public String getType() {
        return "Vegetarian Meal";
    }

    @Override
    public String getMenuItems() {
        return "Paneer, Dal, Rice, Salad";
    }
}

// Subtype for Vegan Meal
class VeganMeal implements MealPlan {

    @Override
    public String getType() {
        return "Vegan Meal";
    }

    @Override
    public String getMenuItems() {
        return "Tofu, Lentils, Brown Rice, Veg-Salad";
    }
}

// Subtype for Keto Meal
class KetoMeal implements MealPlan {

    @Override
    public String getType() {
        return "Keto Meal";
    }

    @Override
    public String getMenuItems() {
        return "Eggs, Chicken, Cheese, Avocado";
    }
}

// Subtype for High-Protein Meal
class HighProteinMeal implements MealPlan {

    @Override
    public String getType() {
        return "High-Protein Meal";
    }

    @Override
    public String getMenuItems() {
        return "Chicken Breast, Eggs, Greek Yogurt, Protein Shake";
    }
}

// Generic class for handling different types of meals

class Meal<T extends MealPlan> {
    private T mealPlan;

    public Meal(T mealPlan) {
        this.mealPlan = mealPlan;
    }

    public T getMealPlan() {
        return mealPlan;
    }
}

// Main utility class containing generic method for meal generation
class MealGenerator {

    // Generic Method for validating & generating personalized meal
    public static <T extends MealPlan> Meal<T> generateMealPlan(T mealType) {
        System.out.println("\nGenerating your personalized meal...");

        // validation simple check 
        if (mealType == null) {
            throw new IllegalArgumentException("Invalid meal type selected!");
        }
        return new Meal<>(mealType);
    }
}

// Main class to test everything 
public class MealPlanGenerator{
    public static void main(String[] args) {

        // Creating different meal types
        VegetarianMeal veg = new VegetarianMeal();
        VeganMeal vegan = new VeganMeal();
        KetoMeal keto = new KetoMeal();
        HighProteinMeal hp = new HighProteinMeal();

        // Generating meal plans using generic method
        Meal<VegetarianMeal> vegMeal = MealGenerator.generateMealPlan(veg);
        Meal<VeganMeal> veganMeal = MealGenerator.generateMealPlan(vegan);
        Meal<KetoMeal> ketoMeal = MealGenerator.generateMealPlan(keto);
        Meal<HighProteinMeal> hpMeal = MealGenerator.generateMealPlan(hp);

        // Displaying personalized results
        displayMealPlan(vegMeal);
        displayMealPlan(veganMeal);
        displayMealPlan(ketoMeal);
        displayMealPlan(hpMeal);
    }

    // Helper method to print details
    public static void displayMealPlan(Meal<? extends MealPlan> meal) {
        System.out.println(meal.getMealPlan().getType() + " -> Items: " + meal.getMealPlan().getMenuItems());
    }
}
