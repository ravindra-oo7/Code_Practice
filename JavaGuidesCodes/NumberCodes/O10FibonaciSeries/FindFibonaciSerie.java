package NumberCodes.O10FibonaciSeries;

import java.util.Scanner;

public class FindFibonaciSerie {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter Upper Limit : ");
        int upLim = sc.nextInt();

        int firstNumb = 0;
        int nextNumb = 1;
        System.out.print("Fibonacci Series : "+firstNumb+", "+nextNumb+", ");

        do
        {
            int temp = nextNumb;
            nextNumb = firstNumb+nextNumb;
            firstNumb = temp;
            if(nextNumb<upLim)
            {
                System.out.print(nextNumb+", ");
            }    
        }
        while(nextNumb<upLim);

    }
}
