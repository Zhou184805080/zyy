import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class TelcomUserBaseOnCollection {
	    private String phoneNumber;
	    private String callTo;//假定是被叫号码
	    private ArrayList communicationRecords;
            private HashMap singleRecord;

	    public TelcomUserBaseOnCollection(String phoneNumber) {//假定是主叫号码
	    	this.phoneNumber=phoneNumber;
	    	
	    	this.communicationRecords=new ArrayList();
	    }
	    
	    //模拟通话记录的生成
	    void generateCommunicateRecord() {
	    	//随机生成通话记录数目
	    	int recordNum = new Random().nextInt(10);
	    	for(int i=0;i<=recordNum;i++) {
	    		//随机生成第i条通话记录
	    		//开始时间，当前时间之前的某个随机时间
	    		long timeStart = System.currentTimeMillis() - new Random().nextInt(36000000);
	    		//开始时间开始后的十分钟内随机的一个时间，至少一分钟
	    		long timeEnd = timeStart + 60000 + new Random().nextInt(600000);
	    		//被叫号码
	    		//插入通话记录
	    		this.communicationRecords.add(this.phoneNumber + "-" + timeStart + "-" + timeEnd + "-" + this.callTo + ";");
	    	}
	    }
	    //随机生成被叫号码（后四位随机）并返回
	    private String getCallToPhoneNumber() {
	    	return "1380372" + String.valueOf(new Random().nextInt(10)) + String.valueOf(new Random().nextInt(10)) + String.valueOf(new Random().nextInt(10)) + String.valueOf(new Random().nextInt(10));
	    }
	    //模拟计费方法，以字符串的形式返回保留四位小数的计费结果
	    private String accountFee(long timeStart,long timeEnd) {
	    	//每分钟收费*元
	    	double feePerMinute=0.2;
	    	//通话分钟数按四舍五入算
	    	int minutes=Math.round((timeEnd-timeStart)/60000);
	    	double feeTotal=feePerMinute*minutes;
	    	//String.format()用于创建格式化的字符串以及连接多个字符串对象
	    	return String.format("%.4f",feeTotal);
	    }

            //插入通话记录
            this.singleRecord = new HashMap();
            this.singleRecord.put("主叫"，this.phoneNumber);
            this.singleRecord.put("开始时间"，new Date(timeStart));
            this.singleRecord.put("结束时间"，new Date(timeEnd));
            this.singleRecord.put("被叫号码"，this.callTo);
            this.singleRecord.put("计费"，this.accountFee(timeSart,timeEnd));
            this.communicationRecords.add(this.singleRecord);

	    //打印通话记录
	    void printDetails() {
	    	/*
                 *使用ArrayList接口遍历。注意应将communicationRecords定义为ArrayList
                 *遍历打印每个通话、计费记录（HashMap对象）
                 */
                 Iterator itRecords = this.communicationRecords.Itertor();
                 while(itRecords.hasNext()){
                 System.out.println("-----通话记录分割线------");
                 this.singleRecord = ((HashMap)itRecords.next());
                 set keyset = this.singleRecord.keySet();
                 Iterator itkey = keySet.Iterator();
                 while(itkey.hasNext()){
                     Object key = itkey.next();
                     Object value = this.singleRecord.get(key);
                     System.out.println(key + ":" + value);
                 }
                 }
	    }

}