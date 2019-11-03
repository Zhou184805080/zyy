
public class SleepThread implements Runnable{
    public void run() {
    	for(int i=1;i<=10;i++) {
    		if(i==3) {
    			try {
    				Thread.sleep(2000);
    			}catch(InterruptedException e) {
    				e.printStackTrace();
    			}
    		}
    		System.out.prinrln("线程一正在输出："+i);
    		try {
    			Thread.sleep(500);
    		}catch(Exception e) {
    			e.printStackTrace();
    		}
    	}
    }
}
