
public class SortingPr {

	
	public static void main(String[] args) {
		int[] arrayOfNumbers= {7,5,2,9,1};
		insertionSort(arrayOfNumbers);
		//System.out.println("Min Number in the list: "+findMin(arrayOfNumbers));
		System.out.print("Sorted List: ");
		for(int i=0;i<arrayOfNumbers.length;i++) {
			System.out.print((arrayOfNumbers[i])+" , ");
		}
	}
	public static void BubbleSort(int[] arrayOfNumbers) {
		for(int i=0;i<(arrayOfNumbers.length-1);i++) {
			for(int j=0;j<(arrayOfNumbers.length-i-1);j++) {
				if(arrayOfNumbers[j]>arrayOfNumbers[j+1]) {
					int temp=arrayOfNumbers[j];
					arrayOfNumbers[j]=arrayOfNumbers[j+1];
					arrayOfNumbers[j+1]=temp;
					}
			}
		}	
	}
	
	public static void insertionSort(int[] arrayOfNumbers) {
		int j=0;
		for(int i=0;i<(arrayOfNumbers.length-1);i++) {
			int temp=arrayOfNumbers[i+1];
			j=i+1;
			while(j>0 && temp<arrayOfNumbers[j-1] ) {
				arrayOfNumbers[j]=arrayOfNumbers[j-1];
				j--;
			}
			arrayOfNumbers[j]=temp;
		}
	}
	
	public static void selectionSort(int[] arrayOfNumbers) {
		int min=0;
	
		for(int i=0;i<(arrayOfNumbers.length-1);i++) {
			min=i;
			for(int j=i+1;j<(arrayOfNumbers.length);j++) {
				if(arrayOfNumbers[min]>arrayOfNumbers[j]) {
					min=j;
				}
			}
			int temp=arrayOfNumbers[i];
			arrayOfNumbers[i]=arrayOfNumbers[min];
			arrayOfNumbers[min]=temp;
		}
	
	}
}
