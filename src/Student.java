
public class Student {
	private String stuName;
	private int stuAge;
	private String stuSex;
	private int stuGrade;
	public Student(String stuName, int stuAge, String stuSex, int stuGrade) {
		super();
		this.stuName = stuName;
		this.stuAge = stuAge;
		this.stuSex = stuSex;
		this.stuGrade = stuGrade;
	}
	
	public void learn(){
		System.out.println(stuName+"���������ѧϰ");
	}

	public String doHomework(int hour){
		return "���ڱ���ʱ�䣺"+hour+"��"+stuName+"����д��ҵ";
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public int getStuAge() {
		return stuAge;
	}

	public void setStuAge(int stuAge) {
		this.stuAge = stuAge;
	}

	public String getStuSex() {
		return stuSex;
	}

	public void setStuSex(String stuSex) {
		this.stuSex = stuSex;
	}

	public int getStuGrade() {
		return stuGrade;
	}

	public void setStuGrade(int stuGrade) {
		this.stuGrade = stuGrade;
	}
	
}
