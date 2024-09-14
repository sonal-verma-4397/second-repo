class Test {
    public int search(int ar[], int key) {
        int start = 0;
        int end = ar.length - 1;
        int mid = (start + end) / 2;
        while (start <= end) {
            if (ar[mid] == key) {
                return mid;
            }
            if (key > ar[mid]) {
                start = mid + 1;
            }
            if (key < ar[mid]) {
                start = mid - 1;
            }
            mid = (start + end) / 2;
        }
        return -1;
    }

}

public class Binarysearch {
    public static void main(String[] args) {
        int evenar[] = { 2, 3, 4, 5, 6, 7 };
        int oddar[] = { 8,9,10,11,12 };
        Test t = new Test();
       System.out.println("Index is:"+t.search(oddar, 11));
       System.out.println("Index is:"+t.search(evenar,4 ));
    }
}
