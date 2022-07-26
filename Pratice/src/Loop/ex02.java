package Loop;

public class ex02 {

	public static void main(String[] args) {
//		1 ~ 50 사이에 3의 배수만 출력하세요.
		
		for(int i = 1; i <= 50; i++) {
			if(i % 3 == 0) {
				System.out.println(i);
			}
		}
	}

}
