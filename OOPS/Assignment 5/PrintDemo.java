
class Student{
	String name;
	
	Student(String name){
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}

class Teacher extends Person{
	double salary;
	String subject;
	
	
	public Teacher(String name, double salary, String subject) {
		super(name);
		this.salary = salary;
		this.subject = subject;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
}

class CollegeStudent extends Student{
	int year;
	String major;
	
	public CollegeStudent(String name,int year, String major) {
		super(name);
		this.year = year;
		this.major = major;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
}

class PrintDemo{
	public static void main(String args[]){
		Teacher t = new Teacher("ABC",20000.0,"Computer Science");
		CollegeStudent cs = new CollegeStudent("XYZ",2020,"Electronics Engineering");
		System.out.println("Teacher's Name: "+t.getName());
		System.out.println("Salary: "+t.getSalary());
		System.out.println("Subject: "+t.getSubject());
		
		System.out.println("Student's Name: "+cs.getName());
		System.out.println("Year: "+cs.getYear());
		System.out.println("Major: "+cs.getMajor());
	}
}