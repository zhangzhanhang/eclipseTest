package com.study.hello;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import javax.enterprise.inject.New;

import org.apache.commons.io.FileUtils;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		treadStudy ts=new treadStudy("test");
		treadStudy ts1=new treadStudy("asd");
		Thread t1=new Thread(ts);
		Thread t2=new Thread(ts1);
		t1.start();
		t2.start();
	}
	/**
	 * 线程学习
	 */
	private static void thead() {
		
	}
	/**
	 * io操作
	 * @throws IOException
	 */
	public void IO() throws IOException {
		String jsonString="{'a':'a'}";
		JsonParser parser=new JsonParser();
		JsonObject object=(JsonObject) parser.parse(jsonString);
		String result= object.get("a").getAsString();
		System.out.println(result); 
		
		JsonObject jsonObject=new JsonObject();
		jsonObject.addProperty("cat", "it");
		
		
		JsonArray array=new JsonArray();
		JsonObject js=new JsonObject();
		js.addProperty("name", "a1");
		js.addProperty("pass", "123");
		array.add(js);
		JsonObject js1=new JsonObject();
		js.addProperty("namea", "a1a");
		js.addProperty("passa", "123a");
		array.add(js1);
		jsonObject.add("languation", array);
		
		System.out.println(jsonObject);
		
		Set<String> set=new TreeSet<String>();
		set.add("s");
		set.add("c");
		set.add("e");
		System.out.println(set);
		Iterator<String> iterator=set.iterator();
		while (iterator.hasNext()) {
			String string=iterator.next();
			System.out.println(string);
		}
		Map<String, Integer> map=new HashMap<String, Integer>();
		map.put("key1", 1);
		map.put("key2", 2);
		map.put("key3", 3);
		int str=map.get("key1");
		System.out.println(str);
		if (map.containsKey("key2")) {
			System.out.println(map.get("key2"));
		}
		
		try {
			long l= System.currentTimeMillis();
			File file=new File("C:\\Users\\yiyun\\Desktop\\note.txt");
			FileInputStream fis=new FileInputStream(file);
			InputStreamReader isf=new InputStreamReader(fis);
			
			BufferedReader biStream=new BufferedReader(isf);
			
			
			char c[]=new char[180];
			while (biStream.read(c)!=-1) {
				System.out.println(new String(c));
			}
			biStream.close();
			isf.close();
			fis.close();
			System.out.println(System.currentTimeMillis()-l);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		File file=new File("C:\\Users\\yiyun\\Desktop\\note.txt");
		String str1= FileUtils.readFileToString(file);
		System.out.println("---------------------------------------");
		System.out.println(str1);
	}

}
