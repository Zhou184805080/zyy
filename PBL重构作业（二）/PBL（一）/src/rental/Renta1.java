
public class Renta1 {
	//������ ������ ��Ӱ�� ������ ���� �������������õĵ�Ӱ
	private Movie1 _movie;
	private int _daysRented;
	
	public Renta1(Movie1 movie,int daysRented){
		
		_movie=movie;
		_daysRented=daysRented;
		
		
	}
	public int getDaysRented(){
		
		return _daysRented;
	}
	public Movie1 getMovie(){
		
		return _movie;
	}
}
