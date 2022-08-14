package Algo;

import java.util.Arrays;
import java.util.Scanner;

public class Algo {
	private int x;
	
	public Algo() {
		
	}
	
	
	public void Search() {
		System.out.println("Please select the searching algorithm you want\n1. Linear Search\n2. Binary search\n");
		Scanner in = new Scanner(System.in);
		int select = in.nextInt();
		if(select == 1) {
			LinearSearch();
		}
		if(select == 2) {
			BinarySearch();
		}
	}
	
	
	public void LinearSearch() {
		System.out.println("Please insert the number you want to search");
		Scanner nm = new Scanner(System.in);
		int lin = nm.nextInt();
		
		int[] arr = {1,2,4,8,3,6,9,7,0};
		for(int i=0; i < arr.length; i++ ) {
			if(arr[i] == lin ) {
				x = 1 ;
			}
		}
		if(x == 1) {
				System.out.println("Number found");
			}else {
				System.out.println("Number not found");
			}
		}

	
	public int Bsearch(int arr[], int l, int r, int x) {
		if (r >= l) {
            int mid = l + (r - l) / 2;
 
            // If the element is present at the
            // middle itself
            if (arr[mid] == x)
                return mid;
 
            // If element is smaller than mid, then
            // it can only be present in left subarray
            if (arr[mid] > x)
                return Bsearch(arr, l, mid - 1, x);
 
            // Else the element can only be present
            // in right subarray
            return Bsearch(arr, mid + 1, r, x);
        }
 
        // We reach here when element is not present
        // in array
        return -1;
	}

	public void BinarySearch() {
		System.out.println("Please insert the number you want to search");
		Scanner nm = new Scanner(System.in);
		int lin = nm.nextInt();
		int[] arr = {0,1,2,3,4,5,6,7,8,9};
	    int n = arr.length;
	    int x = 10;
	    int result = Bsearch(arr, 0, n - 1, lin);
	        if (result == -1)
	            System.out.println("Element not present");
	        else
	            System.out.println("Element found");
	    
	}		
	
	
	
	public void Sort() {
		System.out.println("Please select the sorting algorithm you want\n1. Selection sort\n2. Merge sort\n3. Bubble sort\n4. Insertion sort\n5. Quick sort\n6. Heap sort");
		Scanner in = new Scanner(System.in);
		int select = in.nextInt();
		if(select == 1) {
			SelectionSort();
		}
		if(select == 2) {
			MsortRun();
		}
		if(select == 3) {
			Bsort();
		}
		if(select == 4) {
			insertionSort();
		}
		if(select == 5) {
			QSort();
		}if(select == 6) {
			Hsort();
		}
	}


	public void SelectionSort() {
		int[] arr = {57,78, 65,54,35,13};
		for(int i = 0; i < arr.length - 1; i++) {
			int min = i;
			for(int j = i + 1; j < arr.length; j++) {
				min = j;
				int temp = arr[min];
				arr[min] = arr[i];
				arr[i] = temp;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	
	
	public void MergeSort(int[] arr, int l, int m, int r) {
		int n1 = m - l + 1;
        int n2 = r - m;
 
        /* Create temp arrays */
        int L[] = new int[n1];
        int R[] = new int[n2];
 
        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];
 
        /* Merge the temp arrays */
 
        // Initial indexes of first and second subarrays
        int i = 0, j = 0;
 
        // Initial index of merged subarray array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
 
        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
 
        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
    void Msort(int arr[], int l, int r)
    {
    	 if (l < r) {
             // Find the middle point
             int m =l+ (r-l)/2;
  
             // Sort first and second halves
             Msort(arr, l, m);
             Msort(arr, m + 1, r);          
             MergeSort(arr, l, m, r);
    	 }
    }
    public void MsortRun() {
    	int arr[] = { 12, 11, 13, 5, 6, 7 };
    	Msort(arr, 0, arr.length-1);
    	System.out.println(Arrays.toString(arr));
    }
	  
	
	
	
	static void swap(int[] arr, int i, int j)
	{
	    int temp = arr[i];
	    arr[i] = arr[j];
	    arr[j] = temp;
	}
	static int partition(int[] arr, int low, int high)
	{
	      
	    // pivot
	    int pivot = arr[high]; 
	      
	    int i = (low - 1); 
	  
	    for(int j = low; j <= high - 1; j++)
	    {
	          
	        if (arr[j] < pivot) 
	        {
	            i++; 
	            swap(arr, i, j);
	        }
	    }
	    swap(arr, i + 1, high);
	    return (i + 1);
	}
	static void quickSort(int[] arr, int low, int high)
	{
	    if (low < high) 
	    {
	          
	        int pi = partition(arr, low, high);
	        quickSort(arr, low, pi - 1);
	        quickSort(arr, pi + 1, high);
	    }
	}
	
	public void QSort() {
	    int[] arr = { 10, 7, 8, 9, 1, 5 };
	    int n = arr.length;
	    quickSort(arr, 0, n - 1);
	    System.out.println(Arrays.toString(arr));
	}
	  
	
	
	public void inSort(int arr[]) {
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
	public void insertionSort() {
		int arr[] = { 12, 11, 13, 5, 6 };
		inSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	void bubbleSort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                   
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }
	public void Bsort() {
		int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));		
	}
	
	
	
	  public void Heapsort(int arr[])
	    {
	        int N = arr.length;
	 
	        // Build heap (rearrange array)
	        for (int i = N / 2 - 1; i >= 0; i--)
	            heapify(arr, N, i);
	 
	        // One by one extract an element from heap
	        for (int i = N - 1; i > 0; i--) {
	            // Move current root to end
	            int temp = arr[0];
	            arr[0] = arr[i];
	            arr[i] = temp;
	 
	            // call max heapify on the reduced heap
	            heapify(arr, i, 0);
	        }
	    }
	 
	    // To heapify a subtree rooted with node i which is
	    // an index in arr[]. n is size of heap
	    void heapify(int arr[], int N, int i)
	    {
	        int largest = i; // Initialize largest as root
	        int l = 2 * i + 1; // left = 2*i + 1
	        int r = 2 * i + 2; // right = 2*i + 2
	 
	        // If left child is larger than root
	        if (l < N && arr[l] > arr[largest])
	            largest = l;
	 
	        // If right child is larger than largest so far
	        if (r < N && arr[r] > arr[largest])
	            largest = r;
	 
	        // If largest is not root
	        if (largest != i) {
	            int swap = arr[i];
	            arr[i] = arr[largest];
	            arr[largest] = swap;
	 
	            // Recursively heapify the affected sub-tree
	            heapify(arr, N, largest);
	        }
	    }
	    public void Hsort() {
	    	 int arr[] = { 12, 11, 13, 5, 6, 7 };
	    	 Heapsort(arr);
	    	 System.out.println(Arrays.toString(arr));
	    }
}

