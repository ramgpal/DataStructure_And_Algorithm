// Java Code -> Quick Sort
class Main {
    public static void quickSort(int arr[], int first, int last) {
        if(first >= last) {
            return;
        }
        
        int piIdx = partition(arr, first, last);
        
        quickSort(arr, first, piIdx - 1);
        quickSort(arr, piIdx+1, last);
    }
    
    public static int partition(int arr[], int low, int high) {
        int pivot = arr[low];
        int i = low, j = high;
        
        while(i < j) {
            while(arr[i] <= pivot && i < high) {
                i++;
            }
            
            while(arr[j] >= pivot && j >= i) {
                j--;
            }
            
            if(i < j) {
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
        }
        
        int tmp = pivot;
        arr[low] = arr[j];
        arr[j] = tmp;
        
        return j;
    }
    public static void main(String[] args) {
        int arr[] = { 4, 2, 6, 8, 1};
        quickSort(arr, 0, arr.length - 1);
        
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
