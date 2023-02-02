public class SelectionSort {
public static void Selection_Sort(int Arr[]) 
{
  for(int i=0;i<Arr.length-1;i++) {
      int small=i;
      for(int j=i+1;j<Arr.length;j++) {
  if(Arr[small]>Arr[j]) {
      small=j;
    }
   }
   //swap
   int temp=Arr[small];
   Arr[small]=Arr[i];
   Arr[i]=temp;
  }}
  public static void Print_Arr(int Arr[])
{
   for(int i=0;i<Arr.length;i++) {
   System.out.print(Arr[i] + " ");
   }
System.out.println();
}
public static void main(String[] args) {
int Arr[]={5,4,1,3,2};
Selection_Sort(Arr);
Print_Arr(Arr);
}
}