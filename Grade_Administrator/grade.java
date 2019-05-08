package Grade_Administrator;

public class grade {
	public static student[] sort(linkedList people) {
		student student[] = new student[people.getLength()];
		
		for(int i = 0; i < people.getLength(); i++) {
			try {
				student[i] = (student) people.getData(i);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		for(int i = 0; i < people.getLength(); i++) {
			for(int j = 0; j < people.getLength() - i - 1; j++) {
				if(student[j].getScore() > student[j + 1].getScore()) {
					student temp = student[j];
					student[j] = student[j + 1];
					student[j + 1] = temp; 
				}
			}
		}
		return student;
	}
	
	public static void print(linkedList people) {
		student student[] = sort(people);
		System.out.println();
		
		for(int i = people.getLength() - 1; i >= 0; i--) {
			output.printStudent(student[i]);
			
			if(student[i].getScore() >= 90) 
				System.out.print(" A");
			else if(student[i].getScore() >= 80) 
				System.out.print(" B");
			else if(student[i].getScore() >= 70) 
				System.out.print(" C");
			else if(student[i].getScore() >= 60) 
				System.out.print(" D");
			else
				System.out.print("F");
			
			if(student[i].getScore() % 10 >= 5)
				System.out.print("+");
			
			System.out.println();
		}
		System.out.println();
	}
}
