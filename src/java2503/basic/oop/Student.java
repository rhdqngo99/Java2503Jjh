package java2503.basic.oop;

public class Student {
	
	// 학생은 이름을 가진다 (has a)
	String name;
	
	// 학생은 성적을 가진다 (has a)
	Score score;
	
	Student(String name, Score score) {
		this.name = name;
		this.score = score;
	}
	
	static class Score {
		// 성적은 국어,영어,수학,총점,평균을 가진다 (has a)
		int kor;
		int eng;
		int math;
		int tot;
		double avg;
		
		Score(int kor, int eng, int math) {
			this.kor = kor;
			this.eng = eng;
			this.math = math;
			this.tot = this.kor + this.eng + this.math;
			this.avg = this.tot / 3;
		}
		
	}

}
