package com.seonhui.s5.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.UUID;

public class CalendarMain2 {

	public static void main(String[] args) {
		Calendar ca = Calendar.getInstance();

		Calendar birth = Calendar.getInstance();
		birth.set(1997, 8, 25);
		System.out.println(birth.getTime());
		Long c = ca.getTimeInMillis();
		System.out.println(c);
		long myBirth = birth.getTimeInMillis();
		myBirth = myBirth + 1000 * 60 * 60 * 24 * 100L;
		birth.setTimeInMillis(myBirth);

		// 1000*60 -> 1분
		// 1000*60*60 -> 1시간
		// 1000*60*60*24 -> 하루

		System.out.println(birth.getTime());
		String n = "1997-09-25";
		String[] a = n.split("-");
		ca.set(Integer.parseInt(a[0]), Integer.parseInt(a[1]) - 1, Integer.parseInt(a[2]));
		System.out.println(ca.getTime());

		ca = Calendar.getInstance();
		SimpleDateFormat sd = new SimpleDateFormat("yyyy년MM월dd일 HH:mm");
		String s = sd.format(ca.getTime());
		System.out.println(s);

		String id = UUID.randomUUID().toString();
		System.out.println(id);
	}

}
