package view;

import java.util.Scanner;

import dao.StudentDao;
import entity.IEntity;
import entity.Student;

public class Showstudent {
	public static void show() throws Exception
	{
		System.out.println("请输入要查看的学生的学号：");
		Scanner scanner = new Scanner(System.in);
		String studentNo = scanner.nextLine();
		//StudentDao sd= new StudentDao(); 
		StudentDao sd = StudentDao.getInstance();
		Student st= new Student();
	    st = sd.getEntity(studentNo);
	     System.out.println("姓名："+st.getStudentName());
	     System.out.println("性别："+st.getStudentGender());
	     System.out.println("年龄："+st.getStudentAge());
	     MainUI.show1();
	}

}
