package java2503.basic;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ArraysTast {

	public static void main(String[] args) {
		
		Integer[] intArr1 = {10, 5, 9, 3, 1};
		
		// 배열을 리스트로 변환
		List<Integer> inList = Arrays.asList(intArr1);
		System.out.println(inList);
		
		Integer[] intArr2 = {1, 10, 5, 9, 3, 2, 7};
		for (Integer i : intArr2) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		// 배열 정렬 (오름차순 :Ascending sorting)
		Arrays.sort(intArr2, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1 - o2;
			}
		});
		for (Integer i : intArr2) {
		System.out.print(i + " ");
		}
		
		System.out.println();
		
		// 배열 정렬 (내림차순 :descending sorting)
		Arrays.sort(intArr2, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2 - o1;
			}
		});
		for (Integer i : intArr2) {
		System.out.print(i + " ");
		}
		
		System.out.println();
		
		// 배열의 요소 비교 (앞이 크면 양수, 같으면 0, 뒤가 크면 음수)
		for (Integer i : intArr1) { System.out.print(i + " "); }
		System.out.println(Arrays.compare(intArr1, intArr2));
		for (Integer i : intArr2) { System.out.print(i + " "); }
		System.out.println();
		System.out.println(Arrays.compare(intArr1, intArr2));
		
		// 배열 카피 (개수만큼)
		Integer[] intArr3 = Arrays.copyOf(intArr2, 3);
		for (Integer i : intArr3) { System.out.print(i + " "); }
		System.out.println();
		
		// 배열 카피 (범위만큼)
		Integer[] intArr4 = Arrays.copyOfRange(intArr2, 1, 4);
		for (Integer i : intArr4) { System.out.print(i + " "); }
		System.out.println();
		
		// 배열 채우기
		Integer[] intArr5 = new Integer[5];
		Arrays.fill(intArr5, 3);
		for (Integer i : intArr5) { System.out.print(i + " "); }
		
	} // main

} // class















