
public class DeadLockThread implements Runnable{
    static Object chopsticks=new Object();
    static Object knifeAndFork=new Object();
    private boolean flag;
    DeadLockThread(boolean flag){
    	this.flag=flag;
    }
    public void run() {
    	if(flag) {
    		while(true) {
    			synchronized(chopsticks) {
    				System.out.println(Thread.currentThread().getName()+"---if---chopsticks");
    				synchronized(knifeAndFork) {
    					System.out.println(Thread.currentThread().getName()+"---if---knifeAndFork");
    				}
    			}
    		}
    	}else {
    		while(true) {
    			synchronized(knifeAndFork) {
    				System.out.println(Thread.currentThread().getName()+"---else---knifeAndFork");
    				synchronized(chopsticks) {
    					System.out.println(Thread.currentThread().getName()+"---else---chopsticks");
    				}
    			}
    		}
    	}
    }
}
