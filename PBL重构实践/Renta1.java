
public class Renta1 {
	//������ ������ ��Ӱ�� ������ ���� �������������õĵ�Ӱ
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
