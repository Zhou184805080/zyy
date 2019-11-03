package car;

public class BMWCar implements Factory{
	public Car produceCar() {
		   return new BMW();
	   }
}
