import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class EmployeeStream {
	
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee("ab", 22, "IT"));
		list.add(new Employee("zs", 34, "IT"));
		list.add(new Employee("bc", 21, "IT"));
		list.add(new Employee("ka", 45, "IT"));
		list.add(new Employee("nd", 30, "IT"));
		
		Stream<Employee> employeeStream = list.stream();
		employeeStream.filter(a -> a.getName().startsWith("a")).forEach(System.out::println);
		
	}

}
