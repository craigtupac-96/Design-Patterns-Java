/*
Author: Craig Lawlor
Source: Head First - Design Patterns 
*/

public class SingletonDriver {

	public static void main(String[] args) {
		
		LazySingleton lazy = LazySingleton.getInstance();
		System.out.println(lazy.getescription());
		
		EagerSingleton eager = EagerSingleton.getInstance();
		System.out.println(eager.getescription());
		
		ThreadSafeSingleton threadSafe = ThreadSafeSingleton.getInstance();
		System.out.println(threadSafe.getescription());
	}
}
