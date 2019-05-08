package Grade_Administrator;

public class output {
	public output() {		
	}
	
	public static void printPeople(linkedList people) {	
		System.out.println();
		for(int index = 0; index < people.getLength(); index++) {
			try {
				System.out.print(index + " :  ");
				printStudent((student) people.getData(index));
				System.out.println();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println();
	}
	
	public static void printStudent(student student) {
		System.out.print(student.getName() + "  " + student.getScore() + "점");
	}
	
	public static void viewSelection() {
		System.out.println("0. 학생 추가");
		System.out.println("1. 학생 수정");
		System.out.println("2. 학생 삭제");
		System.out.println("3. 석차 보기");
	}
}