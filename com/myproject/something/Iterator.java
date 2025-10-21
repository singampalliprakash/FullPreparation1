package com.myproject.something;

import java.util.ArrayList;

public class Iterator {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("java");
		list.add("python");
		list.add(".net");
		java.util.Iterator<String> itr=list.iterator();
		while(itr.hasNext())
		{
			String s=itr.next();
			System.out.println(s);
			}
		
	}

}
