//
//public class Movie1 {
//	// ������һ����Ӱ�࣬������ ��Ӱ���ֺͼ۸��з������õ�ӰƱ�۸�͵õ���ӰƱ�۸�
//	public static final int CHILDRENS=2;//childrens
//	public static final int REGULAR=0;//regular
//	public static final int NEW_RELEASE=1;//new__release
//	
//	private String _title;
//	private Price1 _price ;
//	
//	public Movie1(String title,Price1 priceCode){
//		
//		_title=title;
//		_price =priceCode;
//		
//	}
//	
//	public int getPriceCode(){
//		return _price.getPriceCode();
//	}
//	
//	public void setPriceCode(int arg){
//		switch(arg){
//		
//		case REGULAR:
//			 _price=new RegularPrice();
//		case CHILDRENS:
//			 _price=new ChildrensPrice();
//		case NEW_RELEASE:
//			 _price=new NewReleasePrice();
//			 
//		default:
//			throw new IllegalArgumentException("Incorrect Price Code");
//		}
//		
//		
//	}
//	
//	public String getTitle(){
//		return _title;
//	}
//	
//    double getCharge(int daysRented){
//		
//		double result=0;
//		
//		switch(getPriceCode()){
//		case Movie1.REGULAR:
//			result+=2;
//		 if(daysRented>2)
//			 result+=(daysRented-2)*1.5;
//		  break;
//		case Movie1.NEW_RELEASE:
//			result+=daysRented*3;
//			break;
//		case Movie1.CHILDRENS:
//			result+=1.5;
//			if(daysRented>3)
//				result+=(daysRented-3)*1.5;
//			break;
//		
//	}
//		
//		return result;
//	}
//    
//    int getFrequentRenterPoints(int daysRented){
//    	if((getPriceCode()==Movie1.NEW_RELEASE)&&daysRented>1)
//    		return 2;
//    	else
//    		return 1;
//    }
//}
