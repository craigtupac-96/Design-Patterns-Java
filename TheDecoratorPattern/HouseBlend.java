/*
Author: Craig Lawlor
Source: Head First - Design Patterns 
*/

public class HouseBlend extends Beverage {
	private double houseBlendCost = 0.89;
	
	public HouseBlend() {
		description = "House Blend Coffee";
	}
	
	@Override
	public double cost() {
		return houseBlendCost;
	}
}
