
public class DamonThread implements Runnable{
      public void run() {
    	  while(true) {
    		  System.out.println(Thread.currentThread().getName()+"---is running.");
    	  }
      }
}
