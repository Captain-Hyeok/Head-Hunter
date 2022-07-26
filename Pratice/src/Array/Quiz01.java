package Array;

public class Quiz01 {

	public static void main(String[] args) {
		
		int[] numbers = {3, 8, 9, 4, 2, 1, 7, 5};
//		1.배열의 4번째 값을 6으로 바꾸세요.
//		 numbers[3] = 6;
//		 System.out.println(numbers[3]);
		
//		2.배열의 값을 순서대로 출력하세요.
//		 for(int i = 0; i < 8; i++) {
//			 System.out.print(numbers[i] + " ");
			 
//		3.배열의 짝수번째 위치에 있는 값들을 출력하세요.
//		for(int i = 0; i < 8; i++) {
//			if(i % 2 != 0) {
//				System.out.print(numbers[i] + " ");
//			}
//		}
//		 4.배열의 값 중 2가 들어 있는 index를 출력하세요. 반복문을 돌면서 2가 있는 값을 찾으세요.
			for(int i = 0; i < 8; i++) {
				if(numbers[i] == 2) {
					System.out.println("2가 들어있는 index는 " + i);
				}
			}
		
		 }
	
	}


