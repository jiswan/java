/**
 * @author hur-admin
 *
 */
class Mark
{
	private String subject;
	private int mark;
	public Mark(String subject, int mark) {
		
		this.subject = subject;
		this.mark = mark;
	}
	public String getSubject() {
		return subject;
	}
	
	public int getMark() {
		return mark;
	}
	
	
}

public class Student {
	
	private String name;
	private int age;
	private int studentId;
	private Mark[] markArray;
	
    
	public Student(String name, int age, int studentId, Mark[] markArray) {
		this.name = name;
		this.age = age;
		this.studentId = studentId;
		this.markArray = markArray;
	}
	
	public void displayDetails()
	{
		   System.out.println("Student Details:");
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	        System.out.println("Student ID: " + studentId);
	        System.out.println("Marks:");

	        for (Mark mark : markArray) {
	            System.out.println(mark.getSubject() + ": " + mark.getMark());
	        }
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Mark[] marksArray = {
		            new Mark("Math", 90),
		            new Mark("Science", 85),
		            new Mark("English", 75),
		            new Mark("History", 80),
		            new Mark("Programming", 95)
		        };
		// Creating a student
	        Student student = new Student("John", 20, 1, marksArray);
	        
	        student.displayDetails();
	}

}
