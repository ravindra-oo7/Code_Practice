import java.util.Scanner;

public class RandomNumbGenerator {

    /*
     * public static void main(String[] args) {
     * System.out.println("1st Random number : "+Math.random());
     * System.out.println("1st Random number : "+Math.random());
     * System.out.println("1st Random number : "+Math.random());
     * }
     */

    /*
     * public static void main(String[] args) {
     * Double numb = Math.random();
     * int numb2 = (int)(numb * 10);
     * System.out.println("Generated Random Number : "+ numb2);
     * }
     */
    /*
     * public static void main(String[] args) {
     * Double numb = Math.random();
     * Integer numb2 = (Integer)(numb * 10); // not ok
     * System.out.println("Generated Random Number : "+ numb2);
     * }
     * 
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int lowerlimit,upperlimit;
        do {

            System.out.println("Enter Valid limits !!!");
            System.out.print("Enter Lower Limit : ");
             lowerlimit = sc.nextInt();
    
            System.out.print("Enter upper Limit : ");
             upperlimit = sc.nextInt();
        } while (upperlimit<lowerlimit || lowerlimit<0 || upperlimit<1);

        generateRandom(lowerlimit, upperlimit);
        sc.close();
    }
    public static void generateRandom(int lowlim,int uplim)
    {
        int numb ;

       do {        
           
        numb = (int) (Math.random()*(uplim-lowlim+1))+ lowlim;

       } while (numb<lowlim || numb>uplim); 
        
    System.out.println(numb);

    }

}