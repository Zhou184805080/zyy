public class Example11{
   public static void main(String[] args){
      SaleThread saleThread=new SaleThread();
      new THread(saleThread,"�߳�һ").start();
      new THread(saleThread,"�̶߳�").start();
      new THread(saleThread,"�߳���").start();
      new THread(saleThread,"�߳���").start();
   }
}
class SaleThread implements Runnable{
   private int tickets=10;
   public void run(){
       while(tickets>0){
         try{
           Thread.sleep(10);
         }catch(InterruptedException e){
            e.printStackTrace();
         }
         System.out.println(Thread.currentThread().getName()+"---������Ʊ"+tickets--);
       }
   }
}