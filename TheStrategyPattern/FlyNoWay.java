/*
Author: Craig Lawlor
Source: Head First - Design Patterns 
*/

public class FlyNoWay implements IFlyBehavior {

	@Override
	public void fly() {
		System.out.println("I can't fly");		
	}
}
