package nested_Loop;

public class Quiz01 {

	public static void main(String[] args) {
//		두 개의 주사위를 굴렸을 때, 나올 수 있는 모든 경우의 수를 출력하세요.
		for(int i = 1; i <= 6; i++) {
			for(int j = 1; j <= 6; j++) {
				System.out.println("(" + i + "," + j + ")");
			}
		}
		
	}

}
