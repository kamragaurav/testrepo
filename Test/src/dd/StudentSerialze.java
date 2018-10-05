package dd;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class StudentSerialze {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Student gaurav = new Student(21, "Gaurav");
		Student yash = new Student(22, "Yashendra");
		
		FileOutputStream fileOutputStream = new FileOutputStream("ser.txt");
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(gaurav);
		objectOutputStream.writeObject(yash);
		objectOutputStream.writeObject(new EndOfFileFlag());
		
		
		
	}

}
