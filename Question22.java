import java.util.*;
public class Question22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int s=0;
		for(int i:a) {
			s+=i;
		}
		System.out.println("sum "+s);
		System.out.println("avg "+s/a.length);
		
	}

}
