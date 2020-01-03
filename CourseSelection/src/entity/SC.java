package entity;

public class SC implements IEntity {
	private String studentNo;
	private String courseNo;
	private int grade;
	private String courseName;
	
	//学号
	public String getStudentNo() {
		return studentNo;
	}
	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}
	//课程号
	public String getCourseNo() {
		return courseNo;
	}
	public void setCourseNo(String courseNo) {
		this.courseNo = courseNo;
	}
	//成绩
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	//课程名字
	public String getcourseName(){
		return courseName;
	}
	public void setCourseName(String courseName){
		this.courseName= courseName;
	}
}
