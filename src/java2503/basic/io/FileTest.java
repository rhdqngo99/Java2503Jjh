package java2503.basic.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.sql.Date;

public class FileTest {

	public static void main(String[] args) {
		
		File dir = new File("E:\\Java2503Jjh\\files\\dir");
		dir.mkdir(); // 디렉토리 생성
		
		// 디렉토리인지 확인
		System.out.println(dir.isDirectory());
		
		// 파일인지 확인
		System.out.println(dir.isFile());
		
		// 디렉토리내의 파일
		File file = new File(dir, "newfile.txt");
		try {
			file.createNewFile();
		} catch(IOException ioe) {
			ioe.printStackTrace();
		}
		
		// newfile.txt에 문자열 쓰기
		Writer writer = null;
		try {
			writer = new FileWriter(file);
			
			writer.flush();
			
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}finally {
			try {
				if(writer!=null) writer.close();
			}catch (IOException ioe) {
				ioe.printStackTrace();
			}
		}
		
		// 파일의 문자 수
		System.out.println(file.length());
		
		// 파일의 속성 정보
		try {
			
			System.out.println(file.canExecute()); // 실행가능 여부
			System.out.println(file.canRead()); // 읽기가능 여부
			System.out.println(file.canWrite()); // 쓰기가능 여부
			System.out.println(new File(".").getAbsolutePath()); // 현재파일의 절대경로 (. 포함)
			System.out.println(new File(".").getCanonicalPath()); // 현재파일의 절대경로 (. 미포함)
			System.out.println(file.getAbsolutePath()); // 파일의 절대경로 (문자열로 반환)
			System.out.println(file.getCanonicalPath()); // 파일의 절대경로 (문자열로 반환)
			System.out.println(file.getAbsoluteFile()); // 파일의 절대경로 (파일로 반환)
			System.out.println(file.getCanonicalFile()); // 파일의 절대경로 (파일로 반환)
			System.out.println(file.getName()); // 파일명
			System.out.println(file.getParent()); // 상위파일 (문자열)
			System.out.println(file.getParentFile()); // 상위파일 (파일)
			System.out.println(file.getPath()); // 파일의 전체경로
			System.out.println(file.isHidden()); // 숨김파일 여부
			System.out.println(file.lastModified()); // 최종수정일 밀리초
			System.out.println(new Date(file.lastModified())); // 최종수정일시
			file.setExecutable(true); // 실행가능 설정
			file.setLastModified(System.currentTimeMillis()); // 최종수정일시를 현재시간으로 변경                                         
			file.setReadable(true); // 읽기가능 설정
			file.setReadOnly(); // 읽기전용 설정
			file.setWritable(true); // 쓰기가능 설정
			File renamedFile = new File("E:\\Java2503Jjh\\files\\newfile_renamed.txt");
			file.renameTo(renamedFile); // 파일명 변경
			renamedFile.delete(); // 파일 삭제
			renamedFile.deleteOnExit(); // 프로그램 종료시에 파일 삭제 (임시파일 사용시 주로 사용)
			System.out.println(dir.exists()); // 파일 존재여부
			System.out.println(renamedFile.exists()); // 파일 존재여부
			
			// 파일 트리
			File files = new File("E:\\java2503Jjh\\files");
			// 디렉토리내의 파일들을 File배열로
			File[] fileArr = files.listFiles();
			for (File f : fileArr) { // 파일이 있는 동안 반복
				if (f.isDirectory()) {
					System.out.println("[D]" + f.getName() + " " + f.length());
				} else {
					System.out.println(f.getName() + " " + f.length());
				}
			}
			// 루트디렉토리들의 파일 배열
			File[] rootArr = File.listRoots();
			for (File f : rootArr) {
				System.out.println(f.getPath());
			}
			
			// 실습 : C드라이브에 하위에 있는 모든 디렉토리와 파일을 출력하는 코드 작성
			//         하위디렉토리내의 하위디렉토리도 모두 탐색 (재귀 용법)
			File cdrive = new File("C:\\");
			printFiles(cdrive);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	} // main

	static void printFiles(File f) {
		if (f.isDirectory()) {
			System.out.println("[D]" + f.getAbsolutePath());
			File[] files = f.listFiles();
			for (File child : files) {
				printFiles(child); // 메소드 내에서 메소드를 호출 (재귀적 호출)
			}
		} else {
			System.out.println(f.getAbsolutePath());
		}
	}
	
} // class
