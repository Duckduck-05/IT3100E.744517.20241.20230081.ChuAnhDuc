import java.util.*;
public class triangletree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i =0 ; i < n; i++) {
            System.out.println(" ".repeat(n-1-i) + "*".repeat(2*i+1) + " ".repeat(n-1-i));
        }
    }
}
