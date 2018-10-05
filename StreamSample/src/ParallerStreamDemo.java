import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ParallerStreamDemo {
	
	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		students.add(new Student("student1", 21));
		students.add(new Student("student2", 22));
		students.add(new Student("student3", 23));
		students.add(new Student("student4", 24));
		students.add(new Student("student5", 25));
		
		Stream<Student> studentStream = students.parallelStream();
		studentStream.forEach(s->doProcess(s));
		
	}

	private static void doProcess(Student s) {
		System.out.println(s.toString());
	}

}
