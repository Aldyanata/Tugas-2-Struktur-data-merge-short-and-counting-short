import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        // Data array (pastikan array diurutkan)
        int[] dataArray = { 10, 24, 36, 45, 50 }; // Nilai a1 sampai a5
        Arrays.sort(dataArray);
        System.out.print("Data: ");
        for (int i : dataArray) {
            System.out.print(i + " ");
        }

        // Angka yang dicari
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nMasukkan angka yang dicari: ");
        int targetNumber = scanner.nextInt();

        // Melakukan pencarian menggunakan binary search
        int result = binarySearch(dataArray, targetNumber);

        // Menampilkan hasil pencarian
        if (result == -1) {
            System.out.println("Angka " + targetNumber + " tidak ditemukan dalam array.");
        } else {
            System.out.println("Angka " + targetNumber + " ditemukan di indeks ke-" + result + " dalam array.");
        }
    }

    // Metode binary search
    private static int binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int midValue = array[mid];

            if (midValue == target) {
                return mid; // Angka ditemukan, kembalikan indeks
            } else if (midValue < target) {
                low = mid + 1; // Cari di setengah kanan
            } else {
                high = mid - 1; // Cari di setengah kiri
            }
        }

        return -1; // Angka tidak ditemukan
    }
}
