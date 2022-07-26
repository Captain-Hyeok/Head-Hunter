package nested_Loop;

public class Quiz02 {

	public static void main(String[] args) {
//		구구단을 2단에서 부터 9단 까지 모두 출력하세요.
		for(int i = 1; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				System.out.println(i + "x" + j + "=" + i*j);
			}
		}
	}

}
