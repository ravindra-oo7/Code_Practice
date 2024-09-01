package Arrays.TwoDArrayIteration;

public class PrintTwoDArray {
    public static void main(String[] args) 
    {
          int[][] arr= {
                        {9,7},
                        {1,2,3,4},
                        {5,6,7,8},
                        {9,10}
                       };

          print(arr);             

    }

    private static void print(int[][] arr) 
    {
        System.out.println("Rows in Array : "+arr.length); // print no of rows
        System.out.println("Columns in First Row of Array : "+arr[0].length+ "\n"); // print no of column in first row

        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.print(arr[i][j]+", ");
            }
            System.out.println();
        }
    }
}
