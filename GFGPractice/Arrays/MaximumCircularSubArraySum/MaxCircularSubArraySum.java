package Arrays.MaximumCircularSubArraySum;

public class MaxCircularSubArraySum {
    public static void main(String[] args) 
    {
        //int[] arr = {10,5,-5}; // Max = 15
        //int[] arr = {5,-2,3,4}; // Max = 12
        //int[] arr = {8,-4,3,-5,4}; // Max = 12
        int[] arr = {3,-4,5,7,-8,7}; // Max = 18


     // Approach-01
        int max = arr[0];
        int endMax = arr[0];
        int counter = 0;

        for(int i=1;i<arr.length;i++)
        { 
            counter++; // to calculate maximum iterations
           
            endMax = endMax + arr[i];
            endMax = Math.max(endMax, arr[i]);
            max = Math.max(endMax, max);

            if(max>endMax)
            {
                counter = 0;
                endMax = 0;
                continue;
            }

            if(i==arr.length-1  && counter<arr.length)
            {
                i=-1;
            }
        }

        System.out.println("Max : "+max);


        
    }
}
