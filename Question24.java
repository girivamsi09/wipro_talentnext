import java.util.*;
public class Question24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int target=sc.nextInt();
		int l=0,r=n-1;
		int index=-1;
		while(l<=r) {
			int mid=l+(r-l)/2;
			if(a[mid]==target) {
				index=mid;
				break;
			}
			else if(a[mid]<target){
				l=mid+1;
			}
			else {
				r=mid-1;
			}
		}
		System.out.println(index);
	}

}
