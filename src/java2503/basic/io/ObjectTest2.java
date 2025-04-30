package java2503.basic.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectTest2 {

	public static void main(String[] args) {
		
		Animal dog1 = new Dog("치와와", 4, "왈왈");
		Animal dog2 = new Dog("셰퍼드", 4, "멍멍");
		
		File file = new File("D:\\java2503\\files\\object2.dat");
		
		ObjectOutputStream oos = null;
		ObjectInputStream ois = null;
		
		try {
			
			// 상속관계에 있는 클래스의 객체는 상/하위클래스 모두 Serializable을
			// 구현해야 함
			
			oos = new ObjectOutputStream(new FileOutputStream(file));
			oos.writeObject(dog1);
			oos.writeObject(dog2);
			
			ois = new ObjectInputStream(new FileInputStream(file));
			Animal d1 = (Animal)ois.readObject();
			Animal d2 = (Animal)ois.readObject();
			
			System.out.println(d1);
			System.out.println(d2);
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
	} // main

} // class
