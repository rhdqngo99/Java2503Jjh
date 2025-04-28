package java2503.basic.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

// 변환  스트림
public class ConvStreamTest {

	public static void main(String[] args) {
		
		File file = new File("E:\\Java2503Jjh\\files\\file4.dat");
		
		OutputStream os = null;
		Writer writer = null;
		InputStream is = null;
		Reader reader = null;
		
		try {
			
			// 파일에 바이트를 쓰는 스트림
			os = new FileOutputStream(file);
			
			// 바이트단위 출력을 문자단위 출력으로 변환하는 스트림
			writer = new OutputStreamWriter(os);
			writer.write(65);
			writer.flush();
			
			// 파일에서 바이트를 읽는 스트림
			is = new FileInputStream(file);
			
			// 바이트단위 입력을 문자단위 입력으로 변환하는 스트림
			reader = new InputStreamReader(is);
			System.out.println((char)reader.read());
			
		}  catch (FileNotFoundException fnfe) {
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
