
public class YieldThread extends Thread{
     public YieldThread(String name) {
    	 super(name);
     }
     public void run() {
    	 for(int i=0;i<5;i++) {
    		 System.out.println(Thread.currentThread().getName()+"---"+i);
    		 if(i==3) {
    			 System.out.print("线程让步：");
    			 Thread.yield();
    		 }
    	 }
     }
}