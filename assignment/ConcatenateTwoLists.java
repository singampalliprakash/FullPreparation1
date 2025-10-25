package assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConcatenateTwoLists {
	public static List<Object> concatenate(List<Object>list1,List<Object>list2)
	{
	ArrayList<Object> res=new ArrayList<Object>(list1);
	res.addAll(list2);
	return res;
	}
	public static void main(String[] args) {
		List<Object> list1=Arrays.asList("a","b","c");
		List<Object> list2=Arrays.asList(1,2,3);
		
		System.out.println(concatenate(list1, list2));

	}

}
