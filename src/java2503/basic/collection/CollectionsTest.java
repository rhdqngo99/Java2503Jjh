package java2503.basic.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.List;

public class CollectionsTest {
	
	public static void main(String[] args) {
		
		// Collections의 static 상수들
		System.out.println(Collections.EMPTY_LIST);
		System.out.println(Collections.EMPTY_SET);
		System.out.println(Collections.EMPTY_MAP);
		
		System.out.println(Collections.emptyList());
		System.out.println(Collections.emptySet());
		System.out.println(Collections.emptyMap());
		System.out.println(Collections.emptyIterator());
		
		List<String> nameList = new ArrayList<String>();
		nameList.add("홍길동");
		nameList.add("강감찬");
		nameList.add("이순신");
		System.out.println(nameList);
		
		// 컬렉션에 요소 추가
		// addAll은 첫번째 파라미터로 Collection,
		// 두번째 파라미터로 추가할 요소들을 가변인자(varargs)로 전달받음 
		Collections.addAll(nameList, "장보고");
		Collections.addAll(nameList, "권율", "최영", "김시민");
		System.out.println(nameList);
		
		// 컬렉션 복사
		// 비어있는 컬렉션에 복사하면 IndexOutOfBoundsException 발생
		// Collections.nCopies(nameList.size(), null) : nameList의 요소수만큼 null을
		// 넣은 리스트
		List<String> copyList
			= new ArrayList<String>(Collections.nCopies(nameList.size(), null));
		Collections.copy(copyList, nameList);
		System.out.println(copyList);
		
		// 컬렉션 열거자
		// Iterator 나오기 전에 반복대상을 반복하기 위해 사용했음
		// 현재는 예전버젼 호환성 때문에 남겨둔 것
		Enumeration<String> en = Collections.enumeration(nameList);
		while (en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
		
		// 컬렉션 채우기
		List<String> copyList2
			= new ArrayList<String>(Collections.nCopies(nameList.size(), null));
		Collections.fill(copyList2, "김유신");
		System.out.println(copyList2);
		
		// 컬렉션 요소 대체
		Collections.replaceAll(copyList2, "김유신", "최영");
		System.out.println(copyList2);
		
		// 컬렉션 요소 순서 180도 뒤집음
		Collections.reverse(nameList);
		System.out.println(nameList);
		
		// 컬렉션 요소 순서 랜덤하게 섞음
		Collections.shuffle(nameList);
		System.out.println(nameList);
		
		// 컬렉션 요소 정렬
		List<Integer> intList = new ArrayList<Integer>();
		Collections.addAll(intList, 5, 10, 1, 6, 9);
		
		// 정렬
		// return이 양수를 반환하면 오름차순 정렬
		// return이 0을 반환하면 정렬 안함
		// return이 음수를 반환하면 내림차순 정렬
		Collections.sort(intList, new Comparator<Integer>() {
			public int compare(Integer i1, Integer i2) {
				return i1 - i2; // 오름차순 정렬
			}
		});
		System.out.println(intList);
		
		// 내림차순 정렬
		Collections.reverse(intList);
		System.out.println(intList);
		
	} // main

} // class























