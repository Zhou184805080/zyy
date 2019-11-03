
public class Example09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Thread t1=new YieldThread("线程A");
        Thread t2=new YieldThread("线程B");
        t1.start();
        t2.start();
	}

}
