package BitMagic.BitwiseOperators;
 
public class LeftShiftRightShiftOpt {
    public static void main(String[] args) 
    {
        int x=-5;
        System.out.println("After Left Shift by 1 : "+(x<<1));
        System.out.println("After Left Shift by 2 : "+(x<<2));

        System.out.println("After Right Shift by 1 : "+(x>>1));
        System.out.println("After Right Shift by 2 : "+(x>>2));
    }
}

/* for 8 bit Architecture

  x = 5 : 0000 0101

  x<<1  : 0000 1010 => 8+0+2+0 = 10

  x<<2  : 0001 0100 => 16+0+4+0+0 = 20

  x>>1  : 0000 0010 => 2+0 =2

  x>>2  : 0000 0001 => 1

 
*/