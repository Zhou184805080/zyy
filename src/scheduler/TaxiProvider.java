package scheduler;

public class TaxiProvider implements Runnable{
   private TaxiBase tb;
   private int num;
   TaxiProvider(TaxiBase tb){
	   this.tb=tb;
   }
   public void run() {
	   while(true) {
		   tb.come(num++);
	   }
   }
}
