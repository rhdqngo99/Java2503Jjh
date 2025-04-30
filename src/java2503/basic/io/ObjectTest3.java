package java2503.basic.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

// 네트워크상의 JSON데이터를 받아서 직렬화/역직렬화

public class ObjectTest3 {
   
   public static void main(String[] args) {
      
      try {
         
         // 1. 인터넷 주소로 URI 생성
         URI uri = new URI("https://jsonplaceholder.typicode.com/todos");
         
         // 2. URI로 URL 생성
         URL url = uri.toURL();
         
         // 3. URL에서 URLConnection 생성 (연결 객체)
         URLConnection conn = url.openConnection();
         
         // 4. URLConnection에서 바이트입력스트림 생성
         InputStream is = conn.getInputStream();
         
         // 5. 바이트입력스트림을 문자입력스트림으로 변환
         InputStreamReader isr = new InputStreamReader(is);
         
         // 6. 버퍼스트림 생성
         BufferedReader br = new BufferedReader(isr);
         
         // 7. JSON문자열과 Java객체를 변환하는 Gson 객체 생성
         // * gson.jar 필요 (mvnrepository.com 에서 gson으로 검색해서 gson버젼.jar 다운로드)
         Gson gson = new GsonBuilder().create();
         
         // 한 줄씩 읽어서 화면에 출력
         String total = "";
         String line = "";
         while((line=br.readLine()) != null) {
            total += line;
         }
         System.out.println(total);
         
         ArrayList<Todo> todoList 
            = gson.fromJson(total, new TypeToken<ArrayList<Todo>>() {}.getType());
         
         File file = new File("E:\\Java2503Jjh\\files\\todo.dat");
         
         ObjectOutputStream oos = null;
         ObjectInputStream ois = null;
         
         oos = new ObjectOutputStream(new FileOutputStream(file));
         oos.writeObject(todoList);
         
         ois = new ObjectInputStream(new FileInputStream(file));
         ArrayList<Todo> list = (ArrayList<Todo>)ois.readObject();
         System.out.println(list);
         
      } catch (Exception ex) {
         ex.printStackTrace();
      }
      
   } // main

} // class

