
public class Example01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        MyThread myThread=new MyThread();
        myThread.run();
        while(true) {
        	System.out.println("Main方法在运行");
        }
	}

}
