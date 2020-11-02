/*
 * TwoDimArray coded by cr542 *
 */

public class TwoDimArray {
	
	public static void main(String[] args)  {
		
		int[][] twoDimArray = {
						{0, 3, 54, 6, 23},
						{3, 65, 45, 23, 65}
		};
		
		for(int i = 0; i < twoDimArray.length; i++) {
			for(int k = 0; k < twoDimArray[i].length; k++) {
				System.out.print(twoDimArray[i][k] + " ");
			}
		}	
	}
}
