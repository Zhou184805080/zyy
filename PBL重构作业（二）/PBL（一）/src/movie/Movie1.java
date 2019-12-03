
public class Movie1 {
	// 定义了一个电影类，有属性 电影名字和价格，有方法设置电影票价格和得到电影票价格
	public static final int CHILDRENS=2;//childrens
	public static final int REGULAR=0;//regular
	public static final int NEW_RELEASE=1;//new__release
	
	private String _title;
	private int _priceCode;
	
	public Movie1(String title,int priceCode){
		
		_title=title;
		_priceCode=priceCode;
		
	}
	
	public int getPriceCode(){
		return _priceCode;
	}
	
	public void setPriceCode(int arg){
		_priceCode=arg;
	}
	
	public String getTitle(){
		return _title;
	}
}
