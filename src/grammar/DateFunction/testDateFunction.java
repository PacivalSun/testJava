package grammar.DateFunction;

import java.time.LocalDateTime;

public class testDateFunction {
	public static void main(String[] args) {
		LocalDateTime rightNow = LocalDateTime.now();
		System.out.println("现在是今年的第:"+rightNow.getDayOfYear()+"天");
		System.out.println("now : " + rightNow.getYear() + ", is leap year ? " + rightNow.toLocalDate().isLeapYear());
	}
	
}
