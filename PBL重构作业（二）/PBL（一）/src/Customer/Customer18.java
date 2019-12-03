import java.util.Enumeration;
import java.util.Vector;

public class Customer18 {
	//顾客类 属性 姓名，租赁数组（用于存放该顾客租用的电影，用变长数组进行存放）
	private String _name;
	private Vector _rentals =new Vector();
	
	public  Customer18(String name){
		
		_name=name;
	}
	
	public void addRental(Renta1 arg){
		
		_rentals.addElement(arg);
	}
	
	public String getName(){
		
		return _name;
	}
	
	public String statement(){
		
		Enumeration rentals =_rentals.elements();
		String result="Rental Record for "+getName()+"\n";//输出结果
		
		while(rentals.hasMoreElements()){
			
			Rental3 each=(Rental3)rentals.nextElement();
		
			
			result+="\t"+each.getMovie().getTitle()+"\t"+
			  String.valueOf(each.getCharge())+"\n";
			
		  }
			result+="Amount owed is "+String.valueOf(getTotalCharge())+"\n";
			result+="You earned "+String.valueOf(getTotalFrequentRenterPoints())+
					" frequent renter points";
			
			return result;
		}
		
	private int getTotalFrequentRenterPoints(){
		
		int result=0;
		Enumeration rentals =_rentals.elements();
		while(rentals.hasMoreElements()){
			
			Rental3 each=(Rental3) rentals.nextElement();
			result+=each.getFrequentRenterPoints();
		}
		
		return result;
		
	}
	// 同理把积分的获得也给封装成一个函数。
	
	private double getTotalCharge(){
		
		double result=0;
		Enumeration rentals=_rentals.elements();
		
	  while(rentals.hasMoreElements()){
		  Rental3 each=(Rental3) rentals.nextElement();
		  result+=each.getCharge();
	  }
	  
	  return result;
	}
		 
	  
}
	

