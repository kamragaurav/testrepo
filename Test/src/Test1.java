import java.util.stream.Stream;

public class Test1 {
	public static void main(String[] args) {
		Stream<String> streamGenerated =
				  Stream.generate(() -> "element").limit(10);
		//streamGenerated.forEach(System.out::println);
		
		Stream<Integer> streamIterated = Stream.iterate(40, n -> n + 2).limit(20);
		streamIterated.forEach(System.out::println);
	}

}
