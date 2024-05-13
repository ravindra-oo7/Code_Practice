public class DataTypes {
    public static void main(String[] args) 
    {
        int num= 22222;
        System.out.println(num);
      
       // byte btmax2= 128;//Error maxlimit = 127       
        byte btMax = 127;//max
        System.out.println(btMax);
        byte btMin = -128;//min       
        System.out.println(btMin);

        short sh=1232;
        System.out.println(sh);

        long lg =1231 ;//for long values we should place l after value
        long lg1=12332l;
        System.out.println(lg);
        System.out.println(lg1);

        //float f1=5.8; //Error by default 5.8 will be considered as double
        float f1=5.8f;//ok
        System.out.println(f1);
        
        double dbl1=5.558;//ok by default all floating points are of double type
        System.out.println(dbl1);

        char c1='k';//ok
        //char c2= "h";//not ok
        //char c3= 'kk';//not ok
        System.out.println(c1);

        boolean bool=true;
       // boolean bool2=1;//not ok
        System.out.println(bool);


    }
}
