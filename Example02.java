class Animal{
  void shout(){
      System.out.println("���﷢���Ľ���");
  }
}
class Dog extends Animal{
   void shout(){
       System.out.println("��������");
   }
}
public class Example02{
    public static void main(String[] args){
        Dog dog = new Dog();
        dog.shout();
    }
}