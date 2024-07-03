package Arrays.StockBuyAndSell;

public class StockBuySell {
    public static void main(String[] args) 
    {
       int[] arr = {1,5,3,1,2,8,9}; // OP : 12
       //int[] arr = {1,5,3,8,12}; // OP : 13

/* 
    //Approch-01
        int maxProf = 0;
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i+1]<arr[i])
            {  
                continue;
            }
            else 
            {
                for(int j=i+1;j<arr.length;j++)
                {
                    if( (j==arr.length-1 || arr[j]>arr[j+1]))
                    {
                        
                            System.out.println("arr[" +j+ "] -"+"arr[" +i+ "]");
                            System.out.println("profit : " + (arr[j]-arr[i]));
                            maxProf = maxProf+(arr[j]-arr[i]);  
                            i=j+1;  
                            break;                    
                    }
                   
                }
            }

        }
        System.out.println("Maximum Profit : "+maxProf );
*/

    //Approach-02
    
        int maxProf = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                maxProf += arr[i] - arr[i - 1];
            }
        }

        System.out.println("Maximum Profit : " + maxProf);

    }
}
