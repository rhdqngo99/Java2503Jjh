package java2503.basic;

// 별찍기 7단계
public class ExLoopStatement2 {
	
	public static void main(String[] args) {
		
		// 1
		for (int i=0; i<5; i++) { // 줄의 수
			for (int j=0; j<i+1; j++) { // 별의 수
				System.out.print("*");
			}
			System.out.println();
		}
		
		// 3
		for (int i=0; i<5; i++) { // 줄의 수
			for (int k=0; k<i; k++) System.out.print("X");
			for (int j=0; j<5-i; j++) { // 별의 수
				System.out.print("O");
			}
			System.out.println();
		}		
		
	} // main

} // class















