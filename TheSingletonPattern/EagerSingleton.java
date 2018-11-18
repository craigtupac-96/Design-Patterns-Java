/*
Author: Craig Lawlor
Source: Head First - Design Patterns 
*/

public class EagerSingleton {

	private static EagerSingleton uniqueInstance = new EagerSingleton();
	
	// Note: Private constructor
	private EagerSingleton() {}
	
	// Note: Eager singleton, the object is only created at loading time
	public static EagerSingleton getInstance() {
		return uniqueInstance;
	}
	
	public String getescription() {
		return "I'm a statically initialised Eager Singleton!";
	}
}
