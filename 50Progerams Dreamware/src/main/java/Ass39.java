import java.util.Scanner;

public class Ass39 {

	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Number of rows:");
		int n = s.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = n; j > i; j--) {
				System.out.print(" ");
			}
			System.out.print("*");
			for (int k = 1; k < 2 * (i - 1); k++) {
				System.out.print(" ");
			}
			if (i == 1) {
				System.out.println("");
			} else {
				System.out.println("*");
			}
		}
		for (int i = n - 1; i >= 1; i--) {
			for (int j = n; j > i; j--) {
				System.out.print(" ");
			}
			System.out.print("*");
			for (int k = 1; k < 2 * (i - 1); k++) {
				System.out.print(" ");
			}
			if (i == 1)
				System.out.println("");
			else
				System.out.println("*");
		}
	}

}
