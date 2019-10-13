
import java.util.Scanner;

/*
 * NAMA              : FATAHILLAH SATRIA BIMA SENO
 * KELAS             : IF-01
 * NIM               : 10118039
 * DESKRIPSI PROGRAM : Program ini berisi program untuk mencari nilai rata rata dari nilai seorang mahasiswa  
 */

/**
 *
 * @author Fatahillah Seno
 */
public class NilaiMhs {  
    public int nilai;
    public double totalNilai;
    
    Scanner masuk = new Scanner(System.in);
    
    public double hitungNilai(int parNilai, int parJmlMhs){
        for(int i=1;i<=parJmlMhs;i++){
            System.out.print("Nilai mahasiswa ke-"+i+" : ");
            parNilai = masuk.nextInt();
            totalNilai += parNilai;
        }
        return totalNilai;
    }
    
    public double hitungRataRata(double totalNilai,int jmlMhs){
        return totalNilai/jmlMhs;
    }
}
