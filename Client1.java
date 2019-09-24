public abstract class IProduct {

    public abstract void method();
}

public class ProductA extends IProduct{

    public void method() {
        System.out.println("这是产品A");
    }

}

public class ProductB extends IProduct{

    public void method() {
        System.out.println("这是产品B");
    }

}

public class Creator {

    private Creator(){}
    
    public static IProduct createProduct(String productName){
        if (productName == null) {
            return null;
        }
        if (productName.equals("A")) {
            return new ProductA();
        }else if (productName.equals("B")) {
            return new ProductB();
        }else {
            return null;
        }
    }
}

public class Client1 {

    public static void main(String[] args) {
        IProduct product1 = Creator.createProduct("A");
        product1.method();
        
        IProduct product2 = Creator.createProduct("B");
        product2.method();
    }
}
