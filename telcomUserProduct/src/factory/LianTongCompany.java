package factory;

import type.*;
public class LianTongCompany implements Factory{
    public LianTong createSorts() {
    	return new LianTong("1234567890");
    }
}
