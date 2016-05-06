
public class Teacher {

	private String teaName;
	private String teaSpecialty;
	private String teaCourse;
	private int teaYears;
	
	
	public Teacher(String teaName, String teaSpecialty, String teaCourse, int teaYears) {
		super();
		this.teaName = teaName;
		this.teaSpecialty = teaSpecialty;
		this.teaCourse = teaCourse;
		this.teaYears = teaYears;
	}
	public void teach(){
		System.out.println(teaName+"正在辛苦地讲"+teaCourse+"课程");
	}
	public void checkHomework(Student stu){
		System.out.println("讲授"+teaCourse+"课程的老师："+teaName+"已经批改完了"+stu.getStuName()+"的作业");
	}
}
