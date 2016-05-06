
public class TestSchool {
	public static void main(String[] args) {
		School sch=new School();
		sch.createTea();
		sch.createStu();
		sch.getTea(1).checkHomework(sch.getStu(1));
	}
}
