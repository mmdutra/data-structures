package sorting_methods.quick_sort;

public class QuickSort {
	
	public static void draw(int[] items) {
		for (int i=0; i<items.length; i++) {
			System.out.print(items[i] + " ");
		}
		System.out.println();
	}
	
	public static void quickSort(int[] items, int start, int end) {
	    if (start >= end) return;

	    int index = partition(items, start, end);
	    quickSort(items, start, index - 1);
	    quickSort(items, index + 1, end);
	}
	
	public static int partition(int[] items, int start, int end) {
	    int pivotIndex = start;
	    int pivotValue = items[end];

	    for (int i = start; i < end; i++) {
	        if (items[i] < pivotValue) {
	            swap(items, i, pivotIndex);
	            pivotIndex++;
	        }
	    }

	    swap(items, pivotIndex, end);

	    return pivotIndex;
	}
	
	public static void swap(int[] items, int a, int b) {
	    int aux = items[a];
	    items[a] = items[b];
	    items[b] = aux;
	}
	
	public static void main(String[] args) {
		int[] items = { 10, 0, 2, 6, 3, 1, 4, 7, 9, 8, 5 };
		
		System.out.println("Before: ");
		draw(items);
		
		quickSort(items, 0, items.length - 1);
		
		System.out.println("After ");
		draw(items);
		
	}
}
