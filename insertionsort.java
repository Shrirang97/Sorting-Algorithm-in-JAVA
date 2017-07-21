import java.util.*;
public class insertionsort
{
	private static void sort(int a[],int n)
	{
		for(int i=1;i<n;i++)
		{
			int value = a[i];
			int hole = i;
			while(hole>0 && a[hole-1]>value)
			{
				a[hole] = a[hole-1];
				hole--;
			}

		a[hole] = value;	
		}
	}


	public static void main(String arg[])
	{
		int a[] = new int[11];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<11;i++)
		    a[i] = sc.nextInt();
		sort(a,11);
		System.out.print("Sorted array : ");
		for(int i=0;i<11;i++)
			System.out.print(a[i]+"\t");
	}

}