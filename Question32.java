import java.util.*;
public class Question32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		boolean valid=true;
		for(int i=0;i<n;i++) {
			if(a[i]!=1 && a[i]!=4) {
				valid=false;
				break;
			}
		}
		System.out.println(valid);
	}

}
