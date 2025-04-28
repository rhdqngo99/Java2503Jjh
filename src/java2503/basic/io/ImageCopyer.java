package java2503.basic.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

// 이미지 복사
public class ImageCopyer {

	public static void main(String[] args) {
		
		// 이미지 파일에서 바이트를 읽는 스트림
		InputStream is = null;
		// 파일에 바이트를 쓰는 스트림
		OutputStream os = null;
		// 원본파일
		File orgFile = null;
		// 복제파일
		File copyFile = null;
		
		try {
			
			orgFile = new File("E:\\Java2503Jjh\\files\\mm.jpg");
			copyFile = new File("E:\\Java2503Jjh\\files\\mm_copy.jpg");
			
			is = new FileInputStream(orgFile);
			os = new FileOutputStream(copyFile);
			
			// 바이트 단위 복사 (속도가 느림)
			/*
			int readByte = 0;
			while ((readByte=is.read()) > -1) { // 읽은 바이트가 있는동안 반복
			}
			os.flush(); // 출력스트림을 파일에 밀어내기
			*/
			
			// 바이트 배열단위 복사 (속도가 빠름)
			byte[] buffer = new byte[1024];
			int readByte = 0;
			while ((readByte=is.read(buffer)) > -1) {
				os.write(buffer,0,readByte); // 읽은 바이트 수만큼 씀
			}
			os.flush();
			
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
