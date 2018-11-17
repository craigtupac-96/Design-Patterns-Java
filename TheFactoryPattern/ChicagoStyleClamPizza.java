/*
Author: Craig Lawlor
Source: Head First - Design Patterns 
*/

public class ChicagoStyleClamPizza extends Pizza {

	public ChicagoStyleClamPizza() {
		name = "Chicago Style Clam Pizza";
		dough = "Extra Thick Crust Dough";
		sauce = "Plum Tomato Sauce";
		
		toppings.add("Shredded Mozzarella Cheese");
		toppings.add("Frozen Clams from Chesapeake Bay");
	}
	
	void cut() {
		System.out.print("Cutting the pizza into square slices");
	}
}
