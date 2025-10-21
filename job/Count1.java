package job;

public class Count1 {
	public static int countSortedBinaryOrder(int arr[])
	{
		int left=0;
		int right=arr.length-1;
		
		while(left<=right)
		{
			int mid=left+(right-left)/2;
			if(arr[mid]==0)
			{
				left=mid+1;
			}
			else
			{
				right=mid-1;
			}
		}
		return arr.length-left;
		
	}

	public static void main(String[] args) {
		int arr[]= {0,0,0,1,1,1,1};
		System.out.println(countSortedBinaryOrder(arr));

	}
}
