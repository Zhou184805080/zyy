package scheduler;

public class TaxiRenter {
	private TaxiBase tb;
	   TaxiProvider(TaxiBase tb){
		   this.tb=tb;
	   }
	   public void run() {
		   while(true) {
			   tb.go();
		   }
	   }
}
