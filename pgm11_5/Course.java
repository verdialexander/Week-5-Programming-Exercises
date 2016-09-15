package pgm11_5;
import java.util.ArrayList;

public class Course {
	// Data fields
	private String courseName;
	private ArrayList<String> students;

	// Constructor
	/** Create a Course object */
	public Course(String courseName) {
		this.courseName = courseName;
		students = new ArrayList<String>();
	}

	// Methods
	/** Add a student to the list */
	public void addStudent(String student) {
		students.add(student);
	}

	/** Return students in an array */
	public String[] getStudents() {
		String[] a = new String[students.size()];
		return students.toArray(a);
	}

	/** Return number of students */
	public int getNumberOfStudents() {
		return students.size();
	}

	/** Return course name */
	public String getCourseName() {
		return courseName;
	}

	/** Drop a student for list */
	public void dropStudent(String student) {
		students.remove(student);
	}
}