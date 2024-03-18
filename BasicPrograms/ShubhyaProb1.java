// public class ShubhyaProb1 {
//     public static void main(String[] args) {
//         int[] Arr = { 1, 2, 3, 5, 1, 2, 1, 1, 1 };

//         int[] Arr2 = new int[Arr.length];

//         for (int i = 0; i < Arr.length; i++) 
//         {
//             int count = 1;

//             for(int k=0;k<Arr2.length;k++){

//                 if(Arr[i]==Arr2[k])
//                 {
//                     break;
//                 }
//                 else
//                 {
//                     for (int j = i + 1; j < Arr.length; j++) 
//                     {
//                         if (Arr[i] == Arr[j]) 
//                         {
//                             count++;
//                         }
//                     }

//                 }
//             }

//             if (count > 1 && Arr2[i] != -1) 
//             { 
                
//                 System.out.println(Arr[i] + " Duplicate occurrence : " + count);

//                 Arr2[i] = Arr[i];
//             }
//         }
//     }
// }


public class ShubhyaProb1 {
    public static void main(String[] args) 
    {
        int[] Arr = { 1, 2, 3, 5, 1, 2, 1, 1, 1 };

        for (int i = 0; i < Arr.length; i++) 
        {
            int count = 1;

            for (int j = i + 1; j < Arr.length; j++) 
            {
                if (Arr[i] == Arr[j]) 
                {
                    count++;
                    Arr[j] = -1; 
                }
            }

            if (count > 1 && Arr[i] != -1) 
            { 
                System.out.println(Arr[i] + " Duplicate occurrence : " + count);
            }
        }
    }
}

