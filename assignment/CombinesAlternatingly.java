package assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinesAlternatingly {
	public static List<Object> combinesAlternatingly(List<Object>list1,List<Object>list2)
	{
		ArrayList<Object> res=new ArrayList<Object>();
		int i=0;
		int j=0;
		while(i<list1.size()||j<list2.size())
		{
			if(i<list1.size())
			{
				res.add(list1.get(i));
				i++;
			}
			if(j<list2.size())
			{
				res.add(list2.get(j));
				j++;
			}
		}
		
		return res;
		
	}

	public static void main(String[] args) {
		List<Object> list1=Arrays.asList("a","b","c");
		List<Object> list2=Arrays.asList(1,2,3);
		System.out.println(combinesAlternatingly(list1, list2));

	}

}
