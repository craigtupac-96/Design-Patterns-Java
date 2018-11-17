/*
Author: Craig Lawlor
Source: Head First - Design Patterns 
*/

public interface ISubject {

	public void registerObserver(IObserver o);
	public void removeObserver(IObserver o);
	public void notifyObservers();
}
