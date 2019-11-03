package car;

public class BenzCar implements Factory{
   public Car produceCar() {
	   return new Benz();
   }
}
