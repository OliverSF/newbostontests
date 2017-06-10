package tests;

import java.util.Scanner;

public class QuickSort {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); //Declaring and creating instance of the scanner class
		
		int size;
		
		//Output to console to prompt user
		System.out.println("Please enter the size of the Array: ");
		size = input.nextInt(); //setting user input to variable 'size'
		
		int A[] = new int[size]; //creating array of size 'size'

		populateA(A); // method to populate the Array

		System.out.println("Before sorting: ");
		printA(A); // method to print the array A
		
		quickSort(A); //calling quickSort method and passing A as argument
		
		System.out.println("\nAfter Sorting: ");
		printA(A); //method to print the array A
		
		input.close(); //closing scanner to avoid possible leak
	}

	public static void quickSort(int array[]) {
		// pre: array is full, all elements are non-null integers
		// post: the array is sorted in ascending order
		quickSort(array, 0, array.length - 1); // quicksort all the elements in the array
	}


	public static void quickSort(int array[], int start, int end){
	
	        int i = start; // index of left-to-right scan
	        int k = end; // index of right-to-left scan

	        if (end - start >= 1){ // check that there are at least two elements to sort
	        
	                int pivot = array[start]; // set the pivot as the first element in the partition

	                while (k > i) { // while the scan indices from left and right have not met,
	                	
	                        while (array[i] <= pivot && i <= end && k > i){  // from the left, look for the first
	                                i++;                                    // element greater than the pivot
	                        }
	                        while (array[k] > pivot && k >= start && k >= i){ // from the right, look for the first
	                            k--;                                        // element not greater than the pivot
	                        }
	                        if (k > i){                                       // if the left seekindex is still smaller than
	                                swap(array, i, k);                      // the right index, swap the corresponding elements
	                        }
	                }
	                
	                swap(array, start, k);          // after the indices have crossed, swap the last element in
	                                                // the left partition with the pivot 
	                quickSort(array, start, k - 1); // quicksort the left partition
	                quickSort(array, k + 1, end);   // quicksort the right partition
	        }
	        
	        else    // if there is only one element in the partition, do not do any sorting
	        {
	                return; // the array is sorted, so exit
	        }
	}

	public static void swap(int array[], int index1, int index2){ 
	// pre: array is full and index1, index2 < array.length
	// post: the values at indices 1 and 2 have been swapped
	
		int temp = array[index1];           // store the first value in a temp
		array[index1] = array[index2];      // copy the value of the second into the first
		array[index2] = temp;               // copy the value of the temp into the second
	}
	
	
	
	// method to print the Array
	public static void printA(int[] B) {
		
		//Creating for loop to traverse the Array
		for (int i = 0; i < B.length; i++) {
				System.out.print(B[i] + " "); //Printing out value at index 'i'
		}
	}
		
	// method to populate the Array 'A'
	public static int[] populateA(int[] B) {
		
		Scanner input2 = new Scanner(System.in); //Declaring and creating instance of the scanner class
		
		//Output to console to prompt user
		System.out.println("Please enter the numbers in your Array: ");
		
		//Creating for loop to populate the array
		for (int i = 0; i < B.length; i++) {
			
			//setting Array at index 'i' to user input
			B[i] = (int) (input2.nextInt());
		}
		input2.close(); //close input to avoid possible leak
		return B; //return populated array
	}

}