import java.util.Enumeration;
import java.util.Vector;

public class Customer17 {
	//�˿��� ���� �������������飨���ڴ�Ÿù˿����õĵ�Ӱ���ñ䳤������д�ţ�
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
		
		int frequentRenterPoints=0;//����
		Enumeration rentals =_rentals.elements();
		String result="Rental Record for "+getName()+"\n";//������
		
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
		 
	 //�����ع���totalAmount�����ʱ�����������һ�������������������ֱ�ӵõ�totalAmount
    //������
}
	

