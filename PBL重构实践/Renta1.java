
public class Renta1 {
	//租赁类 有属性 电影类 和租用 方法 租用天数和租用的电影
	private Movie _movie;
	private int _daysRented;
	
	public Renta1(Movie movie,int daysRented){
		
		_movie=movie;
		_daysRented=daysRented;
		
		
	}
	public int getDaysRented(){
		
		return _daysRented;
	}
	public Movie getMovie(){
		
		return _movie;
	}
}
