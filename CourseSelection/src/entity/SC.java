package entity;

public class SC implements IEntity {
	private String studentNo;
	private String courseNo;
	private int grade;
	private String courseName;
	
	//ѧ��
	public String getStudentNo() {
		return studentNo;
	}
	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}
	//�γ̺�
	public String getCourseNo() {
		return courseNo;
	}
	public void setCourseNo(String courseNo) {
		this.courseNo = courseNo;
	}
	//�ɼ�
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	//�γ�����
	public String getcourseName(){
		return courseName;
	}
	public void setCourseName(String courseName){
		this.courseName= courseName;
	}
}
