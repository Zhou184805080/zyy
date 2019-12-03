//
//public class Movie2 {
//	// 定义了一个电影类，有属性 电影名字和价格，有方法设置电影票价格和得到电影票价格
//	public static final int CHILDRENS=2;//childrens
//	public static final int REGULAR=0;//regular
//	public static final int NEW_RELEASE=1;//new__release
//	
//	private String _title;
//	private Price2 _price ;
//	
//	public Movie2(String title,Price2 priceCode){
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
//    	return _price.getCharge(daysRented);
//    }
//		//
//		
//    
//    int getFrequentRenterPoints(int daysRented){
//    	if((getPriceCode()==Movie2.NEW_RELEASE)&&daysRented>1)
//    		return 2;
//    	else
//    		return 1;
//    }
//}
