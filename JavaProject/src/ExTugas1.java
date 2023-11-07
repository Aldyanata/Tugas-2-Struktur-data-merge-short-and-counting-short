/**
 * Tugas1
 */
import java.util.LinkedList;

public class ExTugas1 {
 public static void main(String[] args){
     System.out.println("========================");
     System.out.println("Nama : Abid Aldyanata");
     System.out.println("NIM : 044572807");
     System.out.println("========================");
    
    // 1. Menampilkan variabel 'nilai'
     int nilai = 20;
     System.out.println("========================");
     System.out.println("Nilai: " + nilai);

     // 2. Menampilkan variabel 'kata'
     String kata = "struktur";
     System.out.println("Kata: " + kata);

     // 3. Menampilkan array satu dimensi 'arraySatu'
     int[] arraySatu = {12, 10, 40};
     System.out.print("Array Satu Dimensi: ");
     for (int i = 0; i < arraySatu.length; i++) {
         System.out.print(arraySatu[i] + " ");
     }
     System.out.println();

     // 4. Menampilkan array dua dimensi 'arrayDua'
     int[][] arrayDua = {
         {12, 10, 40},
         {13, 11, 41},
         {14, 12, 42}
     };
     System.out.println("Array Dua Dimensi:");
     for (int i = 0; i < arrayDua.length; i++) {
         for (int j = 0; j < arrayDua[i].length; j++) {
             System.out.print(arrayDua[i][j] + "\t");
         }
         System.out.println();
     }

     // 5. Menampilkan linked list
     LinkedList<Integer> linkedList = new LinkedList<>();     
       int nilaiList =10;
       for(int i=0; i< 5; i++) {
        linkedList.add(nilaiList);
        nilaiList+=10;
    }
    System.out.println("nilai linked list :"+linkedList);
    System.out.println("Jumlah nilai linked list : "+linkedList.size());

    //  linkedList.add(10);
    //  linkedList.add(20);
    //  linkedList.add(30);
    //  linkedList.add(40);
    //  linkedList.add(50);
    //  System.out.println("Linked List: " + linkedList);     
    //  System.out.println("Linked Jumlah List: " + linkedList.size());
    //  System.out.println("========================");


 }
 }
    