import java.util.Scanner;

public class Ass44 {

	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Number of rows:");
		int n = s.nextInt();

		int i, j;

		for (i = 1; i <= n; i++) {
			for (j = 1; j <= n; j++) {

				if (i % 2 == 0) {
					if (j % 2 == 0)
						System.out.print("1");
					else
						System.out.print("0");

				}

				else {
					if (j % 2 == 0)
						System.out.print("0");
					else
						System.out.print("1");
				}

			}
			System.out.println();
		}

	}
}

/*OUTPUT:
10101
01010
10101
01010
10101

*/
