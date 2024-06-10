package com.seonhui.s3.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionMain1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			int num = 10;
			System.out.println("숫자 입력: ");
			int num2 = sc.nextInt();
			System.out.println(num / num2);
			// throw new ArithmeticException();
		} catch (ArithmeticException e) {
			System.out.println("cannot / by zero");
		} catch (InputMismatchException e) {
			System.out.println("make sure to input int");
		} catch (Exception e) {
			System.out.println("wow~");
		} catch (Throwable e) {
			System.out.println("WOW~");
		}

		Exception1 ex1 = new Exception1();
		try {
			ex1.ex1(0);
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println(e.getMessage());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("프로그램이 종료");

	}

}
