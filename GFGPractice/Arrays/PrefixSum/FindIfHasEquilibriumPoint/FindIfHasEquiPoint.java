package Arrays.PrefixSum.FindIfHasEquilibriumPoint;

public class FindIfHasEquiPoint {
    public static void main(String[] args) 
    {
        int[] arr = {3,4,8,-9,20,6}; // Ans = Yes    20
        //int[] arr = {4,2,-2}; // Yes 4
        //int[] arr = {4,2,2}; // NO
        boolean hasEquiPoint= false;

/* 
        // Approach-01
        for(int i = 0;i<arr.length;i++)
        {
            int leftSum=0;
            int rightSum=0; 

            for(int j=0;j<i;j++)
            {
                leftSum+=arr[j];
            }

            for(int j=i+1;j<arr.length;j++)
            {
                rightSum+=arr[j];
            }

            System.out.println("LeftSum : "+leftSum);
            System.out.println("RightSum : "+rightSum);
            if(leftSum==rightSum)
            {
                hasEquiPoint=true;
                break;
            }
        }

*/      

        //Approach-02 Prefix Sum Method

        int sum = 0;
        for(int i=0; i<arr.length;i++)
        {
            sum=sum+arr[i];
        }

        int leftSum = 0;
        for(int i=0;i<arr.length;i++)
        {
            if(leftSum==sum-arr[i])
            {
                hasEquiPoint=true;
                System.out.println("Equilibrium Point : "+ arr[i]);
                break;
            }
            leftSum = leftSum + arr[i];
            sum=sum-arr[i];
        }

        if (hasEquiPoint) 
            System.out.println("Array has Equilibrium Point");
        else 
            System.out.println("Dont have Equilibrium Point ");

    }
}
