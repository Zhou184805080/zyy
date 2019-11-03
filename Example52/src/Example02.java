
public class Example02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        MyThread myThread=new MyThread();
        myThread.start();
        while(true) {
        	System.out.println("Main()方法在运行");
        }
	}

}
