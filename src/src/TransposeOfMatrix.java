public class TransposeOfMatrix
{
    public static void main(String[]args)
    {
        int[][] matrix = {
                {1,2},
                {3,4}
        };

        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] transpose = new int[rows][cols];

        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < cols; j++)
            {
                transpose[i][j] = matrix[j][i];
            }
        }

        System.out.println("Transpose of a matrix:");

        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < cols; j++)
            {
                System.out.println(transpose[i][j] + "");
            }
            System.out.println();
        }
    }
}
