
public class HeapSort {

	public static void main(String[] args) {
		int[] arrayOfNumbers= {5,-12,7,1,9,45,2,5,3,9,6,0};
		System.out.print("Unsorted List: ");
		for(int i=0;i<arrayOfNumbers.length;i++) {
			System.out.print((arrayOfNumbers[i])+" ");
		}
		heapSort(arrayOfNumbers);
		System.out.println();
		System.out.print("Sorted List: ");
		for(int i=0;i<arrayOfNumbers.length;i++) {
			System.out.print((arrayOfNumbers[i])+" ");
		}
	}
	
	public static void heapify(int[] arr,int arr_length,int index) {
		int leftIndex=left_child(index);
		int rightIndex=right_child(index);
		int largest=index;
		if(leftIndex<arr_length && arr[leftIndex]>arr[index])
		{
			largest=leftIndex;
		}
		if(rightIndex<arr_length && arr[rightIndex]>arr[largest])
		{
			largest=rightIndex;
		}
		
		if(index!=largest) {
			int temp=arr[index];
			arr[index]=arr[largest];
			arr[largest]=temp;
			heapify(arr,arr_length,largest);
		}
	}
	public static void heapSort(int[] arr) {
		int arr_length=arr.length;
		//Start heapifying from the first index of non-leaf node, which is (arr_length/2-1)
		//This loop will bring the largest integer to the top, and 
		for(int i=arr_length/2-1;i>=0;i--) {
			heapify(arr,arr_length,i);
		}
		
		//Remove the root element and put at the end of the array (nth position) 
		//Put the last item of the tree (heap) at the vacant place.
		//Reduce the size of the heap by 1 and heapify the root element again 
		//so that we have highest element at root.
		for(int i=arr_length-1;i>=0;i--) {
			int temp=arr[i];
			arr[i]=arr[0];
			arr[0]=temp;
			//heapify all elements except the one at the top, start heapifying from root node
			heapify(arr,i,0); 
		}
		
		
	}
	
	public static int left_child(int index) {
		return 2*index+1;
	}
	public static int right_child(int index) {
		return 2*index+2;
	}
}
