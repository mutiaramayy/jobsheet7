import java.util.Scanner;

public class SiakadWhile21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nilai, jml, i = 0;
        
        System.out.print("Masukkan jumlah mahasiswa: ");
        jml = sc.nextInt();

        while (i < jml) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai = sc. nextInt();

            if (nilai < 0 || nilai > 100) {
                System.out.println("Nilai tidak valid, masukkan nilai antara 0 hingga 100.");
                continue;
            }

            if (nilai > 80 && nilai <= 100) {
                System.out.println("Kategori nilai A");
            } else if (nilai > 73 && nilai <= 80) {
                System.out.println("Kategori nilai B+");
            } else if (nilai > 65 && nilai <= 73) {
                System.out.println("Kategori nilai: B"); 
            } else if (nilai > 60 && nilai <= 65) {
                System.out.println("Kategori nilai: C+");
            } else if (nilai > 50 && nilai <= 60) {
                System.out.println("Kategori nilai: C");
            } else if (nilai > 39 && nilai <= 50) {
                System.out.println("Kategori nilai: D");
            } else {
                System.out.println("Kategori nilai E");
            }
            i++;
            
        }
    }
}
