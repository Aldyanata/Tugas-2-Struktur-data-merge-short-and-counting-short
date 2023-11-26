/**
 * Tugas2
 */
public class Tugas2 {

  void merge(int array[], int l, int m, int r) {
    int n1 = m - l + 1;
    int n2 = r - m;
    int L[] = new int[n1];
    int R[] = new int[n2];
    for (int i = 0; i < n1; ++i)
      L[i] = array[l + i];
    for (int j = 0; j < n2; ++j)
      R[j] = array[m + 1 + j];
    int i = 0;
    int j = 0;
    int k = l;
    while (i < n1 && j < n2) {
      if (L[i] <= R[j]) {
        array[k] = L[i];
        i++;
      } else {
        array[k] = R[j];
        j++;
      }
      k++;
    }
    while (i < n1) {
      array[k] = L[i];
      i++;
      k++;
    }
    while (j < n2) {
      array[k] = R[j];
      j++;
      k++;
    }
  }

  /**
   * @param array
   * @param l
   * @param r
   */
  void sort(int array[], int l, int r) {
    if (l < r) {
      int m = (l + r) / 2;
      sort(array, l, m);
      sort(array, m + 1, r);
      merge(array, l, m, r);
    }
  }

  static void printArray(int array[]) {
    int n = array.length;
    for (int i = 0; i < n; ++i)
      System.out.print(array[i] + " ");
    System.out.println();

  }

  void countShortArray( char arr[] ){
    int n = arr.length;
    char output[]  = new char[n];
    int count[] = new int[255];
    for (int i = 0; i <255 ; ++i)
      count[i] =0;
    for (int i = 0; i < n; ++i)
      ++count[arr[i]];
    for (int i = 1; i < 255; ++i)
      count[i] += count[i - 1];
    for (int i = 0; i < n; ++i){
      output[count[arr[i]]-1]=arr[i];
      --count[arr[i]];
     }
   for(int i = 0; i < n; ++i)
   arr[i] = output[i];
}

  public static void main(String[] args) {
    int array[] = { 13, 15, 5, 6, 7, 8 };
    System.out.print("tampilkan array merge short : ");
    printArray(array);
    Tugas2 objekTugas2 = new Tugas2();
    objekTugas2.sort(array, 0, array.length - 1);
    System.out.print("tampilkan merge short : ");
    printArray(array);
    // ==============================================
    System.out.println();
    // ==============================================
    Tugas2 objecTugas2No2 = new Tugas2();
    char arr[] ={'a','d', 'e', 'f', 'b', 'c' };
    System.out.print("tampilkan char countingShort :");
    System.out.println(arr);
    objecTugas2No2.countShortArray(arr);
    System.out.print("mengurutkan menggunakan Counting-short : " );
    for (int i = 0; i <arr.length; i++) 
    System.out.print(arr[i] + " ");

    System.out.println();    
    System.out.println();
  }ko

}
