public class ArrayCompare {
    public static void main(String[] args) {

        int[] arr1 = { 1, 2, 3, 4};
        int[] arr2 = { 1, 2, 3,4,5,6 };

        int len1 = arr1.length;
        int len2 = arr2.length;

        boolean flag=false ;

        if (len1 == len2) {
            flag=true;
            for (int i = 0; i < len1; i++) {
                if (arr1[i] != arr2[i]) {
                    flag = false;
                    break;
                }
            }
        }

        if (flag) 
        {
            System.out.println(" Array1 and Array2 are equal");
        } 
        else 
        {
            System.err.println(" Array1 and Array2 are  NOT equal");
        }

    }
}
