package view;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;

import biz.CourseBiz;
import biz.SCBiz;
import biz.StudentBiz;
import dao.StudentDao;
import entity.Student;

public class CourseSelection {

	public static void show ()throws Exception 
	{
		StudentDao studentDao;
		Student student;
		Scanner scanner;
		System.out.println("请输入学号：");
		scanner = new Scanner(System.in);
		String studentNo = scanner.nextLine();
		System.out.println("以下是全部的课程信息");
		CourseBiz coursebiz=new CourseBiz();
		coursebiz.showCourse();
		scanner = new Scanner(System.in);
		System.out.println("请输入您要进行的操作选项：");
		System.out.println("1-选课; 2-退选; 3-查看学生所选课程信息; 4-退出");
		int op = scanner.nextInt();
		SCBiz scbiz= new SCBiz();
		switch (op){
		case 1:
			System.out.println("请输入要选的课程号：");
		    String courseNo = scanner.nextLine();
		    System.out.println("请输入所选课名称：");
		    String courseName = scanner.nextLine();
		    System.out.println("请输入课程成绩：");
		    int grade = scanner.nextInt();
		    scbiz.selection(studentNo,courseNo,courseName,grade);
		   break;
		case 2:
			System.out.println("请输入您要退选的课程名：");
			String courseN =scanner.nextLine();
			scbiz.deleteCourse(studentNo,courseN);
			//
			//
			break;
		case 3:
			scbiz.showSelection();
			break;
		case 4:
			MainUI.show();
			break;
			
		
		}
	}

}
