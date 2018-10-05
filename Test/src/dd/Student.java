package dd;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Student implements Externalizable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6312288945001064932L;
	/**
	 * 
	 */
	
	private Integer rollNumber;
	private  String name;
	
	public Student() {
		// TODO Auto-generated constructor stub
		System.out.println("Default Constructor");
	}
	public Student(Integer rollNumber, String name) {
		super();
		System.out.println("Parameterized Constructor");
		this.rollNumber = rollNumber;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", name=" + name + "]";
	}
	
	/*public Student(Integer rollNumber) {
		this.rollNumber = rollNumber;
	}
	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber+" ]";
	}
	*/
/*	private void writeObject(ObjectOutputStream outputStream) throws IOException {
		outputStream.writeInt(this.rollNumber);
		outputStream.writeObject("default");
	}

	private void readObject(ObjectInputStream inputStream) throws IOException, ClassNotFoundException {
		this.rollNumber = inputStream.readInt();
		this.name = (String) inputStream.readObject();
	}*/
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeInt(this.rollNumber);
		out.writeObject("default");
		
	}
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		this.rollNumber = in.readInt();
		this.name = (String) in.readObject();
		
	}
}
