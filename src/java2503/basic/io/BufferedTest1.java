package java2503.basic.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedTest1 {

	public static void main(String[] args) {
		
		File file = new File("E:\\Java2503Jjh\\files\\buffered.dat");
		
		BufferedOutputStream bos = null;
		BufferedInputStream bis = null;
		
		try {
			
			// FileOutputStream > BufferedOutputStream 스트림 연결
			bos = new BufferedOutputStream(new FileOutputStream(file));
			
			byte[] byteArr = new byte[1024*1024*1024]; // 1G Bytes
			int byteArrLeng = byteArr.length;
			
			long startTime = System.currentTimeMillis();
			
			for (int i=0; i<byteArrLeng; i++) {
				byteArr[i] = (byte)i;
				
			}
			bos.write(byteArr);
			
			long endTime = System.currentTimeMillis();
			
			System.out.println("총 소요시간 (ms) : " + (endTime-startTime));
			
			// FileInputStream을 BufferedInputStream에 연결
			bis = new BufferedInputStream(new FileInputStream(file));
			byte[] readArr = new byte[1024*1024*1024];
			bis.read(readArr);
			int readArrLeng = readArr.length;
			for (int i=0; i<readArrLeng; i++) {
				System.out.println(readArr[i]);
			}
				
		}catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		
	} // main

} // class
	