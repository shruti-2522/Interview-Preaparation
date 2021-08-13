import java.util.Scanner;

public class Ksmallest {

	public static void main(String args[]) {

		int temp;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter array size:");
		int n = s.nextInt();

		int arr[] = new int[n];

		System.out.println("Enter Array Elements");
		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}

		System.out.println("Enter elemtt to find kth smallest element");
		int k = s.nextInt();

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}

			} // end inner
			if (i == k - 1) {
				System.out.println("Smallest element=" + arr[i]);
			} // end if
		} // end outer

	}// end main

}// end class

/*
 * Output: Enter array size: 5 Enter Array Elements 1 43 5 0 2 Enter elemtt to
 * find kth smalles element 2 Smallest element=1
 */
