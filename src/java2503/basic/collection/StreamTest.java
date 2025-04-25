package java2503.basic.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

// Stream ApI :   Java8부터 도입된 컬렉션에 대해 함수형 처리를 가능하도록 하는 API

public class StreamTest {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("홍", "김철수", "이", "박지민", "최수정");
		List<String> result = 
				names.stream() // 리스트를 스트림으로 변환
				.filter(name -> name.length()>=3) // 길이가 3이상인 요소들을 필터링
				.map(String::toUpperCase) // 대문자로 변환
				// .map(name -> name.toUpperCase()) // 대문자로 변환
				.sorted() // 오름차순 정렬
				.collect(Collectors.toList()); // 스트림을 리스트로 변환
		System.out.println(result);
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
		List<Integer> squaredEvens =
				numbers.stream()
				.filter(n -> n%2==0) // 2로 나눈 나머지가 0인 것들(즉, 짝수들)만 필터링
				.map(n -> n*n) // 각각에 대해 제곱
				.sorted() // 오름차순 정렬
				.collect(Collectors.toList()); // 스트림을 리스트로 변환
		System.out.println(squaredEvens);
		
		List<String> names2 = Arrays.asList("김영희", "김철수", "이영희", "박영수");
		long count = 
				names2.stream()
				.filter(name -> name.startsWith("김")) // "김"으로 시작하는 요소 필터링
				.count(); // 개수
		System.out.println("김으로 시작하는 요소 수 : " + count);
	
		class Person {
			String name;
			int age;
			public Person(String name, int age) {
				this.name = name;
				this.age = age;
			}
		}
		
		List<Person> personList = Arrays.asList(
				new Person("김철수", 25),
				new Person("이영희", 29),
				new Person("박지민", 19)
		);
		
		// 20세 이상인 사람의 이름만 추출
		List<String> resultNames = 
				personList.stream()
				.filter(person -> person.age>=20) // 20세 이상
				.map(person -> person.name) // 이름 추출
				.collect(Collectors.toList());
		System.out.println(resultNames);
		
		// filter : 조건에 맞는 요소만 선택
		// map : 요소 각각에 대해 연산을 하고 결과를 리턴
		// forEach : 요소 각각에 대해 연산을 하고 끝
		List<String> names3 = Arrays.asList("최영", "홍길동", "권율", "이순신", "장보고");
		//names3.forEach(name -> System.out.println(name));
		// 람다식을 짧게 표현한 메서드 레퍼런스 (method reference)
		names3.forEach(System.out::println);
		
		// 병렬 스트림 (Parallel Stream)
		List<Long> numbers2 = 
				LongStream // 정수 스트림
				.rangeClosed(1, 1_000_000_0) // 1부터 1000만까지 범위에 포함
				.boxed() // long -> Long
				.collect(Collectors.toList()); // 스트림을 리스트로
		long start = System.currentTimeMillis(); // 시작시간 밀리초
		long sum = 
				numbers2 // 리스트
				//.stream()
				.parallelStream() // 병렬 스트림
				.reduce(0L, Long::sum); // 초기값 0부터 누적
		long end = System.currentTimeMillis(); // 종료시간 밀리초
		System.out.println("합계 : " + sum);
		System.out.println("소요시간(ms) : " + (end-start));
		
	} // main

} // class
