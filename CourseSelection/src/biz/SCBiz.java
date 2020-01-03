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
	     
		 System.out.println("选课成功！");
		 System.out.println("以下是您所选的全部课程：");
		 showSelection();
		 MainUI.show1();
		 //选课不成功的代码块
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
			System.out.println("请输入学号查看选课信息：");
			scanner = new Scanner(System.in);
			String studentNo =scanner.nextLine();
			scdao =SCDao.getInstance();
			SC sc= new SC();
			sc = (SC) scdao.getEntity(studentNo);
			System.out.println("学生已选课程如下：");
			System.out.println("***********************");
			System.out.println("课程号："+sc.getCourseNo());
			System.out.println("课程名"+sc.getcourseName());
			System.out.println("学分："+sc.getGrade());
			System.out.println("***********************");
			
	}
}
