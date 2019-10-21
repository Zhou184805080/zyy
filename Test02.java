public class Test02{
    public static void main(String[] args){
         MyThread myThread=new MyThread();
         Thread thread=new Thread(myThread);
         thread.start();
         while(true){
             for(int i=1;i<=100;i++){
                System.out.println("main");
             }
         break;
         }
   }
}
class MyThread implements Runnable{
    public void run(){
      while(true){
        for(int j=1;j<=50;j++){
         System.out.println("new");
         }
         break;
      }
    }
}