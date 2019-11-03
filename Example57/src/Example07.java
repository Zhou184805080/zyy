
public class Example07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Thread minPriority=new Thread(new MinPriority(),"优先级较低的线程");
        Thread maxPriority=new Thread(new MaxPriority(),"优先级较高的线程");
        minPriority.setPriority(Thread.MIN_PRIORITY);
        maxPriority.setPriority(10);
        maxPriority.start();
        minPriority.start();
	}

}
