/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if10k.pkg10119906.latihan37.ooprogramrataratanilai;
import java.util.Scanner;
/**
 *
 * @author senenngahenen
 * Nama     : Rizqy Ananda Rusmana
 * NIM      : 10119906
 * Kelas    : IF-10K
 */
public class IF10K10119906Latihan37OOProgramRataRataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int jumlahMhs;
        Scanner scanner = new Scanner(System.in);
        RataRataNilai Ratarata = new RataRataNilai();
        
        System.out.print("Masukan Banyaknya Mahasiswa : ");
        jumlahMhs = scanner.nextInt();
        
        Ratarata.hitungNilai(jumlahMhs);
        double jumlahNilai;
        System.out.println("\n" + "Rata Rata Nilainya adalah : " + 
        Ratarata.hitungRatarataNilai(Ratarata.jumlahNilai,jumlahMhs));
    } 
}
