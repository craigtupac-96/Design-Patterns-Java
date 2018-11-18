/*
Author: Craig Lawlor
Source: Head First - Design Patterns 
*/

public class DarkRoast extends Beverage {
	private double darkRoastCost = 0.99;
	
	public DarkRoast() {
		description = "Dark Roast Coffee";
	}
	
	@Override
	public double cost() {
		return darkRoastCost;
	}
}
