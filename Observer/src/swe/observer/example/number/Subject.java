package swe.observer.example.number;

import java.util.ArrayList;
import java.util.List;

public class Subject {
	// Liste der gespeicherten Beobachter, die bei Statusänderungen benachrichtigt werden.
	private List<Observer> observers = new ArrayList<Observer>();
	// Status, dessen Änderung weitergegeben wird.
	private int state;
	
	public int getState(){
		return this.state;
	}
	
	/**
	 * Die Änderung des Status erfolgt -> Alle Beobachter werden benachrichtigt.
	 */
	public void setState(int state){
		this.state=state;
		notifyAllObservers();
	}
	
	/**
	 * Anmelden eines neuen Beobachters
	 * @param observer
	 */
	public void attach(Observer observer){
		observers.add(observer);
	}
	
	/**
	 * Jeder Beobachter soll seine Daten aktualisieren.
	 */
	public void notifyAllObservers(){
		for(Observer observer: observers){
			observer.update();
		}
	}
}
