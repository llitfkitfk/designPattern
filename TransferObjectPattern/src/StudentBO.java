import java.util.ArrayList;
import java.util.List;


public class StudentBO {
	List<StudentVO> students;
	
	public StudentBO() {
		// TODO Auto-generated constructor stub
	
		students = new ArrayList<StudentVO>();
		StudentVO student1 = new StudentVO("Paul", 0);
		StudentVO student2 = new StudentVO("Paul2", 1);
		
		
		students.add(student1);
		students.add(student2);
		
	}
	
	public void deleteStudent(StudentVO student) {
		students.remove(student.getRollNo());
		System.out.println("Student roll num: " + student.getRollNo() + " deleted");
		
	}

	public List<StudentVO> getStudents() {
		return students;
	}
	
	public StudentVO getStudent(int index) {
		return students.get(index);
	}
	
	public void setStudents(List<StudentVO> students) {
		this.students = students;
	}
	
	public void updateStudent(StudentVO student) {
		students.get(student.getRollNo()).setName(student.getName());
		System.out.println("Student roll num: " + student.getRollNo() + " updated");
	}
	
}
