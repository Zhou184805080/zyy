  //����Animal��
class Animal{
           String name;
          //���嶯��Ľ���
          void shout(){
                   System.out.println("����Ľ���");
          }
}
  //����Dog��̳�Animal��
 class Dog extends Animal{
         //����һ����ӡname�ķ���
          public void printName(){
           System.out.println("name = " + name);
           }
}
//���������
public class Example01{
       public static void main(String[] args){
       Dog dog=new Dog();            //����һ��Dog���ʵ������
        dog.name="ɳƤ��";             //ΪDog���name���Խ��и�ֵ
        dog.printName();                  //����Dog���printName��������
        dog.shout();                          //����Dog���shout()����
        }
}