
import java.util.*;

public class Time_bubble {
	
	public static void main(String args[]) {
		 long startTime = System.nanoTime();
		 
			List<Integer> list = Arrays.asList(44, 55, 99, 77, 88,6 , 66); 
		
			int n=list.size();
		
			Time_bubble obj = new Time_bubble();
			
			obj.sort_with_time(list,n);

			long endTime = System.nanoTime();
			 
	        long timeElapsed = endTime - startTime;
	        System.out.println( );
	        System.out.println("Execution time in nanoseconds: " + timeElapsed);
}

	private void sort_with_time(List<Integer> list, int n) {
		// TODO Auto-generated method stub
		for(int i=0;i<n-1;i++) {
			Boolean flag = false; 
			for(int j=1;j<n-i-1;j++) {
				if(list.get(j)>list.get(j+1)) {
					flag=true;
					 Collections.swap(list, j, j+1);
				}
			}
			
			if(!flag) {
				break;
			}
			
		}
		System.out.println("sorting threw the buublesort :");
		for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");		
		}

	}
}
	
		
	
