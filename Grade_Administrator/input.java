package Grade_Administrator;

import java.util.Scanner;

public class input {
	Scanner scan = new Scanner(System.in);
	
	public input() {
	}
	
	public void newStudent(linkedList people) {
		scan.nextLine(); // �Է� ���� �����
		System.out.println("�̸��� �Է����ּ��� > ");
		String name = scan.nextLine();

				
		System.out.println("������ �Է����ּ��� > ");
		int score = inputScore();
		
		student student = new student(name, score);
		people.addLast(student);
	}

	public void changeScore(linkedList people) {
		System.out.println("������ �л��� ��ȣ�� �Է����ּ��� > ");
		int index = scan.nextInt();

		System.out.println("������ �Է����ּ��� > ");
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
		System.out.println("������ �л��� ��ȣ�� �Է����ּ��� > ");
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
			System.out.println("�ùٸ��� ���� ��");
		}
		return score;
	}
}
