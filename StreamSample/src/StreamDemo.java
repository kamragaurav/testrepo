import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {
	public static void main(String[] args) {
		
		
		List<Student> students = new ArrayList<>();
		students.add(new Student("student1", 21));
		students.add(new Student("student2", 22));
		students.add(new Student("student3", 23));
		students.add(new Student("student4", 24));
		students.add(new Student("student5", 25));
		
		Stream<Student> streams = students.stream().filter(s->s.getAge()>22);
		streams.forEach(System.out::println);
		
		boolean b = students.stream().anyMatch(s->s.getName().contains("2tud"));
		System.out.println(b);
		
		boolean a = students.stream().allMatch(s->s.getAge()>21);
		
		System.out.println(a);
		
		boolean c = students.stream().noneMatch(s->s.getName().equals("student1"));
		System.out.println(c);
	}

}
