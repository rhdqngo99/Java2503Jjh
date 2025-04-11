package java2503.basic.oop;

public class StudentMain {
	
	public static void main(String[] args) {
		
		print(new Student("홍길동", new Student.Score(100, 100, 100)));
		print(new Student("강감찬", new Student.Score(90, 80, 70)));
		print(new Student("이순신", new Student.Score(70, 60, 50)));
		
	} // main
	
	static void print(Student student) {
		System.out.println(
			"이름:" + student.name +
			" 국어:" + student.score.kor +
			" 영어:" + student.score.eng +
			" 수학:" + student.score.math +
			" 총점:" + student.score.tot +
			" 평균:" + student.score.avg
		);
	}

} // class