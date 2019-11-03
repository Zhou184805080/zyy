public class Example11{
   public static void main(String[] args){
      SaleThread saleThread=new SaleThread();
      new THread(saleThread,"线程一").start();
      new THread(saleThread,"线程二").start();
      new THread(saleThread,"线程三").start();
      new THread(saleThread,"线程四").start();
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
         System.out.println(Thread.currentThread().getName()+"---卖出的票"+tickets--);
       }
   }
}