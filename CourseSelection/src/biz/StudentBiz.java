package biz;

import java.util.Scanner;

import dao.StudentDao;
import entity.IEntity;
import entity.Student;
import view.MainUI;

public class StudentBiz {
	StudentDao studentDao;
	private Student student;
	//��¼
	public void login(String studentNo, String studentPassword) throws Exception {

		studentDao = StudentDao.getInstance();
		student = (Student) studentDao.getEntity(studentNo);
		if (student == null) {
			System.out.println("�û�������");
			return;
		} else if (student.getStudentPassword().equals(studentPassword)) {
			System.out.println("��¼�ɹ�");
			MainUI.show1();
		} else {
			System.out.println("���벻��ȷ");
			MainUI.show();
		}

	}
	//ע�ᣬҵ���߼�ʵ��
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
			
			System.out.println("ע��ɹ���");
			MainUI.show();
		}else {
			System.out.println("�������벻��ͬ!");
			MainUI.show();
			
		}
	}
	//�޸�����//astudent.setStudentPassword(np);//�˴��ҳ����������޸����� ��Ӧ�����ٲ�����ѧ�����ݹ������У�������ȴ�����˴����޷��޸ĳɹ���
	public void modifyPassword(String studentNo,String oldP,String np,String anp) throws Exception{
		studentDao = StudentDao.getInstance();
		IEntity astudent = studentDao.getEntity(studentNo);
		if(astudent==null){
			System.out.println("ѧ��ID����");
			MainUI.show1();
		}
		//��IEntity ǿת��student 
		 student = (Student)astudent; 
		 String pwd = student.getStudentPassword();
		if(pwd.equals(oldP)&&np.equals(anp)){
			student.setStudentPassword(np);
			studentDao.update(student);
			System.out.println("�޸ĳɹ���");
			MainUI.show();
		}else{
			System.out.println("�����������벻��ͬ��");
			MainUI.show1();
		}
	}
	
}
