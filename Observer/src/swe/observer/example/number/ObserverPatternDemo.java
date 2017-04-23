package swe.observer.example.number;

public class ObserverPatternDemo {

	public static void main(String[] args) {
		/**
		 * Erzeuge zu beobachtendes Subject
		 */
		Subject subject = new Subject();

		/**
		 * Erzeuge Beobachter.
		 */
	    new HexaObserver(subject);
	    new OctalObserver(subject);
	    new BinaryObserver(subject);

	    /**
	     * Testen
	     */
	    System.out.println("First state change: 15");	
	    subject.setState(15);
	    System.out.println("Second state change: 10");	
	    subject.setState(10);
	}

}
