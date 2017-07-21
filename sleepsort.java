import java.util.Scanner;
class sort implements Runnable
{
	private int a;
	sort(int a)
	{
		this.a = a;
	}
	public void run()
	{
		try{
	Thread.sleep(a);
	System.out.print(a+"  ");
	}
	catch(Exception e)
	{}
	}
}

public class sleepsort
{
public static void main(String args[])
{
	sleepsort ss=new sleepsort();
	Scanner ip=new Scanner(System.in);
	System.out.println("Enter the number of elements");
	int n=ip.nextInt();
	int[] arr=new int[n];
	System.out.println("Enter the elements");
	for(int i=0;i<n;i++)
	{
		arr[i]=ip.nextInt();

	}
	System.out.println("Sorted array : ");
	ss.ssmethod(arr);
	}

	public void ssmethod(int[] array)
	{
	 for(int i:array)
	 {
	 	sort s=new sort(i);
	 	Thread t=new Thread(s);
	 	t.start();
	 }
}
}