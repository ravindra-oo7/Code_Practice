package BitMagic.BitwiseOperators;

public class UnsignedRightShift 
{
    public static void main(String[] args) 
    {
        int x=-5;
        System.out.println("After Left Shift by 1 : "+(x<<1));//x<<<1 is not possible
        System.out.println("After Left Shift by 2 : "+(x<<2));

        System.out.println("After Right Shift by 1 : "+(x>>1));
        System.out.println("After Right Shift by 1 : "+(x>>>1));// OK

        System.out.println("After Right Shift by 2 : "+(x>>2));
        System.out.println("After Right Shift by 2 : "+(x>>>2));// OK

    }
}

/* for 8 bit Architecture

  x = 5 : 0000 0101 
  conversion to -5
   0000 0101 => 1111 1010 +1 (2's compliment)
                1111 1011 = -5

  x =-5 : 1111 1011 

  x<<1  : 1111 0110 => -10

  x<<2  : 0001 0100 => -20

  x>>1  : 1111 1101 => (-5-(-2)) = -3
  x>>>1 : 0111 1110 => negative changed to positive

  x>>2  : 1111 1110 => (-5-(-3)) = -2
  x>>>2 : 0011 1111 => negative changed to positive

 
*/