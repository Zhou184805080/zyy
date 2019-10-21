public class Test05{
   public static void main(String[] args){
      DownLoad dl=new DownLoad();
      new Thread(dl,"down1").start();
      new Thread(dl,"down2").start();
   }
}
class DownLoad implements Runnable{
   public void run(){
        for(int i=1;i<=10;i++){
           Thread th=Thread.currentThread();
           String th_name=th.getName();
           System.out.println(th_name+"正在下载第"+i+"段");
        }
   }
}