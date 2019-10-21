public class Test04{
    public static void main(String[] args){
       TaxiCat tc=new TaxiCat();
       new Thread(tc,"taxi1").start();
       new Thread(tc,"taxi2").start();
       new Thread(tc,"taxi3").start();
       new Thread(tc,"taxi4").start();
       new Thread(tc,"taxi5").start();
    }
}
class TaxiCat implements Runnable{
    private int cats=100;
    public void run(){
         while(true){
            if(cats>0){
              Thread th=Thread.currentThread();
              String th_name=th.getName();
              System.out.println(th_name+"正在接送第"+cats--+"个乘客");
            }
         }
    }
}