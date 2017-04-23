package swe.observer.example.number;

public class BinaryObserver extends Observer{
	/**
	 * Initialisieren des Subjects und anmelden als Beobachter dieses Subjects
	 * @param subject
	 */
	public BinaryObserver(Subject subject){
	      this.subject = subject;
	      this.subject.attach(this);
	   }

	   @Override
	   public void update() {
	      System.out.println( "Binary String: " + Integer.toBinaryString( subject.getState() ) ); 
	   }
}
