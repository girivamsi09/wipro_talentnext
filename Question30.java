import java.util.*;
public class Question30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int c=0;
		for(int i:a) {
			if(i!=10) {
				a[c++]=i;
			}
		}
		while(c<n) {
			a[c++]=0;
		}
		System.out.println(Arrays.toString(a));
	}

}
