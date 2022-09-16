package lab1_arrays.task1;

import java.util.Arrays;

public class Task1 {
	private int[] array;

	public Task1(int[] array) {
		this.array = array;
	}

	// Count the number of odd numbers in the array
	public int countOddNumbers() {
		int count =0;
		for (int i = 0; i < array.length; i++) {
			if(array[i]%2==1) {
				count++;
			}
		}
		return count;
	}

	// get the index of the second even number in the array return -1 (if not)
	public int indexOfSecondEvenNumber() {
		 int count =0;
		 int result =-1;
		for (int i = 0; i < array.length; i++) {
			if(array[i]%2==0) {
				count++;
				if(count==2) {
					result=i;
				}
			}
		}
		return result;
		
	}

	// Method mirror that outputs the contents of an array in a reverse 	//order like a mirror 
	//Example: input [1, 2, 3] ==> output: [1, 2, 3, 3, 2, 1]


	public int[] mirror() {
		int[] result = new int[array.length*2];
		for (int i = 0; i < array.length; i++) {
			result[i]=array[i];
			result[result.length-1-i]=array[i];
		}
		return result;
	}
	public static int count(int[] array,int n) {
		int count =0;
		for (int i = 0; i < array.length; i++) {
			if(array[i]==n) {
				count++;
			}
		}
		return count;
	}
	// GET the element which its occurence is the most in the array.
	// Input: int[] array = {12, 10, 9, 45, 2, 10, 10, 45}
	// Output: 10
	public int getMode() {
		int max =1;
		int result =0;
		for (int i = 0; i < array.length; i++) {
			if(count(array,array[i])>max) {
				max = count(array,array[i]);
				result=array[i];
			}
		}
		return result;
	}

	// GET unique elements in the array.
	// Input: int[] array = {12, 10, 9, 45, 2, 10, 10, 45}
	// Output: 12, 9, 2
	public int[] getUniqueElements() {
		int count =0;
		for (int i = 0; i < array.length; i++) {
			if(count(array,array[i])==1) {
				count++;
			}
		}
		int[] result = new int[count];
		int j =0;
		for (int i = 0; i < array.length; i++) {
			if(count(array,array[i])==1) {
				result[j]=array[i];
				j++;
			}
		}
		return result;
	}
	public static boolean isDuplicated(int[] array,int index) {
		boolean result = false;
		for (int i = index; i>0; i--) {
			if(array[index]==array[i-1]) {
				result=true;
			}
			
		}
		return result;
	}
	// GET distinct elements in the array.
	// Input: int[] array = {12, 10, 9, 45, 2, 10, 10, 45}
	// Output: 12, 10, 9, 45, 2
	public int[] getDistinctElements() {
		
		int[] result = new int[array.length];
		int j =0;
		for (int i = 0; i < array.length; i++) {
			if(!(isDuplicated(array, i))) {
				result[j]=array[i];
				j++;
		}
	}
	return new Task1(result).getUniqueElements();
	}

	public static void display() {
		System.out.println("ABC");
	}
	public static void main(String[] args) {
		int[] array= {12, 10, 9, 45, 2, 10, 10, 45};
		Task1 a = new Task1(array);
		System.out.println(a.countOddNumbers());
		System.out.println(a.indexOfSecondEvenNumber());
		System.out.println(Arrays.toString(a.mirror()));
		System.out.println(a.getMode());
		System.out.println(Arrays.toString(a.getUniqueElements()));
		System.out.println(Arrays.toString(a.getDistinctElements()));
	}
}
