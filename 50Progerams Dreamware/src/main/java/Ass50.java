import java.util.Scanner;

public class Ass50 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Number Of Rows in Matrix:");
		int r = s.nextInt();

		System.out.println("Enter Number Of columns in Matrix:");
		int c = s.nextInt();

		int a1[][] = new int[r][c];
		int a2[][] = new int[r][c];

		int a3[][] = new int[r][c];

		int i, j,k;
		
		

		System.out.println("Enter Element in first Matrix:");
		for (i = 0; i < r; i++) {
			for (j = 0; j < c; j++) {
				a1[i][j] = s.nextInt();
			}
		}

		System.out.println("Enter Element in Second Matrix:");
		for (i = 0; i < r; i++) {
			for (j = 0; j < c; j++) {
				a2[i][j] = s.nextInt();
			}
		}

		System.out.println("\n First Matrix is:");
		 for (i = 0; i < r; i++) {
             for (j = 0; j < c; j++) {
                   System.out.print(a1[i][j] + " ");
             }
             System.out.println();
		 }
		 
		 System.out.println("\n Second Matrix is:");
		 for (i = 0; i < r; i++) {
             for (j = 0; j < c; j++) {
                   System.out.print(a2[i][j] + " ");
             }
             System.out.println();
		 }
		 
			System.out.println("1.Addition:");
			System.out.println("2.Substarction:");
			System.out.println("3.Division:");
			System.out.println("4.Multiplication:");
		    System.out.println("5.Transpose:");
		    System.out.println("6.Exit:");
		
		
		System.out.println("Enter Any Choice:");
		int ch = s.nextInt();
		
	

		switch (ch) {
		case 1:
			for (i = 0; i < r; i++) {
				for (j = 0; j < c; j++) {
					a3[i][j] = a1[i][j]+a2[i][j];
				}
			}
			
			
			System.out.println("Addition of the Matrix is:");
			for(i=0;i<r;i++)
			{
				for(j=0;j<c;j++)
				{
					System.out.print(a3[i][j]+" ");
				}
				System.out.println();
				
			}
			
			break;
			
		case 2:
			for (i = 0; i < r; i++) {
				for (j = 0; j < c; j++) {
					a3[i][j] = a1[i][j]-a2[i][j];
				}
			}
			
			
			System.out.println("Substraction of the Matrix is:");
			for(i=0;i<r;i++)
			{
				for(j=0;j<c;j++)
				{
					System.out.print(a3[i][j]+" ");
				}
				System.out.println();
				
			}
			break;
			
		case 3:
			
			for(i=0;i<c;i++)
			{
			for (j = 0; j< r; j++) {
				for (k = 0; k < c; k++) {
					a3[i][j]=0;
					a3[i][j] =a3[i][j]+ a1[i][k]/a2[k][j];
				}
			}
			}
			
			System.out.println("Division of the Matrix is:");
			for(i=0;i<c;i++)
			{
			for(j=0;j<r;j++)
			{
			  System.out.print(a3[i][j]+" ");
				}
				System.out.println();
				
			}
			break;
			
case 4:
			
			for(i=0;i<c;i++)
			{
			for (j = 0; j< r; j++) {
				for (k = 0; k < c; k++) {
					a3[i][j]=0;
					a3[i][j] =a3[i][j]+ a1[i][k]*a2[k][j];
				}
			}
			}
			
			System.out.println("Multiplication of the Matrix is:");
			for(i=0;i<c;i++)
			{
			for(j=0;j<r;j++)
			{
			  System.out.print(a3[i][j]+" ");
				}
				System.out.println();
				
			}
			break;
			
		case 5:
			for(i=0;i<c;i++)
			{
			for (j = 0; j< r; j++) {
				for (k = 0; k < c; k++) {
					 a1[i][j]=a2[j][i];
				}
			}
			}
			
			System.out.println("Transpose of the Matrix is:");
			for(i=0;i<c;i++)
			{
			for(j=0;j<r;j++)
			{
			  System.out.print(a2[j][i]+" ");
				}
				System.out.println();
				
			}
			break;
			
		case 0:
			System.exit(0);
		
			
			default:
				   System.out.println("Invalid input.");
			        System.out.println("Please enter the correct input.");
		}

	}

	

}
