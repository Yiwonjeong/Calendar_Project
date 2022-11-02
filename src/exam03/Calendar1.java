package exam03;

import java.util.Scanner;

public class Calendar1 {
	public static void main(String[] args) {
		
		// 숫자를 입력받아 해당하는 달의 최대 일수를 출력하는 프로그램1
		
		Scanner sc = new Scanner(System.in);
		System.out.println("달을 입력하세요.");
		
		int month;
		month = sc.nextInt();
		
		switch(month) {
			case 2:{
				System.out.println(month + "월은 28일까지 있습니다.");
				break;
			}
			case 4: case 6: case 9: case 11:{
				System.out.println(month + "월은 30일까지 있습니다.");
				break;
			}
			default:{
				System.out.println(month + "월은 31일까지 있습니다.");
				break;
			}
		}
		
	}
}
