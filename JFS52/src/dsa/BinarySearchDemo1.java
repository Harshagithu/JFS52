package dsa;

public class BinarySearchDemo1 {

	public static void main(String[] args) {
		String names[]= {"bahu","deva","soma","tarun"};
		int n=names.length;
		String target="soma";
		int left=0,right=n-1;
		while(left<=right)
		{
			int mid=(left+right)/2;
			int comparison=names[mid].compareTo(target);
			if(comparison==0)
			{
				System.out.println("target element found at:"+mid);
				break;
			}
			else if(comparison<0)
			{
				left=mid+1;
			}
			else
			{
				right=mid-1;
			}
		}

	}

}
