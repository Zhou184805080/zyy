import java.util.Enumeration;
import java.util.Vector;

public class Customer03 {
	//顾客类 属性 姓名，租赁数组（用于存放该顾客租用的电影，用变长数组进行存放）
	private String _name;
	private Vector _rentals =new Vector();
	
	public  Customer03(String name){
		
		_name=name;
	}
	
	public void addRental(Renta1 arg){
		
		_rentals.addElement(arg);
	}
	
	public String getName(){
		
		return _name;
	}
	
	public String statement(){
		
		double totalAmount=0;// 总的数量
		int frequentRenterPoints=0;//积分
		Enumeration rentals =_rentals.elements();
		String result="Rental Record for "+getName()+"\n";//输出结果
		
		while(rentals.hasMoreElements()){
			
			double thisAmount=0;
			Renta1 each=(Renta1)rentals.nextElement();
			
			thisAmount =amountFor(each);//得到每一次的租赁记录
			
			frequentRenterPoints++;//积分++
			
			if((each.getMovie().getPriceCode()==Movie.NEW_RELEASE)&&
				each.getDaysRented()>1) frequentRenterPoints++;
			//新片另奖积分++
			result+="\t"+each.getMovie().getTitle()+"\t"+
			  String.valueOf(thisAmount)+"\n";
			totalAmount+=thisAmount;
		  }
			result+="Amount owed is "+String.valueOf(totalAmount)+"\n";
			result+="You earned "+String.valueOf(frequentRenterPoints)+
					" frequent renter points";
			
			return result;
		}
		
		private double amountFor(Renta1 aRental){
			
			double thisAmount=0;
			
			switch(aRental.getMovie().getPriceCode()){
			case Movie.REGULAR:
			 thisAmount+=2;
			 if(aRental.getDaysRented()>2)
				thisAmount+=(aRental.getDaysRented()-2)*1.5;
			  break;
			case Movie.NEW_RELEASE:
				thisAmount+=aRental.getDaysRented()*3;
				break;
			case Movie.CHILDRENS:
				thisAmount+=1.5;
				if(aRental.getDaysRented()>3)
					thisAmount+=(aRental.getDaysRented()-3)*1.5;
				break;
			
		}
			
			return thisAmount;
		}
		
}
	

