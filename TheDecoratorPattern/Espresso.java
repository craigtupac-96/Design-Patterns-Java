/*
Author: Craig Lawlor
Source: Head First - Design Patterns 
*/

public class Espresso extends Beverage {
	private double espressoCost = 1.99;
	
	public Espresso() {
		description = "Espresso";
	}
	
	@Override
	public double cost() {
		return espressoCost;
	}
}
