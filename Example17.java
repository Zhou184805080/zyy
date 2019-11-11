
public class Example17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Random r=new Random();
        for(int x=0;x<10;x++){
          System.out.println(r.nextInt(100));
        }
        Storage st=new Storage();
        Input input=new Input(st);
        Output output=new Output(st);
        new Thread(input).start();
        new Thread(output).start();
	}

}
