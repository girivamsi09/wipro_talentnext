
public class Question35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {
	            {5, 8, 1},
	            {4, 9, 2},
	            {3, 7, 6}
	        };

	        int max = arr[0][0];

	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                if (arr[i][j] > max) {
	                    max = arr[i][j];
	                }
	            }
	        }

	        System.out.println("Largest number: " + max);
	}

}
