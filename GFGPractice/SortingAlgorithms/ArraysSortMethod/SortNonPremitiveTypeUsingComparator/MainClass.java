import java.util.Arrays;
import java.util.Comparator;

import SortingAlgorithms.ArraysSortMethod.SortList.SortListUsingComparator.MyComparator;
import SortingAlgorithms.ArraysSortMethod.SortList.SortListUsingComparator.Point;
public class MainClass {
    public static void main(String[] args) 
    {
        Point[] arr = {
                        new Point(10,20),
                        new Point(3,12),
                        new Point(5,7),
                        new Point(9,9)
                      };

        Comparator<Point> myComptor = new MyComparator();              
                      
        Arrays.sort(arr,myComptor);

        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i].getX()+" "+arr[i].getY());
        }
    }
}
