class Square{
              private int circumference;
               public int getCircle(){
                         return circumference;
               }
               public void setCircle(int c){
                          if(c<=0){
                                System.out.println("�ܳ����Ȳ��Ϸ�!");
                           }
                           else{
                                 circumference=c;
                            }
                }
               public void introduce(){
                             System.out.println("�����ε��ܳ���"+circumference+"����!");
               }
}
public class Example03{
               public static void main(String[] args){
                          Square sq=new Square();
                           sq.setCircle(340);
                            sq.introduce();
                }
}