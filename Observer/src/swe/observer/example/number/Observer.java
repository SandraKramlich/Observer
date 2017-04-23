package swe.observer.example.number;

/**
 * Abstrakte Klasse f�r alle Beobachter, um sicherzustellen,
 * dass sie mit einem Subject gekoppelt sind und eine update-Methode haben.
 *
 */
public abstract class Observer {
	protected Subject subject;
	public abstract void update();
}
