/*
Author: Craig Lawlor
Source: Head First - Design Patterns 
*/

public class RubberDuck extends Duck {

	public RubberDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Squeek();
	}
	
	public void display() {
		System.out.println("I'm a rubber duckie");
	}
}
