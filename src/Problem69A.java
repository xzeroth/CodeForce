import java.util.Scanner;

public class Problem69A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		int n = input.nextInt();

		int x, y, z;
		x = y = z = 0;

		while (n > 0) {
			x = x + input.nextInt();
			y = y + input.nextInt();
			z = z + input.nextInt();
			n = n - 1;
		}

		if (x == 0 && y == 0 && z == 0) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}

}
