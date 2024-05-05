
import java.util.ArrayList;

public class UniqueTripletQue 
{    
    public static void main(String[] args) 
    {
        int[] l = {2, 5, 9, 6, 2, 6, 9, 5,4};
        ArrayList<Integer> l1 = new ArrayList<>();

        int n = l.length;
        for (int i = 0; i < n-2; i++) 
        {
            for (int j = i + 1; j < n-1; j++) 
            {
                for (int k = j + 1; k < n; k++) 
                {
                    if (l[i] != l[j] && l[j] != l[k] && l[k] != l[i]) 
                    {
                        int s = l[i] + l[j] + l[k];
                        if (!l1.contains(s)) 
                        {
                            System.out.println(l[i] + " " + l[j] + " " + l[k]);
                            l1.add(s);
                        }
                    }
                }
            }
        }
        System.out.println(l1.size());
    }
}