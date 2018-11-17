/*
Author: Craig Lawlor
Source: Head First - Design Patterns 
*/
import java.util.Scanner;

public class PizzaTestDrive {

	public static void main(String[] args) {
		
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();
		Scanner input = new Scanner(System.in);
		
		Pizza pizza = null;
		
		System.out.println("Choose a store: \nNY=1, \nChicago=2");
		int storeOption = input.nextInt();
		
		System.out.println("Choose pizza type: \nCheese = 1 \nClam = 2 \nVeggie = 3 \nPepperoni = 4 ");
		int pizzaType = input.nextInt();
		
		switch (storeOption) {
			case 1: 
				switch (pizzaType) {
					case 1: pizza = nyStore.orderPizza("cheese");
						break;
					case 2: pizza = nyStore.orderPizza("clam");
						break;
					case 3: pizza = nyStore.orderPizza("veggie");
						break;
					case 4: pizza = nyStore.orderPizza("pepperoni");
						break;
				}	
			case 2: 
				switch (pizzaType) {
					case 1: pizza = chicagoStore.orderPizza("cheese");
						break;
					case 2: pizza = chicagoStore.orderPizza("clam");
						break;
					case 3: pizza = chicagoStore.orderPizza("veggie");
						break;
					case 4: pizza = chicagoStore.orderPizza("pepperoni");
						break;
				}
		}
		
		System.out.println("Stan ordered a " + pizza.getName() + "\n");
	}
}
