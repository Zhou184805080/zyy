import java.util.Random;
import factory.*;
import species.*;
import utility.XMLUtility;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Telcom telcomuser;
        TelcomCompany tc;
        tc = (TelcomCompany)XMLUtil.getBean();
        telcomuser = tc.produceTelcom();
        telcomuser.generateCommunicateRecord();
        telcomuser.printDetails();
	}
}
