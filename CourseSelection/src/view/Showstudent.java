package view;

import java.util.Scanner;

import dao.StudentDao;
import entity.IEntity;
import entity.Student;

public class Showstudent {
	public static void show() throws Exception
	{
		System.out.println("������Ҫ�鿴��ѧ����ѧ�ţ�");
		Scanner scanner = new Scanner(System.in);
		String studentNo = scanner.nextLine();
		//StudentDao sd= new StudentDao(); 
		StudentDao sd = StudentDao.getInstance();
		Student st= new Student();
	    st = sd.getEntity(studentNo);
	     System.out.println("������"+st.getStudentName());
	     System.out.println("�Ա�"+st.getStudentGender());
	     System.out.println("���䣺"+st.getStudentAge());
	     MainUI.show1();
	}

}
