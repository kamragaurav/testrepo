package dd;

import java.io.File;

public class Main {
	
	public static void main(String[] args) {
		int i =10;
		File file = new File("C://test.txt");
		System.out.println(file.getName());
		try {
		if(i==10) {
			throw new CustomException("Sample");
			
			
		}
		}
		catch (CustomException e) {
			System.out.println("Caughr");
		}catch (Exception e) {
			// TODO: handle exception
		}
	}

}
