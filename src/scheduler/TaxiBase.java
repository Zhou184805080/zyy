package scheduler;

import car.Car;
import factory.Factory;
import utility.XMLUtility;

public class TaxiBase {
   private Car[] car=new Car[10];
   private int inPos,outPos;
   private int couunt=0;
   
   public TaxiBase() {
	   Factory factory = (Factory)XMLUtility.getBean();
	   for(int i=0;i<10;i++) {
		   car[i]=Factory.produceCar();
	   }
   }
   public synchronized void come() {
	   try {
		   while(count==car.length) {
			   this.wait();
		   }
		   System.out.println("����"+inpos+","car[inPos].toString()+"���");
		   inPos++;
		   
		   if(inPos==car.length)
			   inPos=0;
		   count++;
		   Thread.sleep(1000);
		   this.notify();
	   }catch(Exception e) {
		   e.printStackTrace();
	   }
   }
   public synchonized void go() {
	   try {
		   while(count==car.length) {
			   this.wait();
		   }
		   System.out.println("����"+outpos+","car[outPos].toString()+"���⡣�Ʒѷ���"+car[outPos].getRadio());
		   outPos++;
		   
		   if(outPos==car.length)
			   outPos=0;
		   count--;
		   Thread.sleep(1000);
		   this.notify();
	   }catch(Exception e) {
		   e.printStackTrace();
	   }
   }
   }
}
