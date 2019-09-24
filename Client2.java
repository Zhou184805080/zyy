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

public interface IProductFactory{
     public IProduct produceIProduct();
}

public class ProductAFactory implements IProductFactory{

      public produceIProduct(){
           return new ProductA();
      }

}

public class ProductBFactory implements IProductFactory{
      public produceIProduct(){
           return new ProductB();
      }

}
public class Client {

    public static void main(String[] args) {
        IProduct iproduct;
        IProductFactory factory;
        factory = (IProductFactory)XMLUtil.getbean();
        iproduct = factory.produceIProduct();
        iproduct.method();
    }
}