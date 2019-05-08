package Grade_Administrator;

import java.util.Scanner;

public class input {
	Scanner scan = new Scanner(System.in);
	
	public input() {
	}
	
	public void newStudent(linkedList people) {
		scan.nextLine(); // 입력 버퍼 비우기용
		System.out.println("이름을 입력해주세요 > ");
		String name = scan.nextLine();

				
		System.out.println("점수를 입력해주세요 > ");
		int score = inputScore();
		
		student student = new student(name, score);
		people.addLast(student);
	}

	public void changeScore(linkedList people) {
		System.out.println("수정할 학생의 번호를 입력해주세요 > ");
		int index = scan.nextInt();

		System.out.println("점수를 입력해주세요 > ");
		int score = inputScore();
		
		try {
			student student = (student) people.getData(index);
			student.changeScore(score);
			people.changeData(student, index);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void deleteStudent(linkedList people) {
		System.out.println("삭제할 학생의 번호를 입력해주세요 > ");
		int index = scan.nextInt();
		
		try {
			people.remove(index);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private int inputScore() {
		int score = 0;
		while(true) {
			score = scan.nextInt();
			if(score >= 0 && score <= 100)
				break;
			System.out.println("올바르지 않은 값");
		}
		return score;
	}
}
