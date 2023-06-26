import java.util.*;
public class heapSort {
// heapify for maxHeap
     public static void heapify(int[] arr, int i, int size) {  // TC - O(n*logn)
        int left = 2*i+1;
        int right = 2*i+2;
        int maxIdx = i;
        if(left < size && arr[left] > arr[maxIdx] ) {
            maxIdx = left;
        }
        if(right < size && arr[right] > arr[maxIdx] ) {
            maxIdx = right;
        }

        if(maxIdx != i) {
            int temp = arr[i];
            arr[i] = arr[maxIdx];
            arr[maxIdx] = temp;

            heapify(arr, maxIdx, size);
        }

     }
    public static void Heap_Sort(int arr[]) {  // TC - O(n*logn)
        //step1 - build maxHeap
        int n = arr.length;
        for(int i = (n/2)-1; i>=0; i--) {
            heapify(arr, i, n);
        }

        //step2 - deleting root of heap and pushing at last of array for ascending order
         for(int i = n-1; i>0; i--) {
          //swapping largest with last 
          int temp = arr[0];
          arr[0] = arr[i];
          arr[i] = temp;

          heapify(arr, 0, i);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 3 };
         Heap_Sort(arr);
         System.out.print("Sorted array is: ");
         for(int i = 0; i<arr.length;i++) {
            System.out.print(arr[i]+" ");
         }
    }
}
