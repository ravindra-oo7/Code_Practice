package BitMagic.BitwiseOperators;

public class ORopt {
    public static void main(String[] args) 
    {
        int x=3,y=6;
        System.out.println(x|y);
    }
}

/* for 8 bit  Architecture

    x=3 : 0000 0011
    y=6 : 0000 0110
    ----------------
    x&y : 0000 0111 => 4+2+1 =7

    ANS = 7 

*/