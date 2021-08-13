import java.util.Scanner;

public class SumEle {

	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);

		System.out.println("How Many Elements:");
		int n = s.nextInt();

		System.out.println("Enter Elemnts:");
		int n1, sum = 0;
		for (int i = 1; i <= n; i++) {
			n1 = s.nextInt();
		} // end for

		for (int i = 1; i <= n; i++) {
			sum = sum + i;
		} // end for
		System.out.println("Sum of elemnts=" + sum);
	}// end main
}// end class
