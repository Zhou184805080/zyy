package utility;

import javax.xml.parsers.*;
import org.w3c.dom.*;
import org.xml.sax.SAXException;
import java.io.*;

public class XMLUtility {
   public static Object getBean() {
	   try {
		   DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
		   DocumentBuilder builder = dFactory.newDocumentBuilder();
		   Document doc = builder.parse(new File("config.xml"));
		   
		   NodeList n1=doc.getElementsByTagName("className");
		   Node classNode = n1.item(0).getFirstChild();
		   String cName = classNode.getNodeValue();
		   
		   Class c = Class.forName(cName);
		   Object obj = c.newInstance();
		   return obj;
   }
	   catch(Exception e) {
		 e.printStackTrace();
		 return null;
	   }
	}
}
