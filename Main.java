// ********** PRINTING ELEMENT OF AN ARRAY******
// class Program{
//     public void printArray(int arr[],int size){
//         for(int i=0;i<size;i++){
//             System.out.println(arr[i]);
//         }
//         System.out.println(arr[0]);
//     }
// }
// **************** SUM OF AN ARRAY**********
// public class Main {
//   public static void main(String[] args) {
//     int ar[] = { 2, 4, 1, 5 };
//     int sum = 0;
//     for (int i = 0; i < ar.length; i++) {
//       sum = sum + ar[i];
//     }
//     System.out.println("sum is: " + sum);
//   }
// }
//
// ******************REVERSE OF AN ARRAY*****************

class Program {
  public void swap(int start, int end, int ar[]) {
    start = 0;
    end = ar.length - 1;
    while (start < end) {
      ar[start] = ar[start] + ar[end];
      ar[end] = ar[start] - ar[end];
      ar[start] = ar[start] - ar[end];
      start++;
      end--;
    }
    for (int i : ar) {
      System.out.println(i);
    }

  }
}

public class Main {
  public static void main(String[] args) {
    int ar[] = { 2, 3, 1, 6, 5 };
    Program p = new Program();
    p.swap(0, 5, ar);

  }

}
// ****************** UNIQUE ELEMENT IN AN ARRAY**********
//
// public class Main {
// public static void main(String[] args) {
// int ar[] = { 1, 3, 1, 2, 3, 4, 4 };
// int n = 7;
// for (int i = 0; i <= n - 1; i++) {
// int count = 0;
// for (int j = 0; j <= n - 1; j++) {
// if (ar[i] == ar[j]) {
// count++;
// }
// }
// if (count == 1) {
// System.out.println(ar[i]);
// }
// }
// }
// }
