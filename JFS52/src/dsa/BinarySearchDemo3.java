package dsa;

import java.util.Arrays;

public class BinarySearchDemo3 {

	public static int[] floccurs(int arr[], int target)
	{
		//first Occurrence
		int first=binarySearch(arr,target,true);
		//last Occurrence
		int last=binarySearch(arr,target,false);
		return new int[] {first,last};
	}
	public static int binarySearch(int arr[],int target, boolean found)
	{
		int pos=-1;
		int left=0,right=arr.length-1;
		while(left<=right)
		{
			int mid=(left+right)/2;
			if(arr[mid]==target)
			{
				pos=mid;
				if(found)
				{
					right=mid-1;
				}
				else
				{
					left=mid+1;
				}
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
		return pos;
		
	}
	public static void main(String[] args) {
		int arr[]= {1,2,3,3,3,3,4,5,6,7,8,9};
		int target=3;
		System.out.println(Arrays.toString(floccurs(arr,target)));

	}

}
