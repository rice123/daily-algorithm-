package org.whut.choumiaoer.Singleton;

import java.util.HashMap;
import java.util.Map;

public class Singleton2 {
	private static Map<String,Singleton2> map=new HashMap<String,Singleton2>();
	static{
		Singleton2 single=new Singleton2();
		map.put(single.getClass().getName(),single);
	}
	public static Singleton2 getInstance(String name){
		if(name==null){
			name=Singleton2.class.getName();
			System.out.println("name==null"+"     name="+name);
		}else if(map.get(name)==null){
			try {
				map.put(name,(Singleton2) Class.forName(name).newInstance());
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
		return map.get(name);		
		}
	public void about(){
		System.out.println("------");
	}
	public static void main(String [] args){
		Singleton2 s=Singleton2.getInstance(null);
		s.about();
	}
}
