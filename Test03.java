public class Test03{
   public static void main(String[] args){
       StudyNote sn=new StudyNote();
       new Thread(sn,"teacher1").start();
       new Thread(sn,"teacher2").start();
       new Thread(sn,"teacher3").start();
   }
}
class StudyNote implements Runnable{
    private int notes=80;
    public void run(){
       while(true){
         if(notes>0){
           Thread th=Thread.currentThread();
           String th_name=th.getName();
           System.out.println(th_name+"正在分发第"+notes--+"学习笔记");
         }
       }
    }
}