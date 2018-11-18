/*
Author: Craig Lawlor
Source: Head First - Design Patterns 
*/

public class LazySingleton {

	private static LazySingleton uniqueInstance = null;
	
	// Note: Private constructor
	private LazySingleton() {}
	
	// Note: Lazy singleton, the object is only created when needed
	public static LazySingleton getInstance() {
		if(uniqueInstance == null) {
			uniqueInstance = new LazySingleton();
		}
		return uniqueInstance;
	}
	
	// The Lazy Singleton is not thread safe
	public String getescription() {
		return "I'm a statically initialised Lazy Singleton!";
	}
}
