import java.util.Scanner;
class selectionsort
{
	private static void sort(int a[],int n)
	{

		  for(int i=0;i<n-1;i++)
		  {
		  	int min = i;
		  	for(int j=i+1;j<n;j++)
		  	{
		  		if(a[j]<a[min])
		  		  min = j;
		  	}
		  	int t = a[i];
		  	a[i] = a[min];
		  	a[min] = t;

		  }
	}
	public static void main(String arg[])
	{
		/*int a[] = new int[10];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<10;i++)
		    a[i] = sc.nextInt();*/int a[] = {40,100,50,10,90,80,20,30,70,60};
		sort(a,10);
		System.out.print("Sorted array : ");
		for(int i=0;i<10;i++)
			System.out.print(a[i]+"\t");
	}
}