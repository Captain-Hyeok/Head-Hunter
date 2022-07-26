package Function;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
//		4개의 값을 받아서 평균을 돌려주는 함수를 만들고 호출한 값을 출력하세요.
//		hint ) 함수 원형 - public static double getAverage(int score1, int score2, int score3, int score4)
	
		Scanner scan = new Scanner(System.in);
		System.out.println("4개의 숫자를 입력하세요.");
		int score1 = scan.nextInt();
		int score2 = scan.nextInt();
		int score3 = scan.nextInt();
		int score4 = scan.nextInt();
		System.out.println(getAverage(score1, score2, score3, score4));
		
		scan.close();
		
	}

	private static double getAverage(int score1, int score2, int score3, int score4) {
		
		return (score1 + score2 + score3 + score4)/4 ;
	}

}
