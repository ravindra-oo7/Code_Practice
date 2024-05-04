import java.util.Scanner;

public class PrimeNumb {

    public static void isPrime(int num) {
        boolean flag = true;
        if (num > 2) {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    flag=false;
                    System.out.println("Not a Prime Number");
                    break;
                } else {
                    flag = true;
                }
            }
        }
        if (flag) {
            System.out.println("Prime Number !!!");
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter Number to check if it is Prime :");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        if (num1 <2) {
            System.out.println("Prime Number Start from 2");
        } else if (num1==2) {
            System.out.println("Prime number!!");

        } else {
            isPrime(num1);

        }
    }
}


/* 

// code from javaTPoint
 public class PrimeNumb{    
    public static void main(String args[]){    
     int i,m=0,flag=0;      
     int n=5;//it is the number to be checked    
     m=n/2;      
     if(n==0||n==1){  
      System.out.println(n+" is not prime number");      
     }else{  
      for(i=2;i<=m;i++){      
       if(n%i==0){      
        System.out.println(n+" is not prime number");      
        flag=1;      
        break;      
       }      
      }      
      if(flag==0)  { System.out.println(n+" is prime number"); }  
     }//end of else  
   }    
   }   

 */