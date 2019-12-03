
public class Example02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Movie1 m1=new Movie1("Music",10);
		Movie1 m2=new Movie1("Picture",20);
		Movie1 m3=new Movie1("Person",30);
		
		Renta1 r1=new Renta1(m1,5);
		Renta1 r2=new Renta1(m2,6);
		Renta1 r3=new Renta1(m3,7);
		
		Customer11 c1=new Customer11("Ð¡Ã÷");
		Customer11 c2=new Customer11("Ð¡ºì");
		
		c1.addRental(r1); 	c1.addRental(r2); 	c1.addRental(r3);
		
		c2.addRental(r1); c2.addRental(r2);
		
		System.out.println(c1.statement());
		System.out.println(c2.statement());
	}

}
