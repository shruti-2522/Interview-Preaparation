import java.util.Scanner;

public class MaxMin {

	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int arr[] = new int[10];
		System.out.println("Enter Array Elements:");
		for (int i = 0; i < 10; i++) {
			arr[i] = s.nextInt();
		}

		int max = arr[0];
		int min = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			} // end if
			else {
				if (arr[i] < min) {
					min = arr[i];
				} // end if
			} // end else

		} // end for

		System.out.println("Largest Number=" + max);
		System.out.println("Smallest Number=" + min);
	}

}

/*
 * output: 10 20 45 67 43 23 32 22 11 24 Maximum Number=67 Minimum Number=10
 */