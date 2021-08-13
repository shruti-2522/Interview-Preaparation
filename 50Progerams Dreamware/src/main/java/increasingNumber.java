import java.util.Scanner;

public class increasingNumber {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Number of rows:");
		int n = s.nextInt();

		int i, j;

		int k = 0;
		/*
		 * for(i=1;i<=n;i++) { for(j=1;j<=i;j++) { System.out.print(" "+(k=k+1)); }
		 * System.out.println(); } }
		 */

		for (i = 1; i <= n; i++) {
			for (j = 1; j <= i; j++) {
				System.out.print(" " + (k = k + 1));
			}
			System.out.println();
		}
	}
}
