
public class Student {
	private String studentName;
	private int ide;
	
	Student(String studentName,int ide)
	
	{
		this.studentName=studentName;
		this.ide=ide;
	}
	void show()
	{
		System.out.println("student name is =" +studentName);
		System.out.println("student ide is =" +ide);
		System.out.println("-----------------");
	}
}
