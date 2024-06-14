package BitMagic.BitwiseOperators;

public class NOTopt {
    public static void main(String[] args) 
    {
        int x=5;
        System.out.println(~x);
    }
}

/* for 8 bit  Architecture

    x=1 : 0000 0101 
    ----------------
    ~x  : 1111 1010 

    ANS = -6

*/