import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class RandomNumbGenerator {

    /*

      public static void main(String[] args) 
      {
        System.out.println("1st Random number : "+Math.random());
        System.out.println("1st Random number : "+Math.random());
        System.out.println("1st Random number : "+Math.random());
      }

    */

    /*

      public static void main(String[] args) 
      {
        Double numb = Math.random();
        int numb2 = (int)(numb * 10);
        System.out.println("Generated Random Number : "+ numb2);
      }

     */


    /*

      public static void main(String[] args) 
      {
        Double numb = Math.random();
        Integer numb2 = (Integer)(numb * 10); // not ok
        System.out.println("Generated Random Number : "+ numb2);
      }
      
     */

     /* 
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
 */

    /* 

 //Using Random Class
    public static void main(String[] args) {
        Random random = new Random();
        int i1 = random.nextInt(100); //Generate random int between 0 to 99
        int i2 = random.nextInt(10); //GEnerate random int between 0 to 9

        System.out.println("i1 = " + i1 +"\ni2 = " +i2) ;
        
        double d1 = random.nextDouble();
        double d2 = random.nextDouble();

        System.out.println("d1 = " + d1 +"\nd2 = " +d2) ;

        float f1 = random.nextFloat();
        float f2 = random.nextFloat();

        System.out.println("f1 = " + f1 +"\nf2 = " +f2) ;

        long l1 = random.nextLong();
        long l2 = random.nextLong();

        System.out.println("l1 = " + l1 +"\nl2 = " +l2) ;

        boolean b1 = random.nextBoolean();
        boolean b2 = random.nextBoolean();

        System.out.println("b1 = " + b1 +"\nb2 = " +b2) ;
    }

 */

    /* 
 //Using ThreadLocalRandom Class

public static void main(String[] args) {
    
    int i1 = ThreadLocalRandom.current().nextInt();// -ve values included
    int i2 = ThreadLocalRandom.current().nextInt(100);// 0 to 99
    int i3 = ThreadLocalRandom.current().nextInt(50, 100);//50 to 99

    System.out.println("i1 = "+i1+"\ni2 = "+i2+"\ni3 = "+i3);

    double d1 = ThreadLocalRandom.current().nextDouble();
    double d2 = ThreadLocalRandom.current().nextDouble(100);
    double d3 = ThreadLocalRandom.current().nextDouble(90,100);

    System.out.println("d1 = "+d1+"\nd2 = "+d2+"\nd3 = "+d3);
}
*/


    public static void main(String[] args) {
        randomInts(3, 50, 100);

        Random random2 = new Random();
        random2.ints(4, 44, 55).forEach(System.out::println);
    }

    public static void randomInts(int num,int origin,int bound)
    {
        Random random1 = new Random();
        random1.ints(num, origin, bound).forEach(System.out::println);
    }

}