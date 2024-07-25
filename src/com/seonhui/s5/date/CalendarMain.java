package com.seonhui.s5.date;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalendarMain {

	public static void main(String[] args) {
		Calendar ca = new GregorianCalendar();

		// getInstance라는 메서드를 이용해서 객체를 하나 만듦
		// ca에 현재 시간과 날짜가 있음
		ca = Calendar.getInstance(); // 객체를 받아오겠다

		System.out.println(ca);
		System.out.println(ca.get(Calendar.YEAR));
		System.out.println(ca.get(Calendar.MONTH) + 1);
		System.out.println(ca.get(Calendar.DATE));
		System.out.println(ca.get(Calendar.HOUR_OF_DAY));
		System.out.println(ca.get(Calendar.MINUTE));

		Date date = ca.getTime();
		System.out.println(date);

		Calendar future = Calendar.getInstance();
		future.set(Calendar.DATE, future.get(Calendar.DATE) + 17);

		System.out.println(future.getTime());

		Single single = Single.get();

	}

}
