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
		System.out.println("������ѧ�ţ�");
		scanner = new Scanner(System.in);
		String studentNo = scanner.nextLine();
		System.out.println("������ȫ���Ŀγ���Ϣ");
		CourseBiz coursebiz=new CourseBiz();
		coursebiz.showCourse();
		scanner = new Scanner(System.in);
		System.out.println("��������Ҫ���еĲ���ѡ�");
		System.out.println("1-ѡ��; 2-��ѡ; 3-�鿴ѧ����ѡ�γ���Ϣ; 4-�˳�");
		int op = scanner.nextInt();
		SCBiz scbiz= new SCBiz();
		switch (op){
		case 1:
			System.out.println("������Ҫѡ�Ŀγ̺ţ�");
		    String courseNo = scanner.nextLine();
		    System.out.println("��������ѡ�����ƣ�");
		    String courseName = scanner.nextLine();
		    System.out.println("������γ̳ɼ���");
		    int grade = scanner.nextInt();
		    scbiz.selection(studentNo,courseNo,courseName,grade);
		   break;
		case 2:
			System.out.println("��������Ҫ��ѡ�Ŀγ�����");
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
