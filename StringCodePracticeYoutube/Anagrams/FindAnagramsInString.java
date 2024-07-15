package Anagrams;

import java.util.Arrays;

public class FindAnagramsInString {
    public static void main(String[] args) 
    {
        String str = "aababbaabba";
        int strLen = str.length(); //10
        String pattrn = "bba"; //Ans = 4;
        int ptrnLen = pattrn.length(); //3
        
    // Approch-01
        int count = 0;

        for(int i=0;i<=strLen-ptrnLen;i++) //10-3=7
        {
            String temp = str.substring(i, i+3);

            char[] tempSort = temp.toCharArray(); 
            Arrays.sort(tempSort);

            char[] ptrnSort = pattrn.toCharArray();
            Arrays.sort(ptrnSort);

            if(Arrays.equals(tempSort,ptrnSort))
            {
                count++;
            }
        }
        System.out.println("Anagrams of "+pattrn+" found : "+count);

    }
}
