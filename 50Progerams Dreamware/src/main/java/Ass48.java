import java.util.Scanner;

public class Ass48 {

	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Number of rows:");
		int n = s.nextInt();
        char ch='A';
		for (int i = 1; i <= n; i++) {
			for (int j = n; j > i; j--) {
				System.out.print(" ");
			}
			System.out.print(ch+" ");
		
			for (int k = 1; k < 2 * (i - 1); k++) {
				System.out.print(" ");
			}
			if (i == 1) {
				System.out.println("");
			} else {
				System.out.println(ch+" ");
				
			}
			ch++;
		}
		for (int i = n - 1; i >= 1; i--) {
			for (int j = n; j > i; j--) {
				System.out.print(" ");
			}
			System.out.print(ch+"");
			for (int k = 1; k < 2 * (i - 1); k++) {
				System.out.print(" ");
			}
			if (i == 1)
				System.out.println("");
			else
				System.out.println(ch+"");
			ch--;
		}
	}

}
