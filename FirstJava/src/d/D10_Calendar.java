package d;
import java.util.Calendar;

public class D10_Calendar {

	// Calendar 클래스
	// 날짜 및 시간을 쉽게 다룰 수 있는 클래스
	
	public static void main(String[] args) {
		// Calendar는 생성자를 사용할 수 없고, getInstance() 메서드를 이용하여 인스턴스를
		// 생성한다. 
		// 인스턴스 생성한 시점의 시간 정보를 생성.
		Calendar cal = Calendar.getInstance();
		
		System.out.println(cal);
		
		// Calendar의 get() 메서드와 Calendar 상수를 이용해 원하는 정보를 가져올 수 있음.
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int date = cal.get(Calendar.DATE);
		int hour = cal.get(Calendar.HOUR);
		int hod = cal.get(Calendar.HOUR_OF_DAY);
		int min = cal.get(Calendar.MINUTE);
		int sec = cal.get(Calendar.SECOND);
		int millisec = cal.get(Calendar.MILLISECOND);

		System.out.printf("%d년 %d월 %d일 - %02d:%d:%d.%d\n",
				year,month,date, hour,min, sec, millisec);
		System.out.printf("%d년 %d월 %d일 - %d:%d:%d.%d\n",
				year,month,date, hour,min, sec, millisec);
		
		printDayOfSeries(cal);
		
		// 원하는 필드 변경하기... (.set())
		cal.set(Calendar.DATE, 5);
		printDayOfSeries(cal);
		
		cal.set(Calendar.DATE, 9);
		printDayOfSeries(cal);
		
		// 원하는 필드 더하기 .add()
		cal.add(Calendar.DATE, 8);
		printDayOfSeries(cal);
		
		cal.add(Calendar.DATE, -20);
		printDayOfSeries(cal);
	}
	
	static void printDayOfSeries(Calendar cal) {
		// dayOfYear : 해당 년도의 날짜
		int dayOfYear = cal.get(Calendar.DAY_OF_YEAR);
		
		// dayOfMonth : 달의 날짜
		int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);
		
		// dayOfWeek : 요일(1: 일요일 ~ 7: 토요일 )
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		
		System.out.println(Calendar.MONDAY);
		System.out.println(Calendar.TUESDAY);
		System.out.println(Calendar.WEDNESDAY);
		System.out.println(Calendar.THURSDAY);
		System.out.println(Calendar.FRIDAY);
		System.out.println(Calendar.SATURDAY);
		System.out.println(Calendar.SUNDAY);
		
		// 그달에 해당 요일이 몇번째 요일인지 체크....
		int dayOfWeekInMonth = cal.get(Calendar.DAY_OF_WEEK_IN_MONTH);
		System.out.println("----------------------------------");
		System.out.printf("dayOfYear : %d\n"
				+ "dayOfMonth : %d\n"
				+ "dayOfWeek : %d\n"
				+ "dayOfWeekInMonth : %d",
				dayOfYear,dayOfMonth,dayOfWeek, dayOfWeekInMonth);
		
		
	}
	

}

