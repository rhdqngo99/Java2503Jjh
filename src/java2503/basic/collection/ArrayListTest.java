package java2503.basic.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		
		// String을 저장하기 위한 List 생성
		List<String> fruitList = new ArrayList<String>();
		
		// List에 요소 추가
		// fruitLis의 size는 3, index범위는 0~2
		fruitList.add("사과");
		fruitList.add("딸기");
		fruitList.add("포도");
		
		List<String> subList = new ArrayList<String>();
		subList.add("복숭아");
		subList.add("참외");
		
		// List에 List추가
		fruitList.addAll(subList);
		System.out.println(fruitList);
		
		// 요소 모두 제거
		// empty list : 요소가 없는 리스트
		subList.clear();
		System.out.println(subList);
		
		// 요소 포함여부 반환
		System.out.println(fruitList.contains("포도"));
		
		// index를 통해 요소 획득
		System.out.println(fruitList.get(0));
		
		// 요소의 인덱스를 반환
		System.out.println(fruitList.indexOf("딸기"));
		System.out.println(fruitList.indexOf("키위")); // 없으면 -1
		
		// 요소가 없는지 확인
		System.out.println(fruitList.isEmpty());
		
		// 요소가 위치한 마지막 인덱스
		fruitList.add("포도");
		System.out.println(fruitList);
		System.out.println(fruitList.lastIndexOf("포도"));
		
		// 요소를 하나 제거
		fruitList.remove("딸기");
		System.out.println(fruitList);
		fruitList.remove(2);
		System.out.println(fruitList);
		
		// 요소 모두 제거
		subList.add("사과");
		subList.add("포도");
		fruitList.removeAll(subList);
		System.out.println(fruitList);
		
		// 요소 변경
		fruitList.set(0, "자몽");
		System.out.println(fruitList);
		
		// 요소 개수
		fruitList.add("파인애플");
		System.out.println(fruitList.size());
		
		// Object[]로 반환
		Object[] objArr = fruitList.toArray();
		for (Object obj : objArr) {
			System.out.println(obj);
		}
		
	} // main

} // class
