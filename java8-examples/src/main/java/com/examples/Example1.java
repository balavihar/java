package com.examples;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

public class Example1 implements Predicate<Integer> {

	public boolean test(Integer arg0) {
		// TODO Auto-generated method stub
		List<Integer> l = new ArrayList<Integer>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(30);
		final int aaaa = l.stream()
		.filter(s -> s > arg0)
		.map(s -> arg0)
		.reduce(Integer::sum)
		.get();
		System.out.println(aaaa);
		return false;
	}

	public static void main(String[] args) {
		Predicate<Integer> pi = new Example1();
		pi.test(2);
	}
	
	public static void main2(String[] args) {
		A b = new A();
		b.setId("aaaaaaa");
		System.out.println(b.getId());
		b.setId(1);
		System.out.println(b.getId());
	}
	
	public static void main3(String[] args) {
		List<C> list = new ArrayList<>();
		list.add(new C(1, "aaaa"));
		list.add(new C(2, "bbbb"));
		list.add(new C(3, "cccc"));
		list.add(new C(4, "dddd"));
		//Map<Integer, String> m = list.forEach(c -> System.out.println(c.getId()));//new HashMap<>();
		Map<Integer, String> m = new HashMap<>();
		list.forEach(c -> m.put(c.getId(),c.getName()));//new HashMap<>();
		//m.forEach(k, v -> sysout);
		for(int i=1;i<=m.size();i++){
			System.out.println(m.get(i));
		}
	}
	
	public static void main4(String[] args) {
		String str = "a";
		String str1 = "b";
		System.out.println(str + " : " + str1);
		str = str1 = "c";
		System.out.println(str + " : " + str1);
	}
	
	public static void main5(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		//1,2,3,4,5,6,7,8,9,10 (4,5,6 are system panes and others are panes)
		//10,1,2,3,7,8,9
	}
	
	public static void main1(String[] args) {
		System.out.println(String.format("Failed to find %s [%s]", "aaaa", "bbbb"));
	}
}

class A {
	private Object id;

	/**
	 * @return the id
	 */
	public Object getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Object id) {
		this.id = id;
	}
	
}

class B extends A {
	private Integer id;

	/**
	 * @return the id
	 */
	@Override
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
}

class C {
	
	private Integer id;
	private String name;
	
	C(Integer id, String name){
		this.id = id;
		this.name = name;
	}
	
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
}
