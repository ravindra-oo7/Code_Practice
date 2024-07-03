package Arrays.TrappingRainWater;

public class TrappingRainWater {
    public static void main(String[] args) 
    {
        //int[] rainArr = {3,0,1,2,5}; //OP = 6 
        //int[] rainArr = {3,5,2,3}; //OP = 1
        int[] rainArr = {3,0,1,2,5,0,1}; // OP = 7

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
        
        System.out.println("Water Trapped : "+water);
    }
}
