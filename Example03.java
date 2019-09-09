class Square{
              private int circumference;
               public int getCircle(){
                         return circumference;
               }
               public void setCircle(int c){
                          if(c<=0){
                                System.out.println("周长长度不合法!");
                           }
                           else{
                                 circumference=c;
                            }
                }
               public void introduce(){
                             System.out.println("正方形的周长是"+circumference+"厘米!");
               }
}
public class Example03{
               public static void main(String[] args){
                          Square sq=new Square();
                           sq.setCircle(340);
                            sq.introduce();
                }
}