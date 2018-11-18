/*
Author: Craig Lawlor
Source: Head First - Design Patterns 
*/

public class ThreadSafeSingleton {

	private static ThreadSafeSingleton uniqueInstance = null;
	
	// Note: Private constructor
	private ThreadSafeSingleton() {}
	
	// Note: Thread safe singleton uses synchronised keyword
	public static ThreadSafeSingleton getInstance() {
		if(uniqueInstance == null) {
			uniqueInstance = new ThreadSafeSingleton();
		}
		return uniqueInstance;
	}
	
	public String getescription() {
		return "I'm a thread safe Singleton!";
	}
}
