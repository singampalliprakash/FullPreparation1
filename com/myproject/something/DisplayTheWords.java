package com.myproject.something;

public class DisplayTheWords {

	public static void main(String[] args) {
		String s="sai is presenting Outstanding performance in java";
		String[] st=s.split(" ");
		System.out.println("count the words:"+st.length);
		for(String sd:st)
		{
			System.out.println(sd);
		}
		StringBuilder sb=new StringBuilder();
		//reverse printing the words
		for(int i=st.length-1;i>=0;i--)
		{
			sb.append(st[i]).append(" ");
		}
		System.out.println(sb);
		

	}

	

}
