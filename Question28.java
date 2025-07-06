import java.util.*;
public class Question28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		Set<Integer> s=new HashSet<>();
		for(int i:a) {
			s.add(i);
		}
		for(int i:s) {
			System.out.print(i+" ");
		}
		
	}

}
