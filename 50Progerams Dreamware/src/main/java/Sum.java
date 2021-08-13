import java.util.Scanner;

public class Sum {

	public static void main(String args[]) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter Array Size:");
		int n = s.nextInt();
		int gno = 20;

		int arr[] = new int[n];
		System.out.println("Enter Array Elements:");
		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if ((arr[i] + arr[j]) == gno) {
					System.out.println("[" + arr[i] + "," + arr[j] + "]");
				}
			}
		}
	}

}

/*
 * OUTPUT: Enter Array Size: 5 Enter Array Elements: 10 10 2 18 3 [10,10] [2,18]
 * 
 */
