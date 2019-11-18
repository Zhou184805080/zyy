package factory;
import type.*;

public class TelcomCompany implements Factory{
    public Telcom createSorts() {
    	return new Telcom("9876543210");
    }
}
