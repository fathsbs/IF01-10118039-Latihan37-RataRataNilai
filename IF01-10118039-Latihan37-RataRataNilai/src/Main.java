
import java.util.Scanner;

/*
 * NAMA              : FATAHILLAH SATRIA BIMA SENO
 * KELAS             : IF-01
 * NIM               : 10118039
 * DESKRIPSI PROGRAM : Program ini berisi program untuk mencari nilai rata rata dari nilai seorang mahasiswa   
 */

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NilaiMhs mhs = new NilaiMhs();
        Scanner masuk = new Scanner(System.in);
        
        int jmlMhs;
        System.out.print("Masukkan Banyaknya Mahasiwa : ");
        jmlMhs = masuk.nextInt();
        
        mhs.hitungNilai(mhs.nilai, jmlMhs);
        mhs.hitungRataRata(mhs.totalNilai, jmlMhs);
        
        System.out.printf("%nMaka, Rata-rata nilainya adalah : %.1f",mhs.hitungRataRata(mhs.totalNilai, jmlMhs));
        System.out.println();
        System.out.println("Developed by : Fatahillah Satria Bima Seno");
    }

}
