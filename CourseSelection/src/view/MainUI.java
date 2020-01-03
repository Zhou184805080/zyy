package view;

import java.util.Scanner;

public class MainUI {
	public static void show() throws Exception {
		System.out.println("1-注册；2-登录；0-退出");
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
			System.out.println("感谢您的使用！");
			return ;
			
		}
	}
	public static void show1() throws Exception
	{
		System.out.println("1-修改密码;2-选课;3-查看学生信息;4-注销; 0-退出");
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
			System.out.println("感谢您的使用！");
			return ;
		}
	}
}
