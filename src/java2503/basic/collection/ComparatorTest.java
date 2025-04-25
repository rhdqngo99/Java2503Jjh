package java2503.basic.collection;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

public class ComparatorTest {

	public static void main(String[] args) {

		// Comparator타입의 객체 생성
		// Comparator는 인터페이스이므로 생성자를 가지거나 객체를 생성하는게 불가능
		// Comparator를 구현하고 compare메소드를 오버라이딩한 익명 클래스의 객체를 생성하는 것
		Comparator<Integer> intCom = new Comparator<Integer>() {
			// compare메소드는 두개의 파라미터를 가지는데
			// 첫번째 파라미터가 두번째 파라미터보다 크면 양의 정수를 반환
			// 두 파라미터가 같으면 0을 반환
			// 첫번째 파라미터가 두번째 파라미터보다 작으면 음의 정수를 반환
			@Override
			public int compare(Integer i1, Integer i2) {
				// return i1 - i2; // 오름차순
				return i2 - i1; // 내림차순
			}
		};

		// 정렬할 리스트 생성
		List<Integer> intList = new ArrayList<Integer>();
		Collections.addAll(intList, 3, 10, 2, 9, 5);

		// 리스트 정렬
		Collections.sort(intList, intCom); // 정렬대상, 정렬방법
		System.out.println(intList);

		// 문자열 정렬에 사용할 비교자
		Comparator<String> strCom = new Comparator<String>() {
			@Override
			public int compare(String str1, String str2) {
				// return str1.length() - str2.length(); // 문자열의 길이로 오름차순 정렬
				return str2.length() - str1.length(); // 내림차순 정렬
			}
		};

		// 정렬할 리스트
		List<String> strList = new ArrayList<String>();
		Collections.addAll(strList, "python", "hi", "hello", "java", "programming", "javascript");

		Collections.sort(strList, strCom);
		System.out.println(strList);

		// 객체 정렬

		// local inner class
		class Person {
			String name;
			int age;

			Person(String name, int age) {
				this.name = name;
				this.age = age;
			}

			@Override
			public String toString() {
				return name + ":" + age;
			}
		}

		List<Person> personList = new ArrayList<Person>();
		Collections.addAll(personList, 
				new Person("홍길동", 90), 
				new Person("강감찬", 10), 
				new Person("이순신", 30),
				new Person("최영", 100), 
				new Person("권율", 40)
		);

		// 나이에 따라 정렬하는 Comparator
		Comparator<Person> personCom = new Comparator<Person>() {
			public int compare(Person p1, Person p2) {
				// return p1.age - p2.age; // 오름차순
				return p2.age - p1.age; // 내림차순
			};
		};
		Collections.sort(personList, personCom);
		System.out.println(personList);

		// 이름에 따라 정렬하는 Comparator
		Comparator<Person> nameCom = new Comparator<Person>() {
			// java.text.Collator를 이용
			Collator collator = Collator.getInstance(Locale.KOREAN);

			public int compare(Person p1, Person p2) {
				// return collator.compare(p1.name, p2.name); // 오름차순
				return collator.compare(p2.name, p1.name); // 내림차순
			};
		};
		Collections.sort(personList, nameCom);
		System.out.println(personList);

		// 1) 아래 리스트를 나이순으로 내림차순 정렬하세요
		List<String> ssnList = new ArrayList<String>();
		ssnList.add("980000-1234567");
		ssnList.add("000000-1234567");
		ssnList.add("050000-1234567");
		ssnList.add("880000-1234567");
		ssnList.add("990000-1234567");
		
		Collections.sort(ssnList, new Comparator<String>() {
			@Override
			public int compare(String str1, String str2) {
				String shortYear1 = str1.substring(0, 2);
				String longYear1 = str1.startsWith("0")? "20"+shortYear1 : "19"+shortYear1;
				String shortYear2 = str2.substring(0, 2);
				String longYear2 = str2.startsWith("0")? "20"+shortYear2 : "19"+shortYear2;
				return Integer.parseInt(longYear1) - Integer.parseInt(shortYear2);
			}
		});
		System.out.println(ssnList);

		
		// 2) 아래 리스트를 각 학생의 성적 총합 순으로 내림차순 정렬하세요.
		class Score {
			int kor;
			int eng;

			Score(int kor, int eng) {
				this.kor = kor;
				this.eng = eng;
			}
		}
		class Student {
			String name;
			Score score;
			int sum;
			Student(String name, Score score) {
				this.name = name;
				this.score = score;
				this.sum = this.score.kor + this.score.eng;
			}
			@Override
			public String toString() {
				return name + ":" + sum;
			}
		}
		List<Student> stdList = new ArrayList<Student>();
		stdList.add(new Student("홍길동", new Score(70, 50)));
		stdList.add(new Student("강감찬", new Score(100, 100)));
		stdList.add(new Student("이순신", new Score(90, 70)));
		stdList.add(new Student("장보고", new Score(40, 90)));
		stdList.add(new Student("최영", new Score(80, 60)));
		
		Collections.sort(stdList, new Comparator<Student>() {
			public int compare(Student std1, Student std2) {
				return std2.sum - std1.sum;
			}
		});
		System.out.println(stdList);
		

		// 3) 아래 리스트를 이름순으로 1차 오름차순 정렬하고 가격순으로 2차 내림정렬
		/*
		 * 결과 마우스 200 마우스 100 모니터 200 모니터 100 ...
		 */
		class Product {
			String name;
			int price;

			Product(String name, int price) {
				this.name = name;
				this.price = price;
			}

			@Override
			public String toString() {
				return name + ":" + price;
			}
		}
		List<Product> prodList = new ArrayList<Product>();
		prodList.add(new Product("피씨", 100));
		prodList.add(new Product("모니터", 100));
		prodList.add(new Product("마우스", 100));
		prodList.add(new Product("키보드", 100));
		prodList.add(new Product("스피커", 100));
		prodList.add(new Product("피씨", 200));
		prodList.add(new Product("모니터", 200));
		prodList.add(new Product("마우스", 200));
		prodList.add(new Product("키보드", 200));
		prodList.add(new Product("스피커", 200));
		
		// 1차 이름 오름 차순
		Collections.sort(prodList, new Comparator<Product>() {
			public int compare(Product prod1, Product prod2) {
				// String의 compareTo이용
				return prod1.name.compareTo(prod2.name);
			};
		});
		System.out.println(prodList);
		
		// 2차 가격 내림차순 정렬
		Collections.sort(prodList, new Comparator<Product>() {
			public int compare(Product prod1, Product prod2) {
				if(prod1.name.equals(prod2.name)) { // 이름이 같으면
					return prod2.price - prod1.price; // 가격에 대해 내림차순 정렬 
				} else {
					return 0; // 이름이 다르다면 정렬 안함
				}
			};
		});
		System.out.println(prodList);

	} // main

} // class
