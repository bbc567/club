package Grade_Administrator;

public class Grade_Administrator {
	public static void main(String[] args) {
		try {
			linkedList hh = new linkedList();
			hh.addLast(10);
			hh.addLast(20);
			hh.addLast(30);
			System.out.println((hh.dataToIndex(1)));
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
