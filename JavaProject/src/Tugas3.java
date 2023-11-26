/**
 * Tugas3
 */
import java.util.Arrays;
import java.util.Scanner;
public class Tugas3 {

    private static int sequentialSearch(int[] array ,int target){
        for (int i =0; i < array.length; i++) {
            if (array[i] == target) {
                return i; 
            }
            
        }
        return -1;
    }
    private static int binarySearch(int[] array, int target ){
        int low =0;
        int high = array.length - 1;
        while (low <= high) {
            int mid =(low + high )/ 2 ;
            int midValue = array[mid];

            if (midValue == target) {
                return mid;
            }else if (midValue < mid) {
                low =mid + 1;
            }else{
                high=mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        //data squential search
        int[] data = {89,90,91,60,45};
        System.out.print("Data Squential : ");
        for (int i : data) {
            System.out.print(i + " ");
        }

         System.out.println();
        
         // data binary search 
        int[] dataBiner = {45,50,89,90,91};
        System.out.print("Data binary : ");
        for (int b : dataBiner) {
            System.out.print(b + " ");
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nMasukan Angka Squential search : ");
        int target = scanner.nextInt();

        Scanner scannerbiner = new Scanner(System.in);
        System.out.print("\nMasukan Angka Binary search : ");
        int targetbiner = scannerbiner.nextInt();

        int index  = sequentialSearch(data, target);
        if (index != -1) {
            System.out.println("Angka Squential "+target+" Ditemukan pada Index ke "+ index);
        }else{
            System.out.println("Angka Squential "+target+" Tidak Ditemukan" );
        }
        
        int indexbiner  = binarySearch(dataBiner, targetbiner);
        if (indexbiner != -1) {
            System.out.println("Angka Binary "+targetbiner+" Ditemukan pada indexbiner ke "+ indexbiner);
        }else{
            System.out.println("Angka Binary "+targetbiner+" Tidak Ditemukan" );
        }

    }

    
}