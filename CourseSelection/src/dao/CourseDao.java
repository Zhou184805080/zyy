package dao;
import entity.Course;
import entity.IEntity;
import java.util.HashMap;

public   class CourseDao implements IDao {
	private static CourseDao instance;
	private HashMap<String,Course> courses;//存储课程信息的<课程学号，课程体>
	private Course course;
	private CourseDao(){
		courses = new HashMap<String,Course>();
		course = new Course();
		
		course.setCourseNo("1");
		course.setCourseName("java基础");
		course.setCourseGrade(3);
		courses.put(course.getCourseNo(), course);
	}
	
	public static  CourseDao getInstance() {
		if(instance == null) {
			synchronized(CourseDao.class) {
				if(instance == null) {
					instance = new CourseDao();
					return instance;
				}
			}
		}
		return instance;
	}

	
	@Override
	public void insert(IEntity entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(IEntity entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(IEntity entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public HashMap<String, entity.IEntity> getAllEntities() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IEntity getEntity(String Id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(IEntity entity, IEntity entity1) {
		// TODO 自动生成的方法存根
		
	}


}
