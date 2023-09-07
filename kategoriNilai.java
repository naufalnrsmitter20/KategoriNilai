import java.util.Scanner;

public class kategoriNilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan Nama : ");
        String nama = input.nextLine();

        System.out.println("Masukkan Nilai : ");
        int nilai = input.nextInt();

        String Predikat = null;
        String Kriteria = null;

        if (nilai >= 96 && nilai <= 100) {
            Predikat = "Sangat Baik";
            Kriteria = "A";
        } else if (nilai >= 91 && nilai <= 95) {
            Predikat = "Sangat Baik";
            Kriteria = "A-";
        } else if (nilai >= 86 && nilai <= 90) {
            Predikat = "Baik";
            Kriteria = "B+";
        } else if (nilai >= 81 && nilai <= 85) {
            Predikat = "Baik";
            Kriteria = "B";
        } else if (nilai >= 75 && nilai <= 80) {
            Predikat = "Baik";
            Kriteria = "B-";
        } else if (nilai >= 70 && nilai <= 74) {
            Predikat = "Cukup";
            Kriteria = "C+";
        } else if (nilai >= 65 && nilai <= 69) {
            Predikat = "Cukup";
            Kriteria = "C";
        } else if (nilai >= 60 && nilai <= 64) {
            Predikat = "Cukup";
            Kriteria = "C-";
        } else if (nilai >= 55 && nilai <= 59) {
            Predikat = "Kurang";
            Kriteria = "D+";
        } else if (nilai <= 54 && nilai >= 0) {
            Predikat = "Kurang";
            Kriteria = "D";
        } else {
            System.out.println("Error");
        }
        System.out.println("Nama : " + nama);
        System.out.println("Nilai :" + nilai);
        System.out.println(Predikat);
        System.out.println(Kriteria);
    }
}
