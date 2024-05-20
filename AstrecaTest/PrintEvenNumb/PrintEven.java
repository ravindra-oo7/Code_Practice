package PrintEvenNumb;

import java.util.Stack;

public class PrintEven {
    public static void main(String[] args) {
        
    
	int [] array = {1,2,3,4,5,6,7,8,9};
	
	printEnvenArray(array);
	
	}

	public static void printEnvenArray( int [] arr)
	{
		Stack <Integer> st = new Stack<>();

		for(int i=0;i<arr.length;i++){
		
			if(arr[i]%2==0)
			{
				st.push(arr[i]);
			}
		}
		
        // //Print Stack Elements in Entered Sequence
		// for (Object e : st) 
        // {            
        //     System.out.print(e);
        // }

        
        //Print Stack Elements in Oposite sequence
        while (!st.isEmpty()) 
        {
            System.out.print(st.pop() + " ");
        } 
       

	}

}
