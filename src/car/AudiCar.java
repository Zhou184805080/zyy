package car;

public class AudiCar implements Factory{
	public Car produceCar() {
		   return new Audi();
	   }
}
