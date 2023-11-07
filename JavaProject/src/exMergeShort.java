public class exMergeShort {

    void merge(int arr[], int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;
        int L[] = new int[n1];
        int R[] = new int[n2];
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];
        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }// end void merge

    void sort(int arr[], int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            sort(arr, l, m);
            sort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }// end void sort

    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }// end static void printArray

    void countingSort(char arr[]) {
        int n = arr.length;
        char output[] = new char[n];
        int count[] = new int[256];
        for (int i = 0; i < 256; ++i)
            count[i] = 0;
        for (int i = 0; i < n; ++i)
            ++count[arr[i]];
        for (int i = 1; i <= 255; ++i)
            count[i] += count[i - 1];
        for (int i = 0; i < n; ++i) {
            output[count[arr[i]] - 1] = arr[i];
            --count[arr[i]];
        }
        for (int i = 0; i < n; ++i)
            arr[i] = output[i];
    }// end void sort

    public static void main(String args[]) {

        int array[] = { 12, 11, 13, 5, 6, 7 };
        System.out.println("Given Array");
        printArray(array);
        exMergeShort obj = new exMergeShort();
        obj.sort(array, 0, array.length - 1);
        System.out.println("\nSorted array");
        printArray(array);

        System.out.println();

        exMergeShort ob = new exMergeShort();
        char arr[] = { 'a', 's', 't', 'e', 'e', 'w', 'e', 'e', 'o', 'p' };
        System.out.print("Tampilkan array char :" );
        System.out.println(arr);
        ob.countingSort(arr);
        System.out.print("Sorted character array is ");
        for (int i = 0; i < arr.length; ++i)
        System.out.print(arr[i]);

    }// end public static void main

    // public static void main(String[] args) {

    // }
}
