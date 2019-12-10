package cn.itcast.application;
import java.util.HashMap;

public class DBUtil {
    private static DBUtil instance=null;
    private HashMap<String,User> users=new HashMap<String,user>();
    
    private DBUtil() {
    	User u1=new User();
    	u1.setCardId("1001");
    	u1.setCardPwd("123456");
    	U1.SetUserName("����");
    	u1.setCall("13281525712");
    	u1.setAccount(1000);
    	users.put(u1.getCardId(),u1);
    	
    	User u2=new User();
    	u2.setCardId("1002");
    	u2.setCardPwd("234567");
    	U2.SetUserName("����");
    	u2.setCall("13281527253");
    	u2.setAccount(1000);
    	users.put(u2.getCardId(),u2);
    	
    	User u3=new User();
    	u3.setCardId("1003");
    	u3.setCardPwd("345678");
    	U3.SetUserName("����");
    	u3.setCall("13281528869");
    	u3.setAccount(1000);
    	users.put(u3.getCardId(),u3);
    	
    }
    
    public static DBUtil getIntance() {
    	if(instance==null) {
    		synchronized(DBUtil.class) {
    			if(instance==null) {
    				instance=new DBUtil();
    			}
    		}
    	}
    }
    public User getUser(String cardId) {
    	User user=(User)users.get(cardId);
    	return user;
    }
    public HashMap<String,User>getUsers(){
    	return users;
    }
}
