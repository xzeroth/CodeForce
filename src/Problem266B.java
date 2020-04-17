import java.util.Scanner;

public class Problem266B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int a, b;
		String c;
		
		a = input.nextInt();
		b = input.nextInt();
		c = input.next();
		
		char[] d = c.toCharArray();
		
		
		for(int i = 0 ; i < b ; i++) {
			for(int j = 0 ; j < a-1 ; j++) {
				if(d[j] == 'B' && d[j+1] == 'G') {
					d[j] = 'G';
					d[j+1] = 'B';
					j++;
				}
			}
			
		}
		System.out.println(d);
		

	}

}
