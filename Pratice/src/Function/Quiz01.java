package Function;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
//		정수를 입력 받아서 2제곱의 결과를 돌려주는 함수를 만들고 호출한 값을 출력하세요.
//		hint ) 함수 원형 - public static int getSquared(int x)
		
		Scanner scan = new Scanner(System.in);
		System.out.println("제곱을 구할 숫자를 입력하세요.");
		int num = scan.nextInt();
		System.out.println(num + "의 제곱은" + getSquared(num));
		scan.close();
	}

	private static int getSquared(int num) {
		return num*num;
	}

}
