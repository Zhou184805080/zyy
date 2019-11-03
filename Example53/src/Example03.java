
public class Example03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        MyThread myThread=new MyThread();
        Thread thread=new Thread(myThread);
        thread.start();
        while(true) {
        	System.out.println("main()方法在运行");
        }
	}

}
