package builder;

public class BuilderDemo {

	public static void main(String[] args) {
		
		MealBuilder mealBuilder = new MealBuilder();
		
		Meal prepareNonVagMeal = mealBuilder.prepareNonVagMeal();
		Meal prepareVagMeal = mealBuilder.prepareVagMeal();
		System.out.println("prepareNonVagMeal:");
		prepareNonVagMeal.showItems();
		System.out.println("Total Cost :" + prepareNonVagMeal.getCost());
		System.out.println();
		System.out.println("prepareVagMeal :");
		prepareVagMeal.showItems();
		System.out.println("Total Cost :" + prepareVagMeal.getCost());
	}
}
