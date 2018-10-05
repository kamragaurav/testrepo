package dd;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class StudentDesiralize {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fileInputStream = new FileInputStream("ser.txt");
		ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);
		Object student;
		while (!(((student =  inputStream.readObject())) instanceof EndOfFileFlag)) {
			System.out.println(student);
		}
	}

}
