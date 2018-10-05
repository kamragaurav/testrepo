import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class ReferenceToInstanceMethod {
	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		students.add(new Student("Gaurav", 21));
		students.add(new Student("swapnil", 22));
		students.add(new Student("ratna", 23));
		students.add(new Student("Gaurav", 24));
		students.add(new Student("aniket", 25));
		
		List<String> result = ReferenceToInstanceMethod.getStudentNames(students, Student::getName);
		result.forEach(System.out::println);
		
		
	}

	public static List<String> getStudentNames(List<Student> students,Function<Student, String> f){
		List<String> result = new ArrayList<>();
		
		students.forEach(n->result.add(f.apply(n)));
		
		return result;
	}

}
