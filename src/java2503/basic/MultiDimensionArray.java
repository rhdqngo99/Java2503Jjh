package java2503.basic;

public class MultiDimensionArray {

	public static void main(String[] args) {
		
		// 2차원배열 선언, 초기화
		int[][] intArr = new int[3][3]; // 3행 3열, 2차원 int배열, length는 3, 인덱스 범위는 0~2
		
		// 2차원배열 값 할당
		intArr[0][0] = 1;
		intArr[0][1] = 2;
		intArr[0][2] = 3;
		intArr[1][0] = 4;
		intArr[1][1] = 5;
		intArr[1][2] = 6;
		intArr[2][0] = 7;
		intArr[2][1] = 8;
		intArr[2][2] = 9;
		
		// for문을 활용한 2차원배열 값 할당
		int intArrLength = intArr.length; // 3
		int intArr0Length = intArr[0].length; // 3
		for (int i=0; i<intArrLength; i++) {
			for(int j=0; j<intArr0Length; j++) {
				intArr[i][j] = (i*intArr0Length) + (j + 1);
				System.out.println(intArr[i][j]);
			}
		}
		
		// enhanced for를 활용한 2차원배열 값 출력
		for(int[] iArr : intArr) { // 2차원배열의 1차원배열 수 만큼 반복
			for(int i : iArr){ // 1차원배열의 요소 수 만큼 반복
				System.out.println(i);
			}
		}
		
		// 2차원 문자열 배열
		String[][] strArr = {
				{"홍길동","강감찬","이순신"},
				{"서울","부산","제주"},
				{"학생","직장인","가수"}
		};
		
		// 출력
		for(String[] sArr : strArr) {
			for (String str : sArr) {
				System.out.println(str);
			}
		}
		
		// 학생 성적표 2차원 배열
		String[][] scoreArr = {
				{"홍길동","강감찬","이순신"},  // 00 01 02
				{"100","90","80"}, 		  // 10 11 12
				{"90","80","70"}          // 20 21 22
		};
		
		// 실습 : 홍길동, 강감찬, 이순신의 성적 합계를 아래와 같이 출력
		// 홍길동 190점, 강감찬 170점, 이순신 150점
		// int kor = Integer.parseInt("100"); // 문자열을 int로 변환
		int scoreArrLength = scoreArr.length;
		int scoreArr0Length = scoreArr[0].length;
		for(int i=0; i<scoreArrLength; i++) {
			int sum = 0;
			for(int j=0; j<scoreArr0Length; j++) {
			    if(j!=0) sum += Integer.parseInt(scoreArr[j][i]);
			}
			System.out.print(scoreArr[0][i] + " " + "점");
		}
		
	   
		

	} // main

} //class
