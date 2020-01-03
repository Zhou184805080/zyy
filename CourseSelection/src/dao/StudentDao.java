package dao;
import entity.IEntity;
import entity.Student;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;
import java.util.HashMap;
public  class StudentDao implements IDao {

	private static StudentDao instance;
	//存储学生信息的集合<学号，学生体>
	private HashMap<String, Student> students;
	private Student student;
	
	public StudentDao() {
		students = new HashMap<String, Student>();
		student = new Student();
		
		student.setStudentNo("10001");
		student.setStudentName("张三");
		student.setStudentGender("男");
		student.setStudentPassword("123");
		student.setStudentAge(20);
		student.setStudentDepartment("软件学院");
		students.put(student.getStudentNo(), student);
	}
	
	public static  StudentDao getInstance() {
		if(instance == null) {
			synchronized(StudentDao.class) {
				if(instance == null) {
					instance = new StudentDao();
					return instance;
				}
			}
		}
		return instance;
	}
	@Override
	public void insert(IEntity entity) {
		// TODO Auto-generated method stub
		Student st = (Student)entity;
		students.put(st.getStudentNo(), st);
	}

	@Override
	public void delete(IEntity entity) {
		// TODO Auto-generated method stub
		Student st= (Student)entity;
		students.put(st.getStudentNo(), null);
		/*String studentNo= st.getStudentNo();
		Set entrySet = students.entrySet();
		Iterator it = (Iterator) entrySet.iterator();
		 while(it.hashNext){
			 HashMap.Entry entry =(Map.Entry<String, Student>)(it.next());
			 Object key =entry.getKey();
			 if(key.equals(studentNo)){
				 it.remove();
			 }
		 }*/

	}

	public void update(IEntity entity) {
		// TODO Auto-generated method stub
 		Student st = (Student)entity;
 		//String pwd =st.getStudentPassword();
 		//System.out.println(pwd);
		students.put(st.getStudentNo(), st);
		
	}

	@Override
	public HashMap<String, IEntity> getAllEntities() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student getEntity(String Id) {
		// TODO Auto-generated method stub		
		return students.get(Id);
	}

	@Override
	public void delete(IEntity entity, IEntity entity1) {
		// TODO 自动生成的方法存根
		
	}

	
	

}
