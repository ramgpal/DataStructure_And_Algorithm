public class BubbleSort {
public static void Bubble_Sort(int Arr[]) 
{
  for(int turn=0;turn<Arr.length-1;turn++)
  {
     for(int j=0;j<Arr.length-1-turn;j++)
    {
     if (Arr[j]>Arr[j+1])  {
//Swapping
         int temp=Arr[j];
          Arr[j]=Arr[j+1];
          Arr[j+1]=temp;
         }
   }
 }
}
public static void Print_Arr(int Arr[])
{
   for(int i=0;i<Arr.length;i++) {
   System.out.print(Arr[i] + " ");
   }
System.out.println();
}
public static void main(String[] args) {
int Arr[]={5,4,1,3,2};
Bubble_Sort(Arr);
Print_Arr(Arr);
}
}