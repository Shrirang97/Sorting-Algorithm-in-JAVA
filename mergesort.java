import java.util.*;
class mergesort
{
	 static void mergepartition(int l[],int r[],int a[],int mid,int n)
	{
		int i,j,k;
		i = j = k = 0;
		while(i<mid && j<n-mid)
		{
			if(l[i]<r[j])
			  a[k++] = l[i++];
			else
			  a[k++] = r[j++];
		}
		while(i<mid)
			a[k++] = l[i++];
		while(j<n-mid)
			a[k++] = r[j++];
	}
	static void mergesort(int a[],int n)
	{
		if(n<2)
		   return;
		int mid = n/2;
		int left[] = new int [mid];
		int right[] = new int [n-mid];
		int k = -1;
		for(int i=0;i<mid;i++)
			left[i] = a[++k];
		for(int i=0;i<n-mid;i++)
			right[i] = a[++k];
		mergesort(left,mid);
		mergesort(right,n-mid);
		mergepartition(left,right,a,mid,n);

	}
	public static void main(String arg[])
	{
		/*int a[] = new int[10];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<10;i++)
		    a[i] = sc.nextInt();*/int a[] = {70,60};
		mergesort(a,2);
		System.out.print("Sorted array : ");
		for(int i=0;i<2;i++)
			System.out.print(a[i]+"\t");
	}
}