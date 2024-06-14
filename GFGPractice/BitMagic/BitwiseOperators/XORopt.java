package BitMagic.BitwiseOperators;

public class XORopt {
    public static void main(String[] args) 
    {
        int x=3,y=6;
        System.out.println(x^y);    
    }
}

/* for 8 bit  Architecture

    x=3 : 0000 0011
    y=6 : 0000 0110
    ----------------
    x^y : 0000 0101 => 4+0+1 =5

    ANS = 5 

*/