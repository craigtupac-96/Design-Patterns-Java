/*
Author: Craig Lawlor
Source: Head First - Design Patterns 
*/

public class DuckSimulator {

	public static void main(String[] args) {
		
		RubberDuck rubberDuck = new RubberDuck();
		MallardDuck mallardDuck = new MallardDuck();
		
		mallardDuck.performQuack();
		rubberDuck.performQuack();
		
		mallardDuck.performFly();
		rubberDuck.performFly();
	}
}
