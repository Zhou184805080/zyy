import java.io.*;//FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;

public class test {

	public static void main(String[] args)  {
	InputStream inputStream=null;
	InputStreamReader fileInputStream=null;
	BufferedReader br  = null;
	try {
		inputStream = new FileInputStream("D:/test.txt");
		fileInputStream = new InputStreamReader(inputStream);
	    br = new BufferedReader(fileInputStream);
	    String str = null;
	    try{
	    	while((str = br.readLine())!=null){
			System.out.println(str);
	    }
	} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally{
		try {
			
			br.close();
			fileInputStream.close();
			inputStream.close();

       }catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		} 
}
}
