package sample06;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateSample01 {

	public static void main(String[] args) {

		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime);

		LocalDateTime oneMonthBeforeDate = dateTime.minusMonths(1);

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("YYYY/MM/dd HH:mm:ss");
		String str = oneMonthBeforeDate.format(formatter);
		System.out.println(str);

		LocalDateTime oneDayBeforeDate = dateTime.plusDays(1);

		DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		String str2 = oneDayBeforeDate.format(formatter2);
		System.out.println(str2);
	}

}
