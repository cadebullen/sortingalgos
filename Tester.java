package SortAlgo114;

public class Tester {
	public static void main(String[] args) {
		Integer[] A = new Integer[] {430, 46, 243, 192, 20, 67, 901, 652, 241, 48, 701, 9};
		Integer[] temp = new Integer[A.length];
		
		SortingAlgo.mergesort(A, temp, 0, A.length-1);
      System.out.print("MergeSort - ");
		for (Integer a : A) {
			System.out.print(a + " ");
		}
      
      System.out.println();
      
      SortingAlgo.inssort(A);
      System.out.print("InsertionSort - ");
		for (Integer a : A) {
			System.out.print(a + " ");
		}
      
      System.out.println();
      
      SortingAlgo.bubblesort(A);
      System.out.print("BubbleSort - ");
      for (Integer a : A){
         System.out.print(a + " ");
      }
      
      System.out.println();
      
      SortingAlgo.selsort(A);
      System.out.print("SelectionSort - ");
      for (Integer a : A){
         System.out.print(a + " ");
      }
      
      System.out.println();
      
      SortingAlgo.quicksort(A, 0, A.length-1);
      System.out.print("QuickSort - ");
      for (Integer a : A){
         System.out.print(a + " ");
      }

	}
}