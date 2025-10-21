package com.myproject.something;

import java.util.ArrayList;

public class ListIterator {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("java");
		list.add("python");
		list.add(".net");
		java.util.ListIterator<String> itr=list.listIterator();
		while(itr.hasNext())
		{
			String s=itr.next();
			System.out.println(s);
			}
		while(itr.hasPrevious())
		{
			String s=itr.previous();
			System.out.println(s);
			}
		

	}

}
