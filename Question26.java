import java.util.*;
public class Question26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		System.out.println("Smallest "+a[0]+" "+a[1]);
		System.out.println("largest"+a[n-2]+" "+a[n-1]);
	}

}
