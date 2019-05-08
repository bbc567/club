package Grade_Administrator;

public class student {
	private String name = null;
	private int score = 0;
	
	public student(String name, int score) {
		this.name = name;
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public int getScore() {
		return score;
	}
	public void changeScore(int score) {
		this.score = score;
	}
}
