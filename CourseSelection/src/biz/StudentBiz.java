package biz;

import java.util.Scanner;

import dao.StudentDao;
import entity.IEntity;
import entity.Student;
import view.MainUI;

public class StudentBiz {
	StudentDao studentDao;
	private Student student;
	//登录
	public void login(String studentNo, String studentPassword) throws Exception {

		studentDao = StudentDao.getInstance();
		student = (Student) studentDao.getEntity(studentNo);
		if (student == null) {
			System.out.println("用户不存在");
			return;
		} else if (student.getStudentPassword().equals(studentPassword)) {
			System.out.println("登录成功");
			MainUI.show1();
		} else {
			System.out.println("密码不正确");
			MainUI.show();
		}

	}
	//注册，业务逻辑实现
	public void register(String studentNo, 
						String studentName, 
						String studentGender, 
						int studentAge, 
						String studentDepartment, 
						String firstPassword, 
						String secondPassword) throws Exception {
		if(firstPassword.equals(secondPassword)) {
			student = new Student();
			student.setStudentNo(studentNo);
			student.setStudentName(studentName);
			student.setStudentAge(studentAge);
			student.setStudentDepartment(studentDepartment);
			student.setStudentPassword(firstPassword);
			
			studentDao = StudentDao.getInstance();
			studentDao.insert(student);
			
			System.out.println("注册成功！");
			MainUI.show();
		}else {
			System.out.println("两次密码不相同!");
			MainUI.show();
			
		}
	}
	//修改密码//astudent.setStudentPassword(np);//此处我出现了疑问修改密码 理应可以再操作的学生数据管理层进行，但是我却出现了错误，无法修改成功。
	public void modifyPassword(String studentNo,String oldP,String np,String anp) throws Exception{
		studentDao = StudentDao.getInstance();
		IEntity astudent = studentDao.getEntity(studentNo);
		if(astudent==null){
			System.out.println("学生ID错误！");
			MainUI.show1();
		}
		//将IEntity 强转成student 
		 student = (Student)astudent; 
		 String pwd = student.getStudentPassword();
		if(pwd.equals(oldP)&&np.equals(anp)){
			student.setStudentPassword(np);
			studentDao.update(student);
			System.out.println("修改成功！");
			MainUI.show();
		}else{
			System.out.println("两次密码输入不相同！");
			MainUI.show1();
		}
	}
	
}
