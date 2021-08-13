import java.util.Scanner;

public class NRFCH {

	public static void main(String args[]) {

		boolean choice = true;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter String:");
		String str = s.next();

		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < str.length(); j++) {
				if (i != j && str.charAt(i) == str.charAt(j)) {
					choice = false;
					break;
				} // end if

			} // end inner for loop

			if (choice) {
				System.out.println("Non Repeated First Charecter=" + str.charAt(i));
				break;
				
			}
		} // end outer for loop

	}

}

/*OUTPUT:
 Enter String:
Morning
Non Repeated First Charecter=M
*/

