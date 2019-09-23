  //定义Animal类
class Animal{
           String name;
          //定义动物的叫声
          void shout(){
                   System.out.println("动物的叫声");
          }
}
  //定义Dog类继承Animal类
 class Dog extends Animal{
         //定义一个打印name的方法
          public void printName(){
           System.out.println("name = " + name);
           }
}
//定义测试类
public class Example01{
       public static void main(String[] args){
       Dog dog=new Dog();            //创建一个Dog类的实例对象
        dog.name="沙皮狗";             //为Dog类的name属性进行赋值
        dog.printName();                  //调用Dog类的printName（）方法
        dog.shout();                          //调用Dog类的shout()方法
        }
}