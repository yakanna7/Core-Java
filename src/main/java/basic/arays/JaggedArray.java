//Java program to implement Jagged Array
package basic.arays;

class JaggedArray 
{
	public static void main(String args[]) 
	{
		String[][] person = new String[3][];
		person[0] = new String[3];
		person[1] = new String[2];
		person[2] = new String[1];

		person[0][0] = "Telugu";
		person[0][1] = "English";
		person[0][2] = "Hindi";

		person[1][0] = "Telugu";
		person[1][1] = "English";

		person[2][0] = "English";

		int i, j;

		for (i = 0; i < person.length; i++) 
		{
			System.out.println("Languages known by person " + (i + 1));
			for (j = 0; j < person[i].length; j++)
			{
				System.out.println(person[i][j]);
			}

			System.out.println();
		}
	}
}
