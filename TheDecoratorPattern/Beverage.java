/*
Author: Craig Lawlor
Source: Head First - Design Patterns 
*/

public abstract class Beverage {

	String description = "Unknown Beverage";
	
	public String getDescription() {
		return description;
	}
	
	public abstract double cost();
}
