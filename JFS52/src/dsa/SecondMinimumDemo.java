package dsa;

public class SecondMinimumDemo {

	public static void main(String[] args) {
		int arr[]= {23,89,18,38,47,39};
		int n=arr.length,min=Integer.MAX_VALUE,secondmin=Integer.MAX_VALUE;
		for(int i=0;i<n;i++)
		{
			if(min>arr[i])
			{
				secondmin=min;
				min=arr[i];
			}
			else if(secondmin>arr[i]&&secondmin>min)
			{
				secondmin=arr[i];
			}
		}
		System.out.println("Second Minimum element in the given array is:"+secondmin);

	}

}
