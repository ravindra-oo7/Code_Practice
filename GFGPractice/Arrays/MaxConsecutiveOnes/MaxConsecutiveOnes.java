package Arrays.MaxConsecutiveOnes;

public class MaxConsecutiveOnes {
    public static void main(String[] args) 
    {
        //int[] arr = {0,1,1,0,1,0,1,1,1,1,0,1,1,1};
        //int[] arr = {};
        int[] arr = {0,0,0};

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
    }
}
