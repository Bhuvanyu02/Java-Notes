import java.util.Scanner;

public class MAX_MIN_Heap {

    static void minH(int[] arr) {

        int n = arr.length;
        if (n <= 1) {
            System.out.println("Yes it's a min heap");
        } else {
            boolean check = true;
            int[] arr2 = arr;

            for (int i = 0; i < (n - 2) / 2; i++) {
                if (arr[i] > arr[2 * i + 1] || ((2 * i + 2 != n) && arr[i] > arr[2 * i + 2])) {
                    check = false;
                }
            }
            if (check) {
                System.out.println("Yes it's a MinHeap");
            } else {
                System.out.println("No it's not a MinHeap");
            }
        }
    }

    static void maxH(int[] arr) {
        boolean check = true;
        int n = arr.length;
        for (int i = 0; i < (n - 2) / 2; i++) {
            if (arr[2 * 1 + 1] > arr[i]) {
                check = false;
            }
            if (2 * i + 2 < n && arr[2 * i + 2] > arr[i]) {
                check = false;
            }
        }
        if (check) {
            System.out.println("Yes it's a MaxHeap");
        } else {
            System.out.println("No it's not a MaxHeap");
        }
    }

    static void Maxheapify(int[] arr, int i, int size) {
        int l = 2 * i + 1;
        int r = 2 * i + 2;
        int li = i;
        if (l < size && arr[l] > arr[li]) {
            li = l;
        }
        if (r < size && arr[r] > arr[li]) {
            li = r;
        }
        if (li != i) {
            int t = arr[i];
            arr[i] = arr[li];
            arr[li] = t;
            Maxheapify(arr, li, size);
        }
    }

    static void Minheapify(int[] arr, int i, int size) {
        int l = 2 * i + 1;
        int r = 2 * i + 2;
        int li = i;
        if (l < size && arr[l] < arr[li]) {
            li = l;
        }
        if (r < size && arr[r] < arr[li]) {
            li = r;
        }
        if (li != i) {
            int t = arr[i];
            arr[i] = arr[li];
            arr[li] = t;
            Minheapify(arr, li, size);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total Number of Elements");
        int n=sc.nextInt();
        int[]arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for (int i=n/2-1;i>=0;i--){
            Maxheapify(arr,i,n);
        }
        System.out.print("MAX Heap: ");
        for (int i=0;i<n;i++){
            System.out.print(arr[i]);
        }
        System.out.println();

        maxH(arr);
        System.out.println();
        for (int i=n/2-1;i>=0;i--){
            Minheapify(arr,i,n);
        }
        System.out.print("MIN Heap: ");
        for (int i=0;i<n;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
        minH(arr);
    }
}