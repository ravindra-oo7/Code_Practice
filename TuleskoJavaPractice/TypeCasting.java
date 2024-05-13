public class TypeCasting {
    public static void main(String[] args) {

        byte b1=127;
        int i1=b1;//byte n
        System.out.println(i1);

        int a=258;//258%256=2 256(range)
        
        byte b=(byte)a;// converting /Typecasting int into byte
        System.out.println(b);
    }
}
