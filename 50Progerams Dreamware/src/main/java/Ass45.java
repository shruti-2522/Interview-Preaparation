import java.util.Scanner;

public class Ass45 {

	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Number of rows:");
		int n = s.nextInt();
		int i, j;

		for (i = 1; i <= n; i++) {
			for (j = 1; j <= i; j++) {
				if (j % 2 == 0) {
					System.out.print("0");
				} else {
					System.out.print("1");
				}

			}
			System.out.println();
		}

	}
}

/*
 * Output: 1 10 101 1010 10101
 */