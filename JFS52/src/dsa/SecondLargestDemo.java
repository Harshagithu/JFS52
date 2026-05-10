package dsa;

public class SecondLargestDemo {

	public static void main(String[] args) {
		int arr[]= {23,89,18,38,47,39};
		int n=arr.length,max=Integer.MIN_VALUE,secondmax=Integer.MIN_VALUE;
		for(int i=0;i<n;i++)
		{
			if(max<arr[i])
			{
				secondmax=max;
				max=arr[i];
			}
			else if(secondmax<arr[i]&&secondmax<max)
			{
				secondmax=arr[i];
			}
		}
		System.out.println("Second Largest element in the given array is:"+secondmax);

	}

}
