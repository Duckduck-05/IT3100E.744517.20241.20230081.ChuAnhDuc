import java.util.Scanner;
public class Pyramid {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n (number of stars):");
		int n = sc.nextInt();
		for (int i = 0; i < n ; i++) {
			String line = "";
			for (int space = 0; space < (n-i-1); space++) {
				line += " ";
			}
			for (int star = 0; star < ((2*i)+1); star++) {
				line += "*";
			}
			System.out.println(line);
		}
	}
}
