package SortAlgo114;

import lists114.list.LList;

public class SortingAlgo {
	
	public static <T extends Comparable<T>> void inssort(T[] A) {
	  for (int i=1; i<A.length; i++) { // Insert i'th record
	    for (int j=i; (j>0) && (A[j].compareTo(A[j-1]) < 0); j--) {
	      swap(A, j, j-1);
	    }
	  }
	}	

	public static <T extends Comparable<T>> void bubblesort(T[] A) {
	  for (int i=0; i<A.length-1; i++) // Insert i'th record
	    for (int j=1; j<A.length-i; j++)
	      if (A[j-1].compareTo(A[j]) > 0)
	        swap(A, j-1, j);
	}
	
	public static <T extends Comparable<T>> void selsort(T[] A) {
	  for (int i=0; i<A.length-1; i++) {       // Select i'th biggest record
	    int bigindex = 0;                      // Current biggest index
	    for (int j=1; j<A.length-i; j++) {      // Find the max value
	      if (A[j].compareTo(A[bigindex]) > 0) {// Found something bigger
	        bigindex = j;                      // Remember bigger index
	      }
	    }
	    swap(A, bigindex, A.length-i-1);       // Put it into place
	  }
	}
	
	/** This implementation uses (and reuses) temp as the auxiliary space */
	public static <T extends Comparable<T>> void mergesort(T[] A, T[] temp, int left, int right) {
	  if (left == right) { return; }       // List has one record
	  int mid = (left+right)/2;          // Select midpoint
	  mergesort(A, temp, left, mid);     // Mergesort first half
	  mergesort(A, temp, mid+1, right);  // Mergesort second half
	  for (int i=left; i<=right; i++) {    // Copy subarray to temp
	    temp[i] = A[i];
	  }
	  // Do the merge operation back to A
	  int i1 = left;
	  int i2 = mid + 1;
	  for (int curr = left; curr <= right; curr++) {
	    if (i1 == mid+1) {                 // Left sublist exhausted
	      A[curr] = temp[i2++];
	    }
	    else if (i2 > right) {             // Right sublist exhausted
	      A[curr] = temp[i1++];
	    }
	    else if (temp[i1].compareTo(temp[i2]) <= 0) {  // Get smaller value
	      A[curr] = temp[i1++];
	    }
	    else{
	      A[curr] = temp[i2++];
	    }
	  }
	}

	public static <T extends Comparable<T>> void quicksort(T[] A, int i, int j) { // Quicksort
		
	  int pivotIndex = partition(A, i, j, A[j]); // return the index of the pivot after partition
	  swap(A, pivotIndex, j);                    // Put pivot in place
	  if ((pivotIndex-i) > 1) { 
		  quicksort(A, i, pivotIndex-1); }  // Sort left partition
	  if ((j-pivotIndex) > 1) { 
		  quicksort(A, pivotIndex+1, j); }  // Sort right partition
	}

	private static <T extends Comparable<T>> int partition(T[] A, int l, int r, T pivot) {
		int pIndex = l;
		for (int i = l; i <= r; i++) {
			if (A[i].compareTo(pivot) < 0){
				swap (A, pIndex, i);
				++pIndex;
			}
		}
		return pIndex;
	}
	
	private static <T> void swap (T[] A, int i, int j) {
		T temp = A[i];
		A[i] = A[j];
		A[j] = temp;
	}
	
	void digitsort(Integer[] A) {
		  LList<Integer>[] B = new LList[10]; // Array of Integer LLists
		  for (int i=0; i <= 9; i++) {
		    B[i] = new LList<Integer>();
		  }
		  for (int i=0; i<A.length; i++) { 
			  B[A[i]].append(A[i]); 
		  }
		  int pos = 0;
		  for (int i=0; i<=9; i++) {
		    for (B[i].moveToStart(); (B[i].getValue()) != null; B[i].next()) {
		      A[pos++] = B[i].getValue();
		    }
		  }
		}

}
