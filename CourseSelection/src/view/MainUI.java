package view;

import java.util.Scanner;

public class MainUI {
	public static void show() throws Exception {
		System.out.println("1-ע�᣻2-��¼��0-�˳�");
		Scanner scanner = new Scanner(System.in);
		String option = scanner.nextLine();
		switch (option) {
		case "1":
			RegisterUI.show();
			break;
		case "2":
			LoginUI.show();
			break;
		case "0":
			System.out.println("��л����ʹ�ã�");
			return ;
			
		}
	}
	public static void show1() throws Exception
	{
		System.out.println("1-�޸�����;2-ѡ��;3-�鿴ѧ����Ϣ;4-ע��; 0-�˳�");
		Scanner scanner = new Scanner(System.in);
		String option = scanner.nextLine();
		switch (option){
		case "1":
			ModifyPasswordUI.show();
			break;
		case "2":
			CourseSelection.show();
			break;
		case "3":
			Showstudent.show();
			break;
		case "4":
			
			break;
		case "0":
			System.out.println("��л����ʹ�ã�");
			return ;
		}
	}
}
