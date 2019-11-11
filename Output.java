
public class Output implements Rannable(){
   private Storage st;
   Output(Storage st){
	   this.st=st;
   }
   public void run() {
	   while(true) {
		   st.get();
	   }
   }
}
