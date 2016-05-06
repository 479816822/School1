import java.util.Scanner;

public class School {

	static Scanner input= new Scanner(System.in);
	private Teacher[] tea=new Teacher[2]; //申明四个空间的学生对象的数组
	private Student [] stu =new Student[4]; //申明四个空间的学生对象的数组
	
	public void createTea(){
		for (int i = 0; i < tea.length; i++) {
			System.out.println("请输入老师的姓名:");
			String name =input.next();
			System.out.println("请输入老师的专业:");
			String spacialty=input.next();
			System.out.println("请输入老师的课程:");
			String cours=input.next();
			System.out.println("请输入老师的教龄:");
			int years=input.nextInt();
			Teacher tea1=new Teacher(name, spacialty, cours,  years);
			tea[i]=tea1;
		}
		
	}
	public void createStu(){
		for (int i = 0; i < stu.length; i++) {
			System.out.println("请输入学生的姓名:");
			String name=input.next();
			System.out.println("请输入学生的年龄:");
			int age=input.nextInt();
			System.out.println("请输入学生的性别:");
			String sex=input.next();
			System.out.println("请输入学生的年级:");
			int grand=input.nextInt();
			Student stu1=new Student(name, age, sex, grand);
			stu[i]=stu1;
			
		}
		
	}
	public Teacher getTea(int i) {
		return tea[i];
	}
	public void setTea(Teacher[] tea) {
		this.tea = tea;
	}
	public Student getStu(int i) {
		return stu[i];
	}
	public void setStu(Student[] stu) {
		this.stu = stu;
	}
	
}
