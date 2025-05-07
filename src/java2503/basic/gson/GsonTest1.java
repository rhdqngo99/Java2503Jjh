package java2503.basic.gson;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;


public class GsonTest1 {

	public static void main(String[] args) {
		
	      // Gson 객체 생성
	      Gson gson = new GsonBuilder().setPrettyPrinting().create();
	      
	      // JsonObject에 키/값 추가
	      JsonObject jsonObject = new JsonObject();
	      jsonObject.addProperty("name", "홍길동");
	      jsonObject.addProperty("age", 30);
	      
	      // JsonObject를 Json문자열로 변환
	      String jsonStr = gson.toJson(jsonObject);
	      System.out.println(jsonStr);
	      
	      // Json문자열을 Java객체로 변환
	      String jsonStr2 = "{\"name\": \"강감찬\", \"age\": 30}";
	      Person person = gson.fromJson(jsonStr2, Person.class);
	      System.out.println(person);
	      
	      // Java객체를 Json문자열로 변환
	      String jsonStr3 = gson.toJson(person);
	      System.out.println(jsonStr3);
	      
	      // Map객체를 Json문자열로 변환
	      Map<String, String> map = new HashMap<String, String>();
	      map.put("name", "유관순");
	      map.put("age", "20");
	      map.put("gender", "여성");
	      String mapStr = gson.toJson(map);
	      System.out.println(mapStr);
	      
	      // Json문자열을 Map객체로 변환
	      Map<String, String> map2 = gson.fromJson(mapStr, Map.class);
	      System.out.println(map2);
	      
	      // List객체를 Json문자열로 변환
	      List<Person> personList = new ArrayList<Person>();
	      personList.add(new Person("홍길동", 30));
	      personList.add(new Person("강감찬", 40));
	      personList.add(new Person("이순신", 50));
	      String jsonStr4 = gson.toJson(personList);
	      System.out.println(jsonStr4);
	      
	      // Json문자열을 List객체로 변환
	      List<Person> personList2 = gson.fromJson(jsonStr4, List.class);
	      System.out.println(personList2);

		
	} // main

} // class
