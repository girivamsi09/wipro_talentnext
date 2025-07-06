import java.util.*;
public class Question29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int start=6,end=9;
		int s=0;
		boolean skip=false;
		for(int i:a) {
			if(i==start) {
				skip=true;
			}
			if(!skip) {
				s+=i;
			}
			if(i==end && skip) {
				skip=false;
			}
		}
		System.out.println(s);
	}

}
