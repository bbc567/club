package Grade_Administrator;

public class output {
	public output() {		
	}
	
	public static void printStudents(linkedList people) {		
		for(int index = 0; index < people.getLength(); index++) {
			try {
				student student = (student) people.getData(index);
				System.out.println(index + " :  " + student.getName() + "  " + student.getScore() + "��");

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void viewSelection() {
		System.out.println("0. �л� �߰�");
		System.out.println("1. �л� ����");
		System.out.println("2. �л� ����");
		System.out.println("3. ���� ����");
	}
}