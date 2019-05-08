package Grade_Administrator;

import java.util.Scanner;

public class input {
	Scanner scan = new Scanner(System.in);
	
	public input() {
	}
	
	public void newStudent(linkedList people) {
		System.out.println("�̸��� �Է����ּ��� > ");
		String name = scan.nextLine();
		System.out.println("������ �Է����ּ��� > ");
		int score = scan.nextInt();
		
		student student = new student(name, score);
		people.addLast(student);
	}

	public void changeScore(linkedList people) {
		System.out.println("������ �л��� ��ȣ�� �Է����ּ��� > ");
		int index = scan.nextInt();

		System.out.println("������ �Է����ּ��� > ");
		int score = scan.nextInt();
		
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
}
