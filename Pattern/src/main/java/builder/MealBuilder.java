package builder;

public class MealBuilder {

	public Meal prepareVagMeal() {

		Meal meal = new Meal();
		meal.addItem(new VegBurger());
		meal.addItem(new Coke());

		return meal;
	}

	public Meal prepareNonVagMeal() {

		Meal meal = new Meal();
		meal.addItem(new ChickenBurger());
		meal.addItem(new Pepis());

		return meal;
	}
}
