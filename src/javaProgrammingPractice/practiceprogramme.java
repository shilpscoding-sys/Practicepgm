package javaProgrammingPractice;

public class practiceprogramme {

	public static void main(String[] args) {
		int x = 0;
		int y = x;
		y = x++ + y;
		System.out.println(x + "-" + y);
		x = x + y++;
		System.out.println(x + "-" + y);

	}

}
