package Arrays.TrappingRainWater;

public class TrappingRainWater {
    public static void main(String[] args) 
    {
        //int[] rainArr = {3,0,1,2,5}; //OP = 6 
        //int[] rainArr = {3,5,2,3}; //OP = 1
        //int[] rainArr = {3,0,1,2,5,0,1}; // OP = 7
        int[] rainArr = {0,5,2,3,6}; //OP = 5

/* 
    //Approach-01
        int water = 0;
        for(int i=1;i<rainArr.length;i++)
        {
            int lMax = rainArr[i];
            for(int j=0;j<i;j++)
            {
                lMax = Math.max(lMax, rainArr[j]);
            }

            int rMax = rainArr[i];
            for(int j=i+1;j<rainArr.length;j++)
            {   
                rMax = Math.max(rMax,rainArr[j]);
            }

            water = water +(Math.min(lMax,rMax)-rainArr[i]);
        }    
        
*/
    // Approach-02
        int water = 0;
        int len = rainArr.length;
        int[] lMax = new int[len];
        int[] rMax = new int[len];

        // setting lMax 
        lMax[0] = rainArr[0];
        for(int i=1;i<len;i++)
        {
            lMax[i] = Math.max(lMax[i-1], rainArr[i]);
        }

        // Setting rMax
        rMax[len-1] = rainArr[len-1];
        for(int i=len-2;i>=0;i--)
        {
            rMax[i] = Math.max(rMax[i+1], rainArr[i]);
        }
        
        for(int i=1;i<len-1;i++)
        {
            water = water + (Math.min(lMax[i],rMax[i])-rainArr[i]);
        }

        System.out.println("Water Trapped : "+water);
    }
}
