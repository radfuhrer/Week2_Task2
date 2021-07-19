package binSearch;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class dhoondh {

	static int binarySearch(ArrayList<Integer> arr,int low,int high,int n) {	
		
			if(low<=high) {
				
				int mid=(low+high)/2;
				//System.out.println(mid+" ");
			
				if(arr.get(mid)==n) {
					return mid;
				}
				if(arr.get(mid)>n) {
					return binarySearch(arr,low,mid-1,n);//err
				}
				return binarySearch(arr,mid+1,high,n);
			
			}
	
			return -1;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			 
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int n=1;
		try {
			while(true) {
				System.out.print("Enter number ('0' to exit): ");
				n=sc.nextInt();
				if(n==0)
					break;
				else
					arr.add(n);
			}
			Collections.sort(arr);
				
			//print sorted array
			for(int i=0;i<arr.size();i++) {
				System.out.print(arr.get(i)+"\t");
			}
			System.out.println();
			
			System.out.print("Enter search element: ");
			n=sc.nextInt();
			int low=0;
			int high=arr.size()-1;

			int pos=dhoondh.binarySearch(arr,low,high,n);
			if(pos!=-1)
				System.out.println(pos);
			else
				System.out.println("Element not found");
			
		}
		catch(Exception e) {
			System.out.println("Error :(");
		}
	}	
}
