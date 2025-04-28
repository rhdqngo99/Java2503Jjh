package java2503.basic.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class CharStreamTest {

	public static void main(String[] args) {
		
		Writer writer = null;
		Reader reader = null;
		
		try {
			
			// 파일 객체 생성
			File file = new File("E:\\Java2503Jjh\\files\\file3.txt");
			
			// 파일에 문자를 쓰는 스트림
			writer = new FileWriter(file);
			writer.write("Hello");
			writer.flush();
			
			// 파일에서 문자를 읽는 스트림
			reader = new FileReader(file);
			int readChar = 0;
			while ((readChar=reader.read()) > 0) {
				System.out.println((char)readChar);
			}
			
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch(IOException ioe) {
			ioe.printStackTrace();
		} finally {
			try {
				if(writer!=null) writer.close();
				if(reader!=null) reader.close();
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
		}
		
	} // main

} // class
