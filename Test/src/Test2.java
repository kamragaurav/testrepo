
public class Test2 {
	int j=0;
	private int print() {
		j=j++;
		j=j++;
		j=j++;
		j=j++;
		System.out.println(j);
		return j;

	}
	public static void main(String[] args) {
		System.out.println(new Test2().print());
	}

}
