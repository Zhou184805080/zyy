package view;
import java.util.Scanner;

import biz.StudentBiz;
import dao.StudentDao;
import entity.Student;

public class ModifyPasswordUI {
	static StudentDao studentDao;
	private static Student student;
	public  static  void show() throws Exception {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ѧ�ţ�");
		String studentNo = scanner.nextLine();
		studentDao = StudentDao.getInstance();
		student = (Student) studentDao.getEntity(studentNo);
		System.out.println("����������룺");
		String oldP = scanner.nextLine();
		System.out.println("�����������룺");
		String newP = scanner.nextLine();
		System.out.println("���ٴ����������룺");
		String anewP = scanner.nextLine();
		StudentBiz sc =new StudentBiz();
		sc.modifyPassword(studentNo,oldP,newP,anewP);
	}
}
