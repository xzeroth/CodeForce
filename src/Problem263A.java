import java.util.Scanner;

public class Problem263A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		int x = 0, y = 0, c = 0;

		while (x == 0) {
			x = input.nextInt();
			c++;
		}

		c--;
		x = c / 5;
		y = c % 5;

		System.out.println(Math.abs(x - 2) + Math.abs(y - 2));

	}

}
