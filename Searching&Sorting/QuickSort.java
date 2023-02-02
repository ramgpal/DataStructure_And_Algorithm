public class QuickSort {
    public static void Quick_Sort(int arr[],int first,int end) {
        if(first>=end) {
            return;
        }
        int PivotIDX = Partition(arr,first,end);
        Quick_Sort(arr, first, PivotIDX-1);
        Quick_Sort(arr, PivotIDX+1, end);
    }
    public static int Partition(int arr[],int first,int end) {
        int pivot=arr[end];
        int i=first-1;
        for(int j=first;j<end;j++) {
            if(arr[j]<=pivot) {
                i++;
                //swapping
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        i++;
        int temp=pivot;
        arr[end]=arr[i];
        arr[i]=temp;
        return i;
   }
   public static void Print_Array(int arr[]) {
    for(int i=0;i<arr.length;i++) {
        System.out.print(arr[i]+" ");
    }
    System.out.println();
   }
   public static void main(String [] args) {
    int arr[]={6,3,9,8,2,5};
    Quick_Sort(arr, 0, arr.length-1);
    Print_Array(arr);
   }
}