package exam03;

import java.util.Scanner;


public class Calendar2 {
	
	
	private static final int[] MAX_DAYS =  {31,28,31,30,31,30,31,31,30,31,30,31};
	
	public static int getMaxDaysofMonth(int month) {
		return MAX_DAYS[month-1];
	}
	
	public static void main(String[] args) {
		
		// 숫자를 입력받아 해당하는 달의 최대 일수를 출력하는 프로그램2
		Scanner sc = new Scanner(System.in);
		System.out.println("달을 입력하세요.");
		
		int month = sc.nextInt();
		
		if (month>=1 && month<=12) {
			System.out.printf("%d월은 %d일까지 있습니다. \n", month, getMaxDaysofMonth(month));
			sc.close();
		}else {
			System.out.println("입력 오류: 1~12의 숫자를 입력하세요.");
		}
		
		
		
	}
}
