import java.util.Arrays;

public class MainMethod
{
    public static void main(String[] args) 
    {
        
        Point[] arr = {
                        new Point(10,20),
                        new Point(3,12), 
                        new Point(5,7)
                      };
                      
        Arrays.sort(arr);

        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i].getX()+" "+arr[i].getY());
        }
        
    }
}