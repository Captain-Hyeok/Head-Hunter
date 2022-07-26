package Demensional_Array;

public class Quiz01 {

	public static void main(String[] args) {
		
		int[][] scores = {
			    {89, 93, 91, 93, 92, 78, 90, 90, 93, 90},
			    {91, 82, 72, 98, 92, 87, 77, 87, 74, 88},
			    {98, 93, 94, 91, 97, 94, 91, 96, 98, 90},
			    {65, 63, 57, 87, 88, 92, 78, 85, 100, 68},
			    {45, 50, 48, 63, 67, 58, 40, 66, 47, 64}
			};
		
//		1. 각 학생의 평균을 각각 구해서 출력하세요.
//		for(int i = 0; i < scores.length; i++) {
//			int sum = 0;
//			for(int j = 0; j < scores[i].length; j++) {
//				sum = sum + scores[i][j];
//			}System.out.println(i+1 + "번째 학생의 평균은" + sum / scores[i].length);
//		}
		
//		2. 각 학생의 최고 점수를 구해서 출력하세요.
//		for(int i = 0; i < scores.length; i++) {
//			int max = 0;
//			for(int j = 0; j < scores[i].length; j++) {
//				if(max < scores[i][j]) {
//					max = scores[i][j];
//				}
//			}
//			System.out.println(i+1 + "번째 학생의 최고 점수는 " + max);
//		}
		
//		3. 4번째 과목의 최고 성적의 학생이 몇 번째 학생인지와 점수를 출력하세요.
//		int num = 0;
//		for (int i = 0; i < scores.length; i++) {
//			for (int j = 0; j < scores[i].length; j++) {
//				if (num < scores[i][3])
//				num = scores[i][3];
//			}
//		}
//		System.out.println("4번째 과목의 최고 성적은" + num);
	
//		4. 시험과목 index 3~7 의 평균이 가장 높은 학생의 index를 구하여 출력하세요.
//		출력:3~7 과목 평균이 가장 높은 학생은 3번째 학생이고, 평균은 93.8입니다. 
		
		double maxAverage = 0;
		int maxIndex = 0;
		
		for (int i = 0; i < scores.length; i++) {
			double max = 0;
			for (int j = 3; j <= 7; j++) {
				max += scores[i][j];
			}
			double Average = max / 5;
			if(maxAverage < Average) {
				maxAverage = Average;
				maxIndex = i;
			}
		}
		System.out.println("3~7 과목 평균이 가장 높은 학생은" + (maxIndex+1) + "평균은" + maxAverage);
		
	}

}
