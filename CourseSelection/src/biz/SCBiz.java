package biz;

import java.util.Scanner;

import dao.CourseDao;
import dao.SCDao;
import dao.StudentDao;
import entity.Course;
import entity.SC;
import entity.Student;
import view.MainUI;

public class SCBiz {
	
	SCDao scdao;
	private SC sc;
	private Student student;
	private Course course;
	public void  selection(String studentNo,String courseno,String courseName,int grade) throws Exception{
	     sc = new SC();
	     sc.setStudentNo(studentNo);
	     sc.setCourseNo(courseno);
	     sc.setCourseName(courseName);
	     sc.setGrade(grade); 
	     scdao = SCDao.getInstance();
	     scdao.insert(sc);
	     
		 System.out.println("ѡ�γɹ���");
		 System.out.println("����������ѡ��ȫ���γ̣�");
		 showSelection();
		 MainUI.show1();
		 //ѡ�β��ɹ��Ĵ����
	  }
	public void deleteCourse(String studentNo,String courseName){
		StudentDao studentDao = StudentDao.getInstance();
		CourseDao courseDao = CourseDao.getInstance();
		SCDao scdao = SCDao.getInstance();
		student =(Student)studentDao.getEntity(studentNo);
		course = (Course)courseDao.getEntity(courseName);
		scdao.delete(student,course);
		
	}
	public void showSelection(){
		    SCDao scdao;
		    Scanner scanner;
			System.out.println("������ѧ�Ų鿴ѡ����Ϣ��");
			scanner = new Scanner(System.in);
			String studentNo =scanner.nextLine();
			scdao =SCDao.getInstance();
			SC sc= new SC();
			sc = (SC) scdao.getEntity(studentNo);
			System.out.println("ѧ����ѡ�γ����£�");
			System.out.println("***********************");
			System.out.println("�γ̺ţ�"+sc.getCourseNo());
			System.out.println("�γ���"+sc.getcourseName());
			System.out.println("ѧ�֣�"+sc.getGrade());
			System.out.println("***********************");
			
	}
}
