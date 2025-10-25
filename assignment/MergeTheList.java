package assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeTheList {
	public static List<Integer> concatenate(List<Integer>list1,List<Integer>list2)
	{
	ArrayList<Integer> res=new ArrayList<Integer>();
	int i=0;
	int j=0;
	while(i<list1.size()&&j<list2.size())
	{
		if(list1.get(i)<list2.get(j))
		{
			res.add(list1.get(i));
			i++;
		}
		else
		{
			res.add(list2.get(j));
			j++;
		}
	
	}
	while(i<list1.size())
	{
		res.add(list1.get(i));
		i++;
	}
	while(i<list2.size())
	{
		res.add(list2.get(i));
		j++;
	}
	return res;
	}
	
	public static void main(String[] args) {
		List<Integer> list1=Arrays.asList(1,4,6);
		List<Integer> list2=Arrays.asList(2,3,5);
		System.out.println(concatenate(list1, list2));
		

	}

}

