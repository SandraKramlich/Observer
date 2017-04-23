package swe.observer.example.number;

public class HexaObserver extends Observer{
	/**
	 * Initialisieren des Subjects und anmelden als Beobachter dieses Subjects
	 * @param subject
	 */
	public HexaObserver(Subject subject){
	      this.subject = subject;
	      this.subject.attach(this);
	   }

	   @Override
	   public void update() {
	      System.out.println( "Hex String: " + Integer.toHexString( subject.getState() ).toUpperCase() ); 
	   }
}
