package dsa;

import java.util.Arrays;
import java.util.Stack;

public class StackDemo1 {

	public static void main(String[] args) {
		
		Stack<Integer> stack=new Stack<Integer>();
		int arr[]= {4,12,3,1,2,5,7,4};
		
		// arr[]={12,-1,5,2,5,7,7,-1}
		
		int n=arr.length;
		int res[]=new int[n];
		for(int i=n-1;i>=0;i--)
		{
			while(!stack.isEmpty()&&res[i]>stack.peek())
			{
				stack.pop();
			}
			if(stack.isEmpty())
			{
				res[i]=-1;
			}
			else
			{
				res[i]=stack.peek();
			}
			stack.push(arr[i]);
		}

		System.out.println(Arrays.toString(res));
	}

}
