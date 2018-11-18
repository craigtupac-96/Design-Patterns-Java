/*
Author: Craig Lawlor
Source: Head First - Design Patterns 
*/

public class Whip extends CondimentDecorator {
	Beverage beverage;
	private double whipCost = 0.10;
 
	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}
 
	public String getDescription() {
		return beverage.getDescription() + ", Whip";
	}
 
	public double cost() {
		return whipCost + beverage.cost();
	}
}