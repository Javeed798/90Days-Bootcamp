package BootCamp;

import java.util.ArrayList;

public class ArrayListt {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		ArrayList al = new ArrayList();
		al.add(100);
		al.add(200);
		System.out.println(al.size());
		al.set(0, 3);
		System.out.println(al);
		@SuppressWarnings("rawtypes")
		ArrayList b = new ArrayList();
		b.add(500);
		b.add(400);
		b.add(600);
		b.add(2);
		b.add("Sa");
		System.out.println(b);
		System.out.println();

	}

}
