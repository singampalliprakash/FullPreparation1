package sortings;

public class CheckSortedOrNot {
	public static boolean checkSorted(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i+1]<arr[i])
			{
				return false;
			}
		}
		return true;
		
	}

	public static void main(String[] args) {
		int arr[]= {10, 90,30, 40, 50};
		System.out.println(checkSorted(arr));

	}

}
