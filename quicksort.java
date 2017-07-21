import java.util.*;
class quicksort
{
	private static int quickpartition(int a[],int start,int end)
	{
		int pivot = a[end-1];
		int index = start;
		for(int i=start;i<end;i++)
		{
			if(a[i]<=pivot)
			  {
			  	int temp = a[i];
			  	a[i] = a[index];
			  	a[index] = temp;
			  	index++;
			  }
		}
		return index;
	}
	private static void quicksort(int a[],int start,int end)
	{
		if(start<end)
		{
			int index = quickpartition(a,start,end);
			quicksort(a,start,index-1);
			quicksort(a,index+1,end);
		}
	}
	public static void main(String arg[])
	{
		/*int a[] = new int[10];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<10;i++)
		    a[i] = sc.nextInt();*/int a[] = {40,100,50,10,90,80,20,30,70,60};
		quicksort(a,0,10);
		System.out.print("Sorted array : ");
		for(int i=0;i<10;i++)
			System.out.print(a[i]+"\t");
	}
}