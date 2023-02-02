public class InsertionSort {
    public static void Insertion_Sort(int Arr[]) 
    {
        for(int i=1;i<Arr.length;i++) {
            int current=Arr[i];
            int prev=i-1;
            //finding position for Insertion
            while(prev>=0 && Arr[prev]>current) {
            Arr[prev+1]=Arr[prev];
            prev--;
            }
            //Insertion
            Arr[prev+1]=current;
        }
    }
    public static void Print_Arr(int Arr[]) {
        for (int i=0;i<Arr.length;i++) {
            System.out.print(Arr[i]+" ");
        }
        System.out.println();
        
    }
    public static void main(String[] args) {
      int Arr[]={5,4,3,1,2};
      Insertion_Sort(Arr);
      Print_Arr(Arr);
}
}