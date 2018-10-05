
public class Employee {
	

	
	private String name;
	private int age;
	private String subject;
	
	
	
	public Employee(String name, int age, String subject) {
		super();
		this.name = name;
		this.age = age;
		this.subject = subject;
	}
	
	
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
	
	
	



}
