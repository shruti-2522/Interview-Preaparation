import java.util.Scanner;

public class Ass244 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter Number Of Rows:");
		int n = s.nextInt();

		int i, j;

		for (i = 1; i <= n; i++) {
			for (j = 1; j <= i; j++) {
				System.out.print("* ");
			}

			for (j = i; j < n; j++) {
				System.out.print("  ");
			}

			for (j = i; j < n; j++) {
				System.out.print("  ");
			}
			for (j = 1; j <= i; j++) {
				System.out.print("* ");
			}

			System.out.println();

		}

	}
}
