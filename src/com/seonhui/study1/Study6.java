package com.seonhui.study1;

public class Study6 {
	public static void main(String [] args) {
		int total = 256;
		int avg = total/3;
		//평균이 90점 이상이면 A
		//평균이 80점 이상이면 B
		//평균이 70점 이상이면 C
		//평균이 60점 이상이면 D
		//그 미만이면 F
		//Switch case
		
		
		switch(avg/10) {
		case 10:
			System.out.println("A");
		case 9:
			System.out.println("A");
			int n = 10;
			break;
		
		case 8:
			System.out.println("B");
			
			break;
		
		case 7:
			System.out.println("C");
			break;
		
		case 6:
			System.out.println("D");
			break;
		
		default : 
			System.out.println("F");
		
	
		}
	}
}
