package type;

import java.text.DateFormat;
import java.util.*;
public class LianTong extends sorts{
    private String phoneNumber;
    private String callTo;
    private StringBuffer communicationRecords;
    public LianTong(String phoneNumber) {
    	this.phoneNumber=phoneNumber;
    	this.communicationRecords=new StringBuffer();
    	//模拟通话记录的生成
    	public void generateCommunicateRecord() {
    	//随机生成通话记录数目
    		int recordNum = new Random().nextInt(15);
    		for(int i=0;i<=recordNum;i++) {
    			//随机生成第i条通话记录
    			//开始时间，当前时间之间的某个随机时间
    			long timeStart=Syetem.currentTimeMillis()-new Random().nextInt(10*24*60*60*1000);
    			//结束时间，开始后的十分钟内随机的一个时间，至少一分钟
    			long timeEnd = timeStart + 60000 + new Random().nextInt(600000);
    			Calendar cal = Calender.getInstance();
    			cal.add(Calendar.HOUR, new Random().nextInt(24*15));
    			//被叫号码
    			this.callTo = this.getCallToPhoneNumber();
    			//插入通话记录
    			this.communicationRecords.append(this.phoneNumber+","+timeStart+","+timeEnd+","+this.callTo+";");
    		}
    	}
    	//随机生成被呼叫的号码
    	 private String getCallToPhoneNumber() {
    	    	return "1522492" + String.valueOf(new Random().nextInt(10)) + String.valueOf(new Random().nextInt(10)) + String.valueOf(new Random().nextInt(10)) + String.valueOf(new Random().nextInt(10));
    	    }
    	 //计费
    	 private String accountFee(long timeStart,long timeEnd) {
    	    	//每分钟收费*元
    	    	int feePerMinute=1;
    	    	int minutes=(int)Math.ceil((timeEnd-timeStart)/60000);
    	    	double feeTotal=feePerMinute*minutes;
    	    	//String.format()用于创建格式化的字符串以及连接多个字符串对象
    	    	return String.format("%.4f",feeTotal);
    	    }
    	 void printDetails() {
    	    	//获取全部通话记录
    	    	String allRecords=this.communicationRecords.toString();
    	    	//分割通话记录
    	    	String [] recordArray=allRecords.split(";");
    	    	//循环分割记录内的每一项并输出
    	    	for(int i=0;i<recordArray.length;i++) {
    	    		String [] recordField = recordArray[i].split(",");
    	    		System.out.println("主叫：" + recordField[0]);
    	    		System.out.println("被叫：" + recordField[3]);
    	    		System.out.println("通话开始时间：" + new Date(Long.parseLong(recordField[1])));
    	    		System.out.println("通话结束时间：" + new Date(Long.parseLong(recordField[2])));
    	    		System.out.println("计费：" + accountFee(Long.parseLong(recordField[1]),Long.parseLong(recordField[2]) + "元");
    	    	}
    	    }
    }
}
