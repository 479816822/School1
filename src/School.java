import java.util.Scanner;

public class School {

	static Scanner input= new Scanner(System.in);
	private Teacher[] tea=new Teacher[2]; //�����ĸ��ռ��ѧ�����������
	private Student [] stu =new Student[4]; //�����ĸ��ռ��ѧ�����������
	
	public void createTea(){
		for (int i = 0; i < tea.length; i++) {
			System.out.println("��������ʦ������:");
			String name =input.next();
			System.out.println("��������ʦ��רҵ:");
			String spacialty=input.next();
			System.out.println("��������ʦ�Ŀγ�:");
			String cours=input.next();
			System.out.println("��������ʦ�Ľ���:");
			int years=input.nextInt();
			Teacher tea1=new Teacher(name, spacialty, cours,  years);
			tea[i]=tea1;
		}
		
	}
	public void createStu(){
		for (int i = 0; i < stu.length; i++) {
			System.out.println("������ѧ��������:");
			String name=input.next();
			System.out.println("������ѧ��������:");
			int age=input.nextInt();
			System.out.println("������ѧ�����Ա�:");
			String sex=input.next();
			System.out.println("������ѧ�����꼶:");
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
