
public class Sorting {
	
	public static void BubbleSort(int[] arrayOfNumbers) {
		for(int i=0;i<arrayOfNumbers.length-1;i++) {
			//j is going till (arrayOfNumbers.length-i-1) because the left most element is fixed
			for(int j=0;j<arrayOfNumbers.length-i-1;j++) {
				if(arrayOfNumbers[j]>arrayOfNumbers[j+1]) {
					int temp=arrayOfNumbers[j];
					arrayOfNumbers[j]=arrayOfNumbers[j+1];
					arrayOfNumbers[j+1]=temp;
					//SwapMethod(arrayOfNumbers[j],arrayOfNumbers[j+1]);
				}				
			}                                                           
		}
	}
	
	public static int findMin(int[] arrayOfNumbers) {
		int min=arrayOfNumbers[0];
		for(int i=1;i<arrayOfNumbers.length;i++) {
			if(min>arrayOfNumbers[i])
				min=arrayOfNumbers[i];
		}
		return min;
	}
	//Find the smallest number and swap it with the left most element of the left sorted list
	public static void SelectionSort(int[] arrayOfNumbers) {
		int N=arrayOfNumbers.length;
		int min_index=0;
		for(int i=0;i<N-1;i++) {
			min_index=i;
			for(int j=i+1;j<N;j++) {
				if(arrayOfNumbers[min_index]>arrayOfNumbers[j])
					min_index=j;
			}
			int temp=arrayOfNumbers[i];
			arrayOfNumbers[i]=arrayOfNumbers[min_index];
			arrayOfNumbers[min_index]=temp;
		}
	}
	
	//Keep the left elements always sorted, insert each new element in the list in the sorted left most array 
	public static void InsertionSort(int[] arrayOfNumbers) {
		int N=arrayOfNumbers.length;
		int j=0;
		int temp=0; 
		
		for(int i=0;i<N-1;i++) {
			j=i+1;
			temp=arrayOfNumbers[j];
			while(j>0 && temp<arrayOfNumbers[j-1]) {
				arrayOfNumbers[j]=arrayOfNumbers[j-1];
				j--;				
			}
			
			arrayOfNumbers[j]=temp;
			
		}
	}
	
	public static void mergeSort(int[] arrayOfNumbers) {
		
		MergeSortR(arrayOfNumbers,0,arrayOfNumbers.length-1);
		
	}
	public static void MergeSortR(int[] arrayOfNumbers,int start,int end) {
		if(start<end) {
			int middle=(int) Math.floor((start+end)/2);
			MergeSortR(arrayOfNumbers,start,middle);
			MergeSortR(arrayOfNumbers,middle+1,end);
			merge(arrayOfNumbers,start,middle,end);
		}
		
	}
	
	
	public static void merge(int[] arrayOfNumbers,int start,int middle,int end) {
		int length_array_left=middle-start+1;
		int length_array_right=end-middle;
		int[] array_left=new int[length_array_left];
		int[] array_right=new int[length_array_right];
		for(int i=0;i<length_array_left;i++) {
			array_left[i]=arrayOfNumbers[start+i];
		}
		
		for(int i=0;i<length_array_right;i++) {
			array_right[i]=arrayOfNumbers[middle+1+i];
		}
		int j=0;
		int k=0;
		for(int i=start;i<=end;i++) {
			
			if(j>=length_array_right || (k<length_array_left && array_left[k]<array_right[j]) ) {
				arrayOfNumbers[i]=array_left[k];
				k++;
			}
			else {
				arrayOfNumbers[i]=array_right[j];
				j++;
			}
		}
		
	}
	
	
	public static void SwapMethod(int x,int y) {	
		int temp=x;
		x=y;
		y=temp;
	}
	public static void main(String[] args) {
		int[] arrayOfNumbers= {5,12,7,1,9,45,2,5,3,9,6};
		System.out.print("Unsorted List: ");
		for(int i=0;i<arrayOfNumbers.length;i++) {
			System.out.print((arrayOfNumbers[i])+" ");
		}
		System.out.println();
		//BubbleSort(arrayOfNumbers);
		//SelectionSort(arrayOfNumbers);
		//InsertionSort(arrayOfNumbers);
		mergeSort(arrayOfNumbers);
		System.out.println("Min Number in the list: "+findMin(arrayOfNumbers));
		System.out.print("Sorted List: ");
		for(int i=0;i<arrayOfNumbers.length;i++) {
			System.out.print((arrayOfNumbers[i])+" ");
		}
	}
	

}
   