
public class Rental3 {
	//租赁类 有属性 电影类 和租用 方法 租用天数和租用的电影
	private Movie1 _movie;
	private int _daysRented;
	
	public Rental3(Movie1 movie,int daysRented){
		
		_movie=movie;
		_daysRented=daysRented;
		
		
	}
	public int getDaysRented(){
		
		return _daysRented;
	}
	public Movie1 getMovie(){
		
		return _movie;
	}
	
	 double getCharge(){
		
		double result=0;
		
		switch(getMovie().getPriceCode()){
		case Movie1.REGULAR:
			result+=2;
		 if(getDaysRented()>2)
			 result+=(getDaysRented()-2)*1.5;
		  break;
		case Movie1.NEW_RELEASE:
			result+=getDaysRented()*3;
			break;
		case Movie1.CHILDRENS:
			result+=1.5;
			if(getDaysRented()>3)
				result+=(getDaysRented()-3)*1.5;
			break;
		
	}
		
		return result;
	}
	 
	int getFrequentRenterPoints(){
		
		if((getMovie().getPriceCode()==Movie1.NEW_RELEASE)&&
				getDaysRented()>1) return 2;
		else
			 return 1;
						
		
	}
}
