import java.util.Enumeration;
import java.util.Vector;

public class Customer17 {
	//顾客类 属性 姓名，租赁数组（用于存放该顾客租用的电影，用变长数组进行存放）
	private String _name;
	private Vector _rentals =new Vector();
	
	public  Customer17(String name){
		
		_name=name;
	}
	
	public void addRental(Renta1 arg){
		
		_rentals.addElement(arg);
	}
	
	public String getName(){
		
		return _name;
	}
	
	public String statement(){
		
		int frequentRenterPoints=0;//积分
		Enumeration rentals =_rentals.elements();
		String result="Rental Record for "+getName()+"\n";//输出结果
		
		while(rentals.hasMoreElements()){
			
			Rental3 each=(Rental3)rentals.nextElement();
		
			frequentRenterPoints+=each.getFrequentRenterPoints();
			
			result+="\t"+each.getMovie().getTitle()+"\t"+
			  String.valueOf(each.getCharge())+"\n";
			
		  }
			result+="Amount owed is "+String.valueOf(getTotalCharge())+"\n";
			result+="You earned "+String.valueOf(frequentRenterPoints)+
					" frequent renter points";
			
			return result;
		}
		
	private double getTotalCharge(){
		
		double result=0;
		Enumeration rentals=_rentals.elements();
		
	  while(rentals.hasMoreElements()){
		  Rental3 each=(Rental3) rentals.nextElement();
		  result+=each.getCharge();
	  }
	  
	  return result;
	}
		 
	 //本次重构将totalAmount这个临时变量给搞成了一个方法，调用这个方法直接得到totalAmount
    //方便快捷
}
	

