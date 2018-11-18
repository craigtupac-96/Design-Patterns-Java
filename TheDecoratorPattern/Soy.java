/*
Author: Craig Lawlor
Source: Head First - Design Patterns 
*/

public class Soy extends CondimentDecorator {
	Beverage beverage;
	private double soyCost = 0.15;
 
	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}
 
	public String getDescription() {
		return beverage.getDescription() + ", Soy";
	}
 
	public double cost() {
		return soyCost + beverage.cost();
	}
}