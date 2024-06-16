package BitMagic.FIndTwoOddAppearingNumbs;

public class FindTwoOddAppearingNumbs {
    public static void main(String[] args) 
    {
        int[] intArr = new int[]{3,4,3,4,5,4,4,6,6,7,7,8};

        int xor = 0, res1 = 0, res2=0;
        for(int i=0;i<intArr.length;i++)
        {
            xor = xor ^ intArr[i];
        }
        int sn = xor & ~(xor-1);

        for(int i=0;i<intArr.length;i++)
        {
            if((intArr[i]&sn)!=0)
                res1 = res1 ^ intArr[i];
            else
                res2 = res2 ^ intArr[i];
        }

        System.err.println("Odd Appearing Numbers Are : "+res1+", "+res2);


    }
}
