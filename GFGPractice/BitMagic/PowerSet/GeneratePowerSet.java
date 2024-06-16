package BitMagic.PowerSet;

public class GeneratePowerSet {
    public static void main(String[] args) 
    {
        String str = "abc";//String should be without reapeting chars
        
        int strLength = str.length();//3
        int setSize = (int)Math.pow(2,strLength);//8
        
        for(int counter=0 ; counter<setSize ; counter++)
        {
            for(int j=0;j<strLength;j++)
            {
                if((counter& (1<<j))!=0)
                {
                    System.out.print(str.charAt(j));
                }
            }
            System.out.print("\n");

             
        }
    }
}
