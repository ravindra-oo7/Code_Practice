package Arrays.MaxConsecutiveOnes;

public class MaxConsecutiveOnes {
    public static void main(String[] args) 
    {
        int[] arr = {0,1,1,0,1,0,1,1,1,1,0,1,1,1}; // Ans : 4
        //int[] arr = {};
        //int[] arr = {0,0,0};

/*         
    // Approach-01
        int max=0;
        int i=0;
        int counter=0;

        while( i<arr.length)
        {
            if(arr[i]==1)
            {
                counter++;
            }

            if((i==arr.length-1 || arr[i+1]!=0) && counter>max)
            {
                max =counter;
                counter=0;
            }
            i++;
        }
        System.out.println("Ans : "+max);
*/


    // Approach-02
        int res = 0;
        int len = arr.length;

        for(int i=0;i<len;i++)
        {
            int curr = 0;
            for(int j=i;j<len;j++)
            {
                if(arr[j]==1)
                {
                    curr++;
                }
                else
                {
                    break;
                }
            }
            res = Math.max(curr, res);
        }
        System.out.println("Ans : "+res);
    }
}
