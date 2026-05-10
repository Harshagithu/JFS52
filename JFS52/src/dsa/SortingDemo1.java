package dsa;

import java.util.Arrays;

public class SortingDemo1 {

	/*public static void bubbleSort(int arr[])
	{
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			boolean swap=false;
			for(int j=0;j<arr.length-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					swap=true;
					count++;
				}
			}
			if(!swap)break;
		}
		System.out.println(count);
	}*/
	
	/*public static void selectionSort(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			int minindex=i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]<arr[minindex])
				{
					minindex=j;
				}
			}
			int temp=arr[minindex];
			arr[minindex]=arr[i];
			arr[i]=temp;
		}
	}*/
	
	/*
    public static int partition(int[] arr, int low, int high) {
        
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j <= high - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);  
        return i + 1;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

	public static void quickSort(int arr[],int low,int high)
	{
	    if(low<high)
	    {
	    int pivotindex=partition(arr,low,high);
	    quickSort(arr,low,pivotindex-1);
	    quickSort(arr,pivotindex+1,high);
	    }
	}
	*/
	/*public static int findMaxIndex(int arr[],int n)
	{
		int maxindex=0;
		for(int i=0;i<n;i++)
		{
			if(arr[i]>arr[maxindex])
			{
				maxindex=i;
			}
		}
		return maxindex;
	}
	public static void reverse(int arr[],int left,int right)
	{
		while(left<right)
		{
			int temp=arr[left];
			arr[left]=arr[right];
			arr[right]=temp;
			left++;
			right--;
		}
	}
	public static void pancakeSort(int arr[]) 
	{
		for(int i=arr.length-1;i>=0;i--)
		{
			int maxIndex=findMaxIndex(arr,i+1);
			reverse(arr,0,maxIndex);
			reverse(arr,0,i);
		}
	}*/
	
	public static void insertionSort(int arr[],int left,int right)
	{
		for(int i=left+1;i<=right;i++)
		{
			int key=arr[i];
			int j=i-1;
			while(j>=left&&arr[j]>key)
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
		}
	}
	
	 public static void merge(int[] arr, int l, int m, int r) 
	   {
	        int len1 = m - l + 1, len2 = r - m;
	        int[] leftArr = new int[len1];
	        int[] rightArr = new int[len2];
	        for(int i = 0; i < len1; i++) 
	        {
	           leftArr[i] = arr[l + i];
	        }
	        for(int i = 0; i < len2; i++)
	        {
	           rightArr[i] = arr[m + 1 + i];
	        }
	        int i = 0, j = 0, k = l;
	        while (i < len1 && j < len2) 
	        {
	            if (leftArr[i] <= rightArr[j])
	            	{
	            	  arr[k++] = leftArr[i++];
	            	}
	            else 
	            	{
	            	  arr[k++] = rightArr[j++];
	            	}
	        }
	        while(i < len1)
	        	{
	        	  arr[k++] = leftArr[i++];
	        	}
	        while(j < len2)
	        	{
	        	  arr[k++] = rightArr[j++];
	        	}
	    }
	
	public static void timSort(int arr[],int n)
	{
		int RUN = 32; 

        for (int i = 0; i < n; i += RUN) {
            insertionSort(arr, i, Math.min((i + RUN - 1), (n - 1)));
        }
        
        for (int size = RUN; size < n; size = 2 * size) {
            for (int left = 0; left < n; left += 2 * size) {
                int mid = left + size - 1;
                int right = Math.min((left + 2 * size - 1), (n - 1));

                if (mid < right) {
                    merge(arr, left, mid, right);
                }
            }
        }
	}
	public static void main(String[] args) {
		int arr[]= {6,3,9,8,7,5,4,1};
		System.out.println("Before Sorting:");
		System.out.println(Arrays.toString(arr));
		int n=arr.length;
		timSort(arr,n);
		System.out.println("After Sorting:");
		System.out.println(Arrays.toString(arr));
	}

}
