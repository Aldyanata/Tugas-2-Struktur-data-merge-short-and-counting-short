import java.util.Scanner;

public class Squential {
   
    // Metode untuk sequential search
    private static int sequentialSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i; // Angka ditemukan, kembalikan indeks
            }
        }
        return -1; // Angka tidak ditemukan
    }
    public static void main(String[] args) {
        // Inisialisasi data
        int[] data = {10, 25, 8, 15, 30};
        
        // Menampilkan data
        System.out.print("Data: ");
        for (int i : data) {
            System.out.print(i + " ");
        }

        // Input angka yang dicari
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nMasukkan angka yang dicari: ");
        int target = scanner.nextInt();

        // Melakukan pencarian sequential
        int index = sequentialSearch(data, target);

        // Menampilkan hasil
        if (index != -1) {
            System.out.println("Angka " + target + " ditemukan di indeks " + index);
        } else {
            System.out.println("Angka " + target + " tidak ditemukan");
        }
    }


}
