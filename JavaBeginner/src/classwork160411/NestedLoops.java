package classwork160411;

public class NestedLoops {
	
	public static void main(String[] args) {
		

		int[][] matrix = {
				{1,2,3,4},	
				{5,6,7,8},	
				{9,10,11,12},	
		};
		
		for (int r = 0; r < matrix.length; r++) {
			for (int c = 0; c < matrix[r].length; c++) {
				System.out.print(matrix[r][c] + " ");
			}
			System.out.println();
		}
		
		matrix = new int[][] {
			{0},	
			{1,2},	
			{3,4,5},	
		};
		
		for (int[] vector : matrix) {
			for (int x : vector) {
				System.out.print(x + " ");
			}
			System.out.println();
		}
		
		// TODO:  calculate SUM of all of the elements of the matrix
		int sum = 0;
		for (int[] vector : matrix) {
			for (int x : vector) {
				sum += x;
			}
		}
		System.out.println(sum);
		
		
	}

}
