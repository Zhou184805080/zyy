
public class Example08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new Thread(new SleepThread()).start();
        for(int i=1;i<=10;i++) {
        	if(i==5) {
        		Thread.sleep(2000);
        	}
        	System.out.println("主线程正在输出："+i);
        	Thread.sleep(500);
        }
	}

}
