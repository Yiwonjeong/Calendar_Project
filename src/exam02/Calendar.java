package exam02;

import java.util.Scanner;

public class Calendar {
	public static void main(String[] args) {
		
		// 입력: 키보드로 두 수를 입력 받는다.
		Scanner sc = new Scanner(System.in);
		System.out.println("두 수를 입력하세요. (num1, num2)");
	
	
		// 출력: 화면에 두 수의 합을 출력한다.
		String str = sc.nextLine();
		String [] splitStr = str.split(",");
		int var1 = Integer.parseInt(splitStr[0]);
		int var2 = Integer.parseInt(splitStr[1]);
		int sum = var1 + var2;
		
		System.out.printf("두 수의 합은 %d 입니다.", sum);
		
		sc.close();
	
	}
	
	
}
