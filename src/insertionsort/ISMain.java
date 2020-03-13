package insertionsort;

import java.util.Arrays;

public class ISMain {

	
	//https://www.geeksforgeeks.org/insertion-sort/
	/*Function to sort array using insertion sort*/
    public static void sort(int arr[]) 
    { 
        int n = arr.length; 
        for (int i = 1; i < n; ++i) { 
            int key = arr[i]; 
            int j = i - 1; 
  
            /* Move elements of arr[0..i-1], that are 
               greater than key, to one position ahead 
               of their current position */
            while (j >= 0 && arr[j] > key) { 
                arr[j + 1] = arr[j]; 
                j = j - 1; 
            } 
            arr[j + 1] = key; 
        } 
    } 	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] {6, 5, 3, 1, 8, 7, 2, 4};
		/*
		for(int el: arr) {
			System.out.println(el);
		}
		*/

		System.out.println(Arrays.toString(arr));
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}

}
