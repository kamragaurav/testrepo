import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class FindAny {
	
	public static void main(String[] args) {
		
		List<String> names = new ArrayList<>();
		names.add("Test");
		names.add("rest");
		names.add("best");
		names.add("guest");
		names.add("next");
		names.add("next");
		Stream stream= names.stream();
		/*String op = (String) stream.filter(x->"rest".equals(x))
		.findFirst()
		.orElse(null);*/
		
		Optional op =  stream.filter(x->"rest".equals(x))
		.findFirst();
		
		
	}

}
