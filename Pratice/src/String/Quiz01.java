package String;

public class Quiz01 {

	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		String str = scan.nextLine();
//		System.out.println(str);
//		
//		scan.close();
		
//		1. 특정 문자 변경
//		String gradeStr = "My grade is A";
//		gradeStr = gradeStr.replace('A', 'B');
//		System.out.println(gradeStr);
		
//		2. 문자열 정수 변환
//		String birth = "19950721";
//		birth = birth.substring(0, 4);
//		int year = Integer.parseInt(birth);
//		int age = 2022 - year;
//		System.out.println(age+1 + "세");
		
//		3. 문자열 입력
//		Scanner scan = new Scanner(System.in);
//		String name = scan.nextLine();
//		System.out.println("Welcome!" + name );
//		scan.close();
		
//		4. 문자열 검색(1)
//		Scanner scan = new Scanner(System.in);
//		System.out.print("단어를 입력하세요:");
//		String sentence = scan.nextLine();
//		int count = 0;
//		for (int i = 0; i < sentence.length(); i++) {
//			if(sentence.charAt(i) == 'e') {
//				count += 1;
//			}
//		}
//		System.out.println("e의 개수는 " + count + "개");
//		scan.close();
		
//		5. 문자열 검색(2)
		int count =0;
		String[] files = {"cat.jpg", "dog.png", "kakao,exe", "tree,jpg", "eclipce,exe", "tmp,txt", "phone,jpg"};
		for (int i = 0; i < files.length; i++) {
//			String[] type = files[i].split(".");
			//System.out.println(files[i].split("."));
			//if (type[1].equals("jpg")) {
			if(files[i].contains("jpg")) {
			count++;
			}
		}System.out.println("jpg파일의 개수: " +count);
		
		
		
	}

}
