import java.util.Scanner;
public class SortArray {
	static void bubbleSort(int arr[], int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		System.out.println("Enter the elements of array: ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		bubbleSort(arr,n);
		System.out.println("The elements of array after sorted are: ");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
 	}
}
