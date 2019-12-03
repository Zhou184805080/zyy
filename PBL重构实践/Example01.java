
public class Example01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Movie mv1=new Movie("Music",10);
		Movie mv2=new Movie("Picture",20);
		Movie mv3=new Movie("Person",30);
		
		Renta1 rt1=new Renta1(mv1,5);
		Renta1 rt2=new Renta1(mv2,6);
		Renta1 rt3=new Renta1(mv3,7);
		
		Customer01 ct1=new Customer01("Ð¡¹Ø");
		Customer01 ct2=new Customer01("Ð¡º«");
		
		ct1.addRental(rt1); 	ct1.addRental(rt2); 	ct1.addRental(rt3);
		
		ct2.addRental(rt1); ct2.addRental(rt2);
		
		System.out.println(ct1.statement());
		System.out.println(ct2.statement());
	}

}
