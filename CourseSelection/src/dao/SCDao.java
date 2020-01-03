package dao;
import entity.Course;
import entity.IEntity;
import entity.SC;
import entity.Student;
import view.MainUI;

import java.util.HashMap;

import biz.SCBiz;

public  class SCDao implements IDao {
	
	private static  SCDao instance;
	private HashMap<String,SC> scdao;//存储选课信息的双列集合<学号，选课体>
	
	public SCDao(){
		scdao = new HashMap<String,SC>();
	}
	
	public static  SCDao getInstance() {
		if(instance == null) {
			synchronized(SCDao.class) {
				if(instance == null) {
					instance = new SCDao();
					return instance;
				}
			}
		}
		return instance;
	}


	@Override
	public void insert(IEntity entity) {
		// TODO Auto-generated method stub
		SC sc = (SC)entity;
		scdao.put(sc.getStudentNo(), sc);

	}

	@Override
	public void delete(IEntity entity,IEntity entity1) {
		// TODO Auto-generated method stub
		Student student = (Student)entity;
		Course course=(Course)entity1;
		String studentNo = student.getStudentNo();
		String courseName = course.getCourseName();
		SC selectedCourseN= scdao.get(studentNo);
		//String中的contains和replace 方法
		if( selectedCourseN.contains(courseName)){
			selectedCourseN.replace(courseName,"");
			System.out.println("退选成功！");
			System.out.println("以下是您所选的全部课程：");
			SCBiz scbiz = new SCBiz();
			scbiz.showSelection();
			MainUI.show();
			}else{
			System.out.println("没有选这门课程！");
			return;
		}
	}
    @Override
	public void update(IEntity entity) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public HashMap<String, IEntity> getAllEntities() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IEntity getEntity(String Id) {
		// TODO Auto-generated method stub
		return scdao.get(Id);
	}

	@Override
	public void delete(IEntity entity) {
		// TODO 自动生成的方法存根
		
	}

	

	

}
