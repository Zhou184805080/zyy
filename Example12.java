class Ticket1 implements Runnable{
   private int tickets=10;
   Object lock=new Object();
   public void run(){
      while(true){
         synchsronized(lock){
             try{
                Thread.sleep(10);
             }catch(InterruptedException e){
                 e.printStackTrace();
             }
             if(tickets>0){
                System.out.println(Thread.currentThread().getName()+"---卖出的票"+tickets--);
             }else{
                break;
             }
         }
      }
   }
}
public class Example12{
  public static void main(String[] args){
      Ticket1 ticket=new Ticket1();
      new Thread(ticket,"线程一").start();
      new Thread(ticket,"线程二").start();
      new Thread(ticket,"线程三").start();
      new Thread(ticket,"线程四").start();
  }
}