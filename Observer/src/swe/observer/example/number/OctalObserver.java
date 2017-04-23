package swe.observer.example.number;

public class OctalObserver extends Observer{
	/**
	 * Initialisieren des Subjects und anmelden als Beobachter dieses Subjects
	 * @param subject
	 */
	public OctalObserver(Subject subject){
	      this.subject = subject;
	      this.subject.attach(this);
	   }

	   @Override
	   public void update() {
	     System.out.println( "Octal String: " + Integer.toOctalString( subject.getState() ) ); 
	   }
}
