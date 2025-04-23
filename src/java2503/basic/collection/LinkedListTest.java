package java2503.basic.collection;

import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {

	public static void main(String[] args) {
		
		// LinkedList생성
		List<Integer> intList = new LinkedList<Integer>();
		
		// 요소추가
		intList.add(1);
		intList.add(2);
		intList.add(3);
		System.out.println(intList);
		((LinkedList)intList).addFirst(0);
		((LinkedList)intList).addLast(4);
		System.out.println(intList);
		
		// 첫번째 요소 가져오기 (꺼내지는 않고)
		System.out.println( ((LinkedList)intList).peek() );
		System.out.println(intList);
		
		// 첫번째 요소 가져오기 (꺼냄)
		System.out.println( ((LinkedList)intList).pop() );
		System.out.println(intList);
		
		// 첫번째 요소 추가
		((LinkedList)intList).push(5);
		System.out.println(intList);
		
		// 요소 제거
		intList.remove(1);
		System.out.println(intList);
		((LinkedList)intList).removeFirst();
		System.out.println(intList);
		((LinkedList)intList).removeLast();
		System.out.println(intList);
		
	} // main

} // class