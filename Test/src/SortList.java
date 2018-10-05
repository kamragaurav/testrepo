import java.util.Comparator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SortList  {
	
	public static void main(String[] args) {
		Stream<Integer> intStream = Stream.of(1,3,5,1);
		intStream.sorted((n1,n2)->n2-n1).forEach(System.out::println);
		
	}

	

}
