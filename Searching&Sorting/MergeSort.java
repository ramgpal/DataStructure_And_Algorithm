public class MergeSort {
    public static void Merge_Sort(int arr[], int first , int end) {
        //base 
    if(first >= end) {
        return;
    }
    int mid=first+(end-first)/2;
    //kaam
    //for right part first to mid
    Merge_Sort(arr, first, mid);
    //for left part (mid+1) to left
    Merge_Sort(arr, mid+1, end);
    merge(arr, mid, first, end);
    }
    //To merge
    public static void merge(int arr[],int mid,int first,int end) {
        int temp[]=new int[end-first+1]; //temporary array
        int i=first; //iterator for right part
        int j=mid+1; //iterator for left part
        int k=0; //iterator for temporary array 

while(i<=mid && j<=end) {
    if(arr[i]<arr[j]) {
        temp[k]=arr[i];
        i++;
        k++;
    }
    else {
        temp[k]=arr[j];
        j++;
        k++;
    }
}
    //for left part
    while(i<=mid) {
        temp[k++]=arr[i++];
    }
    //for right part
    while(j<=end) {
        temp[k++]=arr[j++];
    }
    //swap the temporary array in the original array
    for(k=0,i=first;k<temp.length;k++,i++) {
        arr[i]=temp[k];
    }
}
    
    public static void PrintArr(int arr[]) {
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
      int arr[]={6,3,9,5,2,8};
      Merge_Sort(arr, 0, arr.length-1);
      PrintArr(arr);
    }
}