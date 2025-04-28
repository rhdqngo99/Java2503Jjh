package java2503.basic.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ByteStreamTest {

	public static void main(String[] args) {
		
		InputStream is = null; // 바이트단위 입력스트림
		OutputStream os = null; // 바이트단위 출력스트림
		
		try {
			
			// 파일에 바이트를 쓰는 OutputStream 생성
			os = new FileOutputStream(new File("E:\\Java2503Jjh\\files\\file1.dat"));
			os.write(100); // 스트림에 데이터를 씀
			os.flush(); // 파일에 스트림의 데이터를 밀어냄
			
			// 파일에 바이트를 잃는 InputStream 생성
			is = new FileInputStream(new File("E:\\Java2503Jjh\\files\\file1.dat"));
			System.out.println("읽은 바이트 : " + is.read());
			
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch(IOException ioe) {
			ioe.printStackTrace();
		} finally {
			try {
				if(os!=null) os.close();
				if(is!=null) is.close();
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
		}

	} // main

} // class
