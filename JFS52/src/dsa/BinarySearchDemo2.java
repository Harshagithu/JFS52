package dsa;

public class BinarySearchDemo2 {

	public static int binarySearch(int arr[],int target)
	{
		int left=0,right=arr.length-1;
		while(left<=right)
		{
			int mid=(left+right)/2;
			if(arr[mid]==target)
			{
				return mid;
			}
			else if(arr[mid]<target)
			{
				left=mid+1;
			}
			else
			{
				right=mid-1;
			}
		}
		return left;
	}
	public static void main(String[] args) {
		int arr[]= {1,3,5,6,7};
		int target=2;
        System.out.println(binarySearch(arr,target));
	}

}
