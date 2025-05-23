package java2503.basic.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedTest2 {

	public static void main(String[] args) {
		
		File file = new File("E:\\Java2503Jjh\\files\\buffered2.txt");
		
		BufferedWriter bw = null;
		BufferedReader br = null;
		
		try {
			
			bw = new BufferedWriter(new FileWriter(file));
			for (int i = 0; i < 10000000; i++) {
				bw.write("Hello Java!");
				bw.newLine(); // window:\n, linux:\r\n
			}
			
			br = new BufferedReader(new FileReader(file));
			String line = "";
			while ((line=br.readLine()) != null) { // 잃은줄이 있는 동안 반복
				System.out.println(line);
			}
			
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		
	} // main

} // class
