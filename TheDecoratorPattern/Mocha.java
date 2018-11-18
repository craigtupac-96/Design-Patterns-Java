/*
Author: Craig Lawlor
Source: Head First - Design Patterns 
*/

public class Mocha extends CondimentDecorator {
	Beverage beverage;
	private double mochaCost = 0.20;
 
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}
 
	public String getDescription() {
		return beverage.getDescription() + ", Mocha";
	}
 
	public double cost() {
		return mochaCost + beverage.cost();
	}
}