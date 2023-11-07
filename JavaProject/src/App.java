import java.util.LinkedList;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("================");
        System.out.println("Abid Aldyanata");
        System.out.println("================");

            String nama="nama saya ALDYANATA";
            char var1;
            var1 = 'a';
            int nilai = 20;
            int x=1;
            int y=2;
            int z=x+y;
            boolean hasil = nilai > 4;
            float nilai1 = 128.22F;

        System.out.println("Nilai floating point yang dimasukkan adalah :"+nilai1);
        System.out.println("Sum of x+y = " + z);
        System.out.println("Hasilnya adalah : " + hasil);
        System.out.println("Karakter dari variabel adalah : "+var1);
        System.out.print(nama);
        System.out.println(" ");
        System.out.println("================");
        
        String [] cetakA;
            cetakA = new String[3];
            cetakA[0] = "Australia";
            cetakA[1] = "Ceko";
            cetakA[2] = "Jepang";

            System.out.println("Menampilkan urutan negara ke-2 yaitu: "+cetakA[1]);
            System.out.println("Menampilkan seluruh urutan array:");
            for (int i=0; i<3; i++)
            {
            System.out.println(cetakA[i]);
            }

            //Deklarasi array
            String[][]kata = {
                {"satu","dua","tiga"},
                {"empat","lima","enam"},
                {"tujuh","delapan","sembilan"}
                };

            //Menampilkan isi array pada indeks ke-[0][0] dan [2][1]            
            LinkedList<String> buku = new LinkedList<>();

            //Menambahkan Data pada Objek buku
            buku.add("Hujan");
            buku.add("Bumi");
            buku.add("Pulang");
            buku.add("Rindu");
            buku.add("Rasa");

            //Mencetak/Menampilkan Data
            System.out.println("Nama Buku: "+buku);

            //Menghitung Jumlah/Ukuran pada Objek LinkedList
            System.out.println("Jumlah Buku: "+buku.size());
            System.out.println(kata[0][0]);
            System.out.println(kata[2][1]);
            System.out.println(" ");
            System.out.println("================");
    }

}
