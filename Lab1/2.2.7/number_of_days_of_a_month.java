import java.time.YearMonth;
import java.util.*;

public class number_of_days_of_a_month {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> month1 = Arrays.asList("January", "February", "March","April",	"May", "June", "July", "August", "September", "October", "November", "December");
        List<String> month2 = Arrays.asList("Jan.", "Feb.", "Mar.","Apr.",	"May", "Jun.", "Jul.", "Aug.", "Sep.", "Oct.", "Nov.", "Dec.");
        List<String> month3 = Arrays.asList("Jan", "Feb", "Mar","Apr",	"May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec");
        List<String> month4 = Arrays.asList("1", "2", "3","4",	"5", "6", "7", "8", "9", "10", "11", "12");
        System.out.println("Enter your month:");
        String m = sc.next();
        System.out.println("Enter your year:");
        int y = sc.nextInt();
        int mon = 0;
        if (m.length() == 4) {
            mon = month2.indexOf(m);
        } else if (m.length() == 3) {
            mon = month3.indexOf(m);
        } else if (m.length() <= 2) {
            mon = month4.indexOf(m);
        } else {
            mon = month1.indexOf(m);
        }
        YearMonth ym = YearMonth.of(y, mon);
        System.out.println(ym.lengthOfMonth());

    }
}
