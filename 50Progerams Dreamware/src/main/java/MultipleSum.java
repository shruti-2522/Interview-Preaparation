import java.util.Scanner;

public class MultipleSum {

	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);

		System.out.println("How Many Elements:");
		int n = s.nextInt();

		System.out.println("Enter Elements:");
		int n1, sum = 0;
		for (int i = 1; i <= n; i++) {
			n1 = s.nextInt();
		} // end for

		for (int i = 1; i <= n; i++) {
			if(i%3==0 || i%5==0)
			   sum = sum + i;
		} // end for
		System.out.println("Sum of Multiple od 3 or 5 is=" + sum);
	}// end main
}// end class
