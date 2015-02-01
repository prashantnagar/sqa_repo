package classExercise;

public class StudentInfo {
	private int studentId;
	private String studentName;
	private int studentZip;		
	
	public StudentInfo(int id, String name, int zip) {
		this.studentId = id;
		this.studentName = name;
		this.studentZip = zip;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getStudentZip() {
		return studentZip;
	}
	public void setStudentZip(int studentZip) {
		this.studentZip = studentZip;
	}
}
