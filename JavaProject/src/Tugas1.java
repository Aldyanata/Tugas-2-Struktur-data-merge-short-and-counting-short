import java.util.LinkedList;
/**
 * Tugas1
 */

public class Tugas1 {
public static void main(String[] args) {     
    System.out.println("========================");
    System.out.println("Nama : Abid Aldyanata");
    System.out.println("NIM : 044572807");
    System.out.println("========================");     
    // System.out.println("");

    // 1. Menampilkan variabel 'nilai'
    int nilai = 20;
    System.out.println("nilai : " + nilai);
    System.out.println("========================");     

     // 2. Menampilkan variabel 'kata'
     String kata = "struktur";
    System.out.println("kata : " + kata);
    System.out.println("========================");  
    
     // 3. Menampilkan array satu dimensi 'arraySatu'
     int[] arraySatu ={12,10,40};
    System.out.print("arraySatu : ");
    for(int i = 0; i < arraySatu.length; i++){
        System.out.print(arraySatu[i]+" ");
    } 
    System.out.println();
    System.out.println("========================");
      
     // 4. Menampilkan array dua dimensi 'arrayDua'
    int[][] arrayDua ={
        {12,10,40},
        {13,11,41},
        {14,12,42}
    };
    System.out.println("arrayDua : ");
    for(int i = 0; i < arrayDua.length; i++){
        for(int j=0; j< arrayDua[i].length; j++){
            System.out.print(arrayDua[i][j]+" ");
        }
        System.out.println();
    };
    System.out.println("========================");  

     // 5. Menampilkan linked list
    LinkedList<Integer> linkedList = new LinkedList<>();
    int index = 10;
    for(int i = 0; i < 5;i++) {
        linkedList.add(index);
        index+=10;
    };
    System.out.println("linkedList: " + linkedList);
    System.out.println("linkedList jumlah data : " + linkedList.size());
    System.out.println("========================");  

}    

}
