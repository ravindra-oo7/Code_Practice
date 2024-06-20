package Recursion.RopeCuttingProblem;

import java.util.Scanner;

public class RopeCuttingProblem {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Rope Length : ");
        int rope = sc.nextInt();

        System.out.println("Enter pieces length allowed : ");
        System.out.print("Length 1 : ");
        int  p1= sc.nextInt();
        System.out.print("Length 2 : ");
        int  p2= sc.nextInt();
        System.out.print("Length 3 : ");
        int  p3= sc.nextInt();
        
        int pieces = maxPiece(rope, p1, p2, p3);
        if(pieces>0)
            System.out.println("Maximum Pieces we can make : "+pieces);
        else
            System.out.println("Cant Make Pieces");
            

    }

    private static int maxPiece(int rope, int p1, int p2, int p3) 
    {
        if(rope==0) 
            return 0;
        if(rope<0)
            return -1;    
        
        int res = Math.max(
                            Math.max(
                                    maxPiece(rope-p1, p1, p2, p3),
                                    maxPiece(rope-p2, p1, p2, p3)
                                    ),
                                maxPiece(rope-p3, p1, p2, p3)
                          );  

        if(res==-1)
            return -1;
         
        return res+1;    

    }
}
