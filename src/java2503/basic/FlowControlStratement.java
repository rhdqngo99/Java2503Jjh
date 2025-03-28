package java2503.basic;

import java.util.Scanner;

public class FlowControlStratement {
	
	public static void main(String[] args) {
		
		// 조건문 if
		int i1 = 5;
		if (i1>5) {
			System.out.println("i1은 5보다 큽니다!");
		} else {
			System.out.println("i1은 5보다 크지 않습니다!");
		}
		
		i1 = 35;
		if (i1<10) { // 10 보다 작다면
			System.out.println("i1은 10보다 작습니다!");
		} else if (i1<20) { // 10보다 작진 않지만 20보다 작다면
			System.out.println("i1은 20보다 작습니다!");
		} else if (i1<30) { // 20보다 작진 않지만 30보다 작다면
			System.out.println("i1은 30보다 작습니다!");
		} else  { // 30보다 작지 않음
			System.out.println("i1은 30보다 작지 않습니다!");
		}
		
		// 조건문 switch
		int yoil = 3;
		switch (yoil) {
			case 0: System.out.println("일"); break;
			case 1: System.out.println("월"); break;
			case 2: System.out.println("화"); break;
			case 3: System.out.println("수"); break;
			case 4: System.out.println("목"); break;
			case 5: System.out.println("금"); break;
			case 6: System.out.println("토"); break;
			default: System.out.println("잘못된 입력입니다!");
		}
		
		// 위 switch구문을 if문으로 변경
		if (yoil==0) System.out.println("일");
		else if (yoil==1) System.out.println("월");
		else if (yoil==2) System.out.println("화");
		else if (yoil==3) System.out.println("수");
		else if (yoil==4) System.out.println("목");
		else if (yoil==5) System.out.println("금");
		else if (yoil==6) System.out.println("토");
		else System.out.println("잘못된 입력입니다!");
		
		// if문은 값의 범위로 수행할 구문을 선택할때 사용
		// switch문은 값이 몇가지 중 하나로 정해졌을때 사용
		
		// 반복문 for
		// i는 0부터 10보다 작은동안 1씩 증가하면서 반복 => 0~9까지 반복
		// 실행순서
		// 1. int i=0; (for문 내내 최초 1번만 수행)
		// 2. i<10 판별 => true이면 for블락 수행
		// 3. i++ 해서 i가 1 증가
		// 4. i<10 판별 => true이면 for블락 수행
		// 5. 3~4를 판별식이 false일때까지 반복
		for (int i=0; i<10; i++) {
			System.out.println(i);
		}
		
		// for문을 이용해서 1~100까지 출력
		for (int i=1; i<101; i++) {
			System.out.println(i);
		}
		
		// 실습 : for문을 이용해서 1~100 중에서 홀수만 출력
		// 솔루션 1) 50번 반복
		for(int i=1; i<101; i=i+2) {
			System.out.println(i);
		}
		// 솔루션 2) 100번 반복
		for(int i=1; i<101; i++) {
			if (i%2==1) System.out.println(i);
		}
		
		// 반복문 while
		int i2 = 1;
		while (i2<10) {
			System.out.println(i2);
			i2++;
		}
		
		// 반복문 do ~ while
		// do블럭을 한번은 수행하고 while의 조건이 true인 동안 반복
		i2 = 0;
		do {
			System.out.println(i2);
			i2++;
		} while (i2<5);
		
		// 실습 : while문을 이용해서 1~100 정수 중에서 짝수만 출력
		int i3 = 2;
		while (i3<101) {
			System.out.println(i3);
			i3 = i3 + 2;
		}
		
		// 실습 : do ~ while문을 이용해서 50부터 100까지 정수 중에 7의 배수만 출력
		int i4 = 56;
		do {
			System.out.println(i4);
			i4 += 7;
		} while (i4<100);
		
		// 옆으로 출력 : System.out.print()
		
		// 구구단 출력
		// 2*1=2 2*2=4 ... 2*9=18
		// ...
		// 9*1=9 9*2=18 ... 9*9=81
		for (int i=2; i<10; i++) { // 앞자리 수
			for (int j=1; j<10; j++) { // 뒷자리 수
				System.out.print(i + "*" + j + "=" + (i*j) + " ");
			}
			System.out.println();
		}
		
		// 원하는 단을 입력하면 해당 단의 구구단을 출력
		// 출력할 단을 입력하세요 : 9
		// 9*1=9 9*2=18 ... 9*9=81
		Scanner scanner = new Scanner(System.in);
		System.out.println("원하는 단을 입력하세요 : ");
		int dan = scanner.nextInt();
		for (int j=1; j<10; j++) {
			System.out.print(dan + "*" + j + "=" + (dan*j) + " ");
		}
		scanner.close();
		
	} // main

} // class











































































