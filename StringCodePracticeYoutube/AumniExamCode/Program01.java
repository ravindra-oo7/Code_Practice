package AumniExamCode;
import java.util.ArrayList;
import java.util.Scanner;

public class Program01 {
    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);
        ArrayList<Integer> arrList = new ArrayList<>();
        Integer numb;

        do {
            numb = sc.nextInt();
            if(numb>=0)
            {
                arrList.add(numb);
            }
            
        } while (numb>=0);

        int arrayLength = arrList.size();
        Integer[] array = new Integer[arrayLength] ;

        for (int i=0;i<arrList.size();i++) {

            array[i] = arrList.get(i);
        }

        processArray(array);     
        sc.close();
    }

    public static void processArray(Integer[] array ) 
    {

        for(int j=0; j<array.length;j++)
        {
            if((array[j]%9)==0 && array[j]<54)
            {
                array[j]=-5;
            }
            else if(array[j]%9==0)
            {
                array[j]=-3;

            }else if (array[j]<54) 
            {
                array[j]=-9;

            }else
            {
            }

            System.out.println(array[j]);
        } 
    }    
}
