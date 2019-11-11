
public class Storage {
   private int[] cells=new int[10];
   private int inpos,outpos;
   public void put(String num) {
	   cells[inpos]=num;
	   System.out.println("cells["+inpos+"]登录---"+cells[inpos]);
	   inpos++;
	   if(inpos==cells.length)
		   inpos=0;
   }
   public void get() {
	   int data=cells[outpos];
	   System.out.println("cells["+outpos+"]注销---"+data);
	   outpos++;
	   if(outpos==cells.length)
		   outpos=0;
   }
}
