package dsa;

public class RCsum {

	public static void main(String[] args) {
		int arr[][]= {{21,22,24},{41,49,52},{23,24,26}};
		int n=arr.length;
		int m=arr[0].length;
		for(int i=0;i<n;i++)
		{
			int rowsum=0,colsum=0;
			for(int j=0;j<m;j++)
			{
				rowsum+=arr[i][j];
				colsum+=arr[j][i];
			}
			System.out.println(i+" row sum : "+rowsum);
			System.out.println(i+" col sum : "+colsum);
		}
		

	}

}
