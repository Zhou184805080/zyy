public class Test01{
    public static void main(String[] args){
         MyThread myThread=new MyThread();
         myThread.start();
         while(true){
             System.out.println("name1");
             break;
         }
   }
}
class MyThread extends Thread{
    public void run(){
      while(true){
         System.out.println("name2");
         break;
      }
    }
}