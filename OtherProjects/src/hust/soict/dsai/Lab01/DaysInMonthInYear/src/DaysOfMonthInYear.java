import java.util.Scanner;
public class DaysOfMonthInYear {
	static boolean isLeap(int year) {
		if (year % 4 != 0) {
			return false;
		} else if (year % 100 != 0) {
			return true;
		} else if (year % 400 == 0) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] posMonthInput = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec", "Jan.", "Feb.", "Mar.", "Apr.", "June", "July", "Aug.", "Sept.", "Oct.", "Nov.", "Dec.", "January", "February", "March", "April", "August", "September", "October", "November", "December"};
		System.out.println("Enter month: ");
		boolean Valid = false;
		String month = "";
		while (true) {
			month = sc.nextLine();
			for (String c : posMonthInput) {
				if (month.equals(c)) {
					Valid = true;
					break;
				}
			}
			if (Valid) {
//				String month = monthStr;
				break;
			}
			System.out.println("Invalid month, please try again: ");
		}
		int out = 0;
		Valid = false;
		System.out.println("Enter year: ");
		int year = 0;
		while(true) {
			String strYear = sc.nextLine();
			try {
				if(Integer.parseInt(strYear) > 0){
					year = Integer.parseInt(strYear);
					break;
				} else {
						System.out.println("Year must be a non-negative number, please try again: ");
					}
				}
			catch(Exception e){
				System.out.println("Invalid year, please try again: ");
			}
		}
		
		if ((month.equals("1")) || (month.equals("3")) || (month.equals("5")) || (month.equals("7")) || (month.equals("8")) || (month.equals("10")) || (month.equals("12"))) { 
			out = 31;
		} else if ((month.equals("Jan")) || (month.equals("Mar")) || (month.equals("May")) || (month.equals("Jul")) || (month.equals("Aug")) || (month.equals("Oct")) || (month.equals("Dec"))) {
			out = 31;
		} else if ((month.equals("Jan.")) || (month.equals("Mar.")) || (month.equals("May")) || (month.equals("July")) || (month.equals("Aug.")) || (month.equals("Oct.")) || (month.equals("Dec."))) {
//			System.out.println(31);
			out = 31;
		} else if ((month.equals("January")) || (month.equals("March")) || (month.equals("May")) || (month.equals("July")) || (month.equals("August")) || (month.equals("October")) || (month.equals("December"))) {
//			System.out.println(31);
			out = 31;
		}
		if ((month.equals("4")) || (month.equals("6")) || (month.equals("9")) || (month.equals("11"))) { 
//			System.out.println(30);
			out = 30;
		} else if ((month.equals("Apr")) || (month.equals("Jun")) || (month.equals("Sep")) || (month.equals("Nov"))) {
//			System.out.println(30);
			out = 30;
		} else if ((month.equals("Apr.")) || (month.equals("June")) || (month.equals("Sept.")) || (month.equals("Nov."))) {
//			System.out.println(30);
			out = 30;
		} else if ((month.equals("April")) || (month.equals("June")) || (month.equals("September")) || (month.equals("November"))) {
//			System.out.println(30);
			out = 30;
		}
		if ((month.equals("2")) || (month.equals("Feb")) || (month.equals("Feb.")) || (month.equals("February"))) {
			if (isLeap(year)) {
//				System.out.println(29);
				out = 29;
			} else {
//				System.out.println(28);
				out = 28;
			}
		}
		System.out.println(out);
	}
}
