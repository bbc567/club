package Grade_Administrator;

public class output {
	public output() {		
	}
	
	public static void printStudents(linkedList people) {		
		for(int index = 0; index < people.getLength(); index++) {
			try {
				student student = (student) people.getData(index);
				System.out.println(index + " :  " + student.getName() + "  " + student.getScore() + "점");

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void viewSelection() {
		System.out.println("0. 학생 추가");
		System.out.println("1. 학생 수정");
		System.out.println("2. 학생 삭제");
		System.out.println("3. 석차 보기");
	}
}