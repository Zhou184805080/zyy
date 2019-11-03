
public class Example14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           DeadLockThread d1=new DeadLockThread(true);
           DeadLockThread d2=new DeadLockThread(false);
           new Thread(d1,"Chinese").start();
           new THread(d2,"American").start();
	}

}
