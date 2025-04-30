package java2503.basic.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectTest1 {

	public static void main(String[] args) {
		
		Person hong = new Person("홍길동", 20, "123456-1234567");
		Person kang = new Person("김강찬", 30, "234567-2345678");
		
		File file = new File("E:\\Java2503Jjh\\files\\object.dat");
		
		ObjectOutputStream oos = null;
		ObjectInputStream ois = null;
		
		try {
			
			// 파일에 객체를 쓰는 스트림 (직렬화 스트림)
			oos = new ObjectOutputStream(new FileOutputStream(file));
			
			// 직렬화
			oos.writeObject(hong);
			oos.writeObject(kang);
			
			// 파일에 있는 바이트들(객체)을 읽는 스트림 (역직렬화 스트림)
			ois = new ObjectInputStream(new FileInputStream(file));
			
			// 역직렬화 (스트림 > 객체)
			Person h = (Person)ois.readObject();
			System.out.println(h.name + ", " + h.age + ", " + h.ssn);
			Person k = (Person)ois.readObject();
			System.out.println(k.name + ", " + k.age + ", " + h.ssn);
			
		}catch (Exception ex) {
			ex.printStackTrace();
		}
		
	} // main

} //class
