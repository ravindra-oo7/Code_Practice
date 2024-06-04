package Java8Codes.O04FindAge;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class FindAge {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your BirthDate (YYYY-MM-DD) : ");
        String dobString = sc.next();

        LocalDate birthDate = LocalDate.parse(dobString);
        LocalDate currentDate = LocalDate.now();

        Period age = Period.between(birthDate, currentDate);

        System.out.println("Todays Date : "+currentDate);
        System.out.println("You are "+age.getYears()+" years "+age.getMonths()+ " months "+age.getDays()+" days old.");
    }
}
