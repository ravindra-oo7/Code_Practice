import java.util.Comparator;

public class MyComparator implements Comparator<Point>
{

    @Override
    public int compare(Point p1, Point p2) 
    {
        return p1.getX()-p2.getX();
    }
    
}
