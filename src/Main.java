
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TaxiBase tb=new TaxiBase();
		TaxiProvider taxiprovider=new TaxiProvider(tb);
		TaxiRenter taxirenter=new TaxiRenter(tb);
		new Thread(TaxiProvider).start();
		new Thread(TaxiRenter).start();
        Car car;
        Factory factory;
        factory=(Factory)XMLUtility.getBean();
        car=factory.produceCar();
        car=factory.sizeCar();
        car.play();
        car.pay();
	}

}
