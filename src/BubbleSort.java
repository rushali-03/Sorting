import java.util.*;
public class BubbleSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the size of array");
		int n=sc.nextInt();
		int Arr[] =  new int[n];
		System.out.println("Please enter the elements of array");
		for(int i=0;i<n;i++)
		{
			Arr[i]=sc.nextInt();
		}
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-1-i;j++)
			{
				if(Arr[j]>Arr[j+1])
				{
					int t=Arr[j];
					Arr[j]=Arr[j+1];
					Arr[j+1]=t;
				}
			}
		}
		System.out.println("The sorted Array is:");
		for(int i=0;i<n;i++)
		{
			System.out.println(Arr[i]);
		}
	}

}
