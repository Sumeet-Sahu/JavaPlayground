package logical;

public class GetCandies {

	public static void main(String[] args) {
		System.out.println(getNumberOfCandiesToRemove(5));
	}

	public static int getNumberOfCandiesToRemove(int rows) {
		int candies = 0;
		
		int squareWidth = (rows%2==0)?(getNumberOfElementsInRow(rows/2)+1):getNumberOfElementsInRow(rows/2);
		
		for(int p =rows/2;p<=rows;p++)
		{
			int rowElements = getNumberOfElementsInRow(p);
			if(squareWidth < rowElements)
				candies += rowElements-squareWidth;
		}

		return candies;

	}
	
	public static int getNumberOfElementsInRow(int n)
	{
		return 2*n-1;
	}

}
