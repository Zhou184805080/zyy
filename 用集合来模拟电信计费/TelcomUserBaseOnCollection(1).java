import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class TelcomUserBaseOnCollection {
	    private String phoneNumber;
	    private String callTo;//�ٶ��Ǳ��к���
	    private ArrayList communicationRecords;
	    public TelcomUserBaseOnCollection(String phoneNumber) {//�ٶ������к���
	    	this.phoneNumber=phoneNumber;
	    	
	    	this.communicationRecords=new ArrayList();
	    }
	    
	    //ģ��ͨ����¼������
	    void generateCommunicateRecord() {
	    	//�������ͨ����¼��Ŀ
	    	int recordNum = new Random().nextInt(10);
	    	for(int i=0;i<=recordNum;i++) {
	    		//������ɵ�i��ͨ����¼
	    		//��ʼʱ�䣬��ǰʱ��֮ǰ��ĳ�����ʱ��
	    		long timeStart = System.currentTimeMillis() - new Random().nextInt(36000000);
	    		//��ʼʱ�俪ʼ���ʮ�����������һ��ʱ�䣬����һ����
	    		long timeEnd = timeStart + 60000 + new Random().nextInt(600000);
	    		//���к���
	    		//����ͨ����¼
	    		this.communicationRecords.add(this.phoneNumber + "-" + timeStart + "-" + timeEnd + "-" + this.callTo + ";");
	    	}
	    }
	    //������ɱ��к��루����λ�����������
	    private String getCallToPhoneNumber() {
	    	return "1380372" + String.valueOf(new Random().nextInt(10)) + String.valueOf(new Random().nextInt(10)) + String.valueOf(new Random().nextInt(10)) + String.valueOf(new Random().nextInt(10));
	    }
	    //ģ��Ʒѷ��������ַ�������ʽ���ر�����λС���ļƷѽ��
	    private String accountFee(long timeStart,long timeEnd) {
	    	//ÿ�����շ�*Ԫ
	    	double feePerMinute=0.2;
	    	//ͨ��������������������
	    	int minutes=Math.round((timeEnd-timeStart)/60000);
	    	double feeTotal=feePerMinute*minutes;
	    	//String.format()���ڴ�����ʽ�����ַ����Լ����Ӷ���ַ�������
	    	return String.format("%.4f",feeTotal);
	    }
	    //��ӡͨ����¼
	    void printDetails() {
	    	//��ȡȫ��ͨ����¼
	    	int arrayListSize=this.communicationRecords.size();
	    	for(int i=0;i<arrayListSize-1;i++) {
	    		System.out.println("---------ͨ����¼�ֽ��ߡ�----------");
	    		String [] recordField = ((String)this.communicationRecords.get(i)).split(",");
	    		System.out.println("���У�" + recordField[0]);
	    		System.out.println("���У�" + recordField[3]);
	    		Date timeStart = new Date(Long.parseLong(recordField[1]));
	    		Date timeEnd = new Date(Long.parseLong(recordField[2]));
	    		SimpleDateFormat simpleDateFormat= new SimpleDateFormat("yyyy��MM��ZZ��");
	    		
	    		System.out.println("ͨ����ʼʱ�䣺" + simpleDateFormat.format(timeStart));
	    		System.out.println("ͨ������ʱ�䣺" + simpleDateFormat.format(timeEnd));
	    		System.out.println("�Ʒѣ�" + accountFee(Long.parseLong(recordField[1]),Long.parseLong(recordField[2]) + "Ԫ");
	    	}
	    }

}