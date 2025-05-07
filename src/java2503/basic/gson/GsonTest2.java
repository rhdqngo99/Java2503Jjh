package java2503.basic.gson;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;


// 실습
// 1. http://jasonplaceholder.typicode.com/posts JSON문자열을 가져와서
// 2. List<Post>로 변환
// 3. 리스트 출력

public class GsonTest2 {

	public static void main(String[] args) {
		
		try {
			
			String uriStr = "http://jsonplaceholder.typicode.com/posts";
			URL url = new URI(uriStr).toURL();
			URLConnection conn = url.openConnection();
			BufferedReader br 
		    	= new BufferedReader(new InputStreamReader(conn.getInputStream()));
	          
			String jsonStr = "";
			String line = "";
			while ((line=br.readLine()) != null) {
				jsonStr += line;
			}
			//System.out.println(jsonStr);
			
			Gson gson = new GsonBuilder().setPrettyPrinting().create();
			//List<Post> postList = gson.fromJson(jsonStr, List.class);
			List<Post> postList 
				= gson.fromJson(jsonStr, new TypeToken<List<Post>>() {}.getType());
				
			// id 내림차순 정렬
	         Collections.sort(postList, new Comparator<Post>() {
	        	 @Override
	            public int compare(Post post1, Post post2) {
	            	return post2.getId() - post1.getId();
	            }
	         });
			
			System.out.println(postList);
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
	} // main

} // class
