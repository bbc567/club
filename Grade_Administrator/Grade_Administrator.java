package Grade_Administrator;

import java.io.PrintStream;

public class Grade_Administrator {
	private static final int NEW_STUDENT = 0;
	private static final int CHANGE_STUDENT_SCORE = 1;
	private static final int DELETE_STUDENT = 2;
	private static final int VIEW_GRADE = 3;
	
	
	public static void main(String[] args) {
		try {
			input input = new input();
			linkedList people = new linkedList();
			
			boolean stay = true;
			int before = -1;			
			
			while(stay) {
				if(before >= NEW_STUDENT && before <= DELETE_STUDENT)
					output.printPeople(people);
				output.viewSelection();
				before = input.scan.nextInt();
				
				switch(before) {
				case NEW_STUDENT :
					input.newStudent(people);
					break;
				case CHANGE_STUDENT_SCORE :
					input.changeScore(people);
					break;
				case DELETE_STUDENT :
					input.deleteStudent(people);
					break;
				case VIEW_GRADE :
					grade.print(people);
					break;
				}
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
