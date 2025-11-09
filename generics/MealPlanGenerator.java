interface MealPlan {}
class VegetarianMeal implements MealPlan {}
class VeganMeal implements MealPlan {}
class KetoMeal implements MealPlan {}

class Meal<T extends MealPlan> {
    private T plan;
    public Meal(T plan) { this.plan = plan; }
    public T getPlan() { return plan; }
}

public class MealPlanGenerator {
    public static <T extends MealPlan> void generateMealPlan(T meal) {
        System.out.println("Generated meal plan: " + meal.getClass().getSimpleName());
    }

    public static void main(String[] args) {
        generateMealPlan(new VeganMeal());
    }
}
