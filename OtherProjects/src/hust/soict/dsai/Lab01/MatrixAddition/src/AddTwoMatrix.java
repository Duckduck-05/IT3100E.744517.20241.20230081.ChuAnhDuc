import java.util.Scanner;
public class AddTwoMatrix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of matrix (m x n in a line seperated by space character): ");
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[][] mat1 = new int[m][n];
		System.out.println("Input for the first matrix");
		for (int i = 0; i<m; i++) {
			System.out.println("Input for the row number " + (i+1));
			for (int j = 0; j < n; j++) {
				mat1[i][j] = sc.nextInt();
			}
		}
		int[][] mat2 = new int[m][n];
		System.out.println("Input for the second matrix");
		for (int i = 0; i<m; i++) {
			System.out.println("Input for the row number " + (i+1));
			for (int j = 0; j < n; j++) {
				mat2[i][j] = sc.nextInt();
			}
		}
		int[][] matsum = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				matsum[i][j] = mat1[i][j] + mat2[i][j];
			}
		}
		System.out.println("The sum matrix is: ");
		for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(matsum[i][j] + " ");

            System.out.println();
        }
	}
}
