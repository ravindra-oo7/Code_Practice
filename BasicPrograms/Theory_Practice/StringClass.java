package Theory_Practice;

public class StringClass {
    public static void main(String[] args) {
        String s1 = "ravindra";

        String s2 = "ravindra";
    
    System.err.println(s1==s2);

    System.out.println(s1.equals(s2));

    StringBuffer strbuff = new StringBuffer("HEllo");
    strbuff.append(s2);

    StringBuilder strbld=new StringBuilder("I am ");

    strbld.append(s2);

    }
}
