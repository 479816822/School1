
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
		System.out.println(teaName+"��������ؽ�"+teaCourse+"�γ�");
	}
	public void checkHomework(Student stu){
		System.out.println("����"+teaCourse+"�γ̵���ʦ��"+teaName+"�Ѿ���������"+stu.getStuName()+"����ҵ");
	}
}
