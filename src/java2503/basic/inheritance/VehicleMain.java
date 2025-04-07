package java2503.basic.oop.inheritance;

import java.util.Vector;

public class VehicleMain {

	public static void main(String[] args) {
		
		// v1은 Vehicle타입, 가지고 있는 참조는 Vehicle타입
		Vehicle v1 = new Vehicle();
		System.out.println(v1.getName()); // 탈것
		
		// v2는 Vehicle타입, 가지고 있는 참조는 Car타입
		Vehicle v2 = new Car();
		System.out.println(v2.getName()); // 자동차
		
		// v3은 Vehicle타입, 가지고 있는 참조는 Bicycle타입
		Vehicle v3 = new Bicycle();
		System.out.println(v3.getName()); // 자전거
		
		// 배열에서 다형성 활용
		Vehicle[] vArr = {new Vehicle(), new Car(), new Bicycle()};
		for (Vehicle v : vArr) {
			System.out.println(v.getName());
		}
		
		// 배열에서 다형성 활용2
		Vehicle[] vArr2 = new Vehicle[1000];
		int vArr2Leng = vArr2.length; // 1000
		for (int i=0; i<vArr2Leng; i++) { // 0~999
			if(i%3==0) vArr2[i] = new Vehicle();
			else if (i%3==1) vArr2[i] = new Car();
			else if (i%3==2) vArr2[i] = new Bicycle();
			System.out.println(vArr2[i].getName());
		}
		
	}

}
