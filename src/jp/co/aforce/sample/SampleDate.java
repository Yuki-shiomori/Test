package jp.co.aforce.sample;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class SampleDate {
	public static void main(String[] ags) {
		Calendar calendar = Calendar.getInstance();
		
//		Date today = calendar.getTime();
//		System.out.println(today);
//		calendar.clear();
//		calendar.set(2000, 11, 16);
//		Date birthday = calendar.getTime();
//		System.out.println(birthday);
		
		
//		calendar.set(1996,3,16,11,33,50);
//		int hourOfDay =calendar.get(Calendar.HOUR_OF_DAY);
//		System.out.println(hourOfDay);
//		int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
//		System.out.println(dayOfWeek);
//		System.out.println(calendar.get(Calendar.YEAR));
		
//		calendar.set(1984,11,26,11,33,50 );
//		System.out.println(calendar.getTime());
//		calendar.set(Calendar.SECOND,00);
//		System.out.println(calendar.getTime());
		
//		System.out.println(calendar.getTime());
//		calendar.add(Calendar.DAY_OF_MONTH, 3);
//		System.out.println(calendar.getTime());
//		calendar.add(Calendar.MONTH,-6);
//		System.out.println(calendar.getTime());
		
//		System.out.println(calendar.getTime());
//		System.out.println("日本の時間は" + calendar.get(Calendar.HOUR_OF_DAY) + "時です。");
//		calendar.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));
//		System.out.println(calendar.getTime());
//		System.out.println("ロサンゼルスの時間は" + calendar.get(Calendar.HOUR_OF_DAY) + "時です。");
		
//		SimpleDateFormat format =new SimpleDateFormat("yyyy/MM/dd(EEEE) HH:mm:ss",new Locale("en","US"));
//		String formattedDate = format.format(calendar.getTime());
//		System.out.println(formattedDate);
		
//		calendar.clear();
//		calendar.set(2020,0,2,10,20,30);
//		Date date = calendar.getTime();		
//		System.out.println(date);
//		System.out.println( calendar.get(Calendar.YEAR));
//		calendar.add(Calendar.HOUR_OF_DAY,-5);
//		System.out.println(calendar.getTime());
		
		calendar.clear();
		calendar.set(2000,11,16,8,11);
		SimpleDateFormat format=new SimpleDateFormat("yyyy/MM/dd(EEEE) HH:mm:ss");
		String formatDate = format.format(calendar.getTime());
		System.out.println(formatDate);
		
		
		
		}
}
