import java.util.Arrays;
import java.util.Scanner;

public class exSquentialAndBinary {
    
    private static int sequentialSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;// jika angka ditemukan maka pengembalian index
            }
        }
        return -1; // jika data kosong akan dikembalikan
    }

    public static int binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int midValue = array[mid];

            if (midValue == target) {
                return mid; // angka ditemukan, kembalikan indexs
            } else if (midValue < target) {
                low = mid + 1; // mencari setengah kanan
            } else {
                high = mid - 1; // mencari setengah kiri
            }
        }
        return -1; // angka tidak ditemukan
    }

    public static void main(String[] args) {
        // input data yang sudah ditentukan menggunakan array

        // =========> Squential & BinarySearch <===========
        int[] data = { 89, 90, 91, 78, 60 };

        System.out.print("Data Squential: ");
        for (int s : data) {
            System.out.print(s + " ");
        }

        System.out.println();

        int[] dataArray = { 59, 60, 71, 78, 80 };// binary array harus urut

        System.out.print("Data Binary: ");
        for (int b : dataArray) {
            System.out.print(b + " ");
        }

        // input data yang dicari
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nMasukan Angka SquentialSearch yang dicari : ");
        int target = scanner.nextInt();

        Scanner scannerbiner = new Scanner(System.in);
        System.out.print("\nMasukan Angka BinarySearch yang dicari : ");
        int targetNumber = scannerbiner.nextInt();

        System.out.println();

        // Menampilkan hasil pencarian
        int index = sequentialSearch(data, target);
        if (index != -1) {
            System.out.println("Angka Squential " + target + " ditemukan di index " + index);
        } else {
            System.out.println("Angka Squential " + target + " Tidak ditemukan");
        }

        int indexBiner = binarySearch(dataArray, targetNumber);
        if (indexBiner != -1) {
            System.out.println("Angka Binary " + targetNumber + " ditemukan di index " + indexBiner);
        } else {
            System.out.println("Angka Binary " + targetNumber + " Tidak ditemukan");
        }

    }

}
