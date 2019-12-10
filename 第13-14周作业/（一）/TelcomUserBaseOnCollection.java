import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class TelcomUserBaseOnCollection {
	    private String phoneNumber;
	    private String callTo;//�ٶ��Ǳ��к���
	    private ArrayList communicationRecords;
            private HashMap singleRecord;

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

            //����ͨ����¼
            this.singleRecord = new HashMap();
            this.singleRecord.put("����"��this.phoneNumber);
            this.singleRecord.put("��ʼʱ��"��new Date(timeStart));
            this.singleRecord.put("����ʱ��"��new Date(timeEnd));
            this.singleRecord.put("���к���"��this.callTo);
            this.singleRecord.put("�Ʒ�"��this.accountFee(timeSart,timeEnd));
            this.communicationRecords.add(this.singleRecord);

	    //��ӡͨ����¼
	    void printDetails() {
	    	/*
                 *ʹ��ArrayList�ӿڱ�����ע��Ӧ��communicationRecords����ΪArrayList
                 *������ӡÿ��ͨ�����ƷѼ�¼��HashMap����
                 */
                 Iterator itRecords = this.communicationRecords.Itertor();
                 while(itRecords.hasNext()){
                 System.out.println("-----ͨ����¼�ָ���------");
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