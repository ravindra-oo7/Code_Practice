package SortingAlgorithms.ArraysSortMethod.SortList.SortListUsingComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainClass {
    public static void main(String[] args) 
    {
            List<Point> list = new ArrayList<>();
        
        list.add(new Point(2, 3));
        list.add(new Point(23, 34));
        list.add(new Point(6, 5));
        list.add(new Point(5, 7));
        list.add(new Point(1,0));
        list.add(new Point(8, 4));
        list.add(new Point(22, 35));

        // Comparator<Point> MyComparator = new MyComparator();
        // Collections.sort(list,MyComparator);

        Collections.sort(list,new MyComparator());

        for (Point point : list) 
        {
            System.out.println("[ "+point.getX()+" , "+point.getY()+" ]");
        }
    }
}
