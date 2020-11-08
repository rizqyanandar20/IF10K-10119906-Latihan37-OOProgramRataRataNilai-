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
class RataRataNilai {
    double Ratarata;
    double jumlahNilai = 0;
    
    public void hitungNilai(int jumlahMhs){
        int i;
        double nilai;
        Scanner scanner = new Scanner(System.in);
        
        for (i = 1; i <= jumlahMhs; i++) {
            System.out.print("Nilai Mahasiswa ke-" + i + " : ");
            nilai = scanner.nextDouble();
            jumlahNilai = jumlahNilai + nilai;
        }
    }
    
    public double hitungRatarataNilai(double jumlahNilai, int jumlahMhs) {
        Ratarata = jumlahNilai / jumlahMhs;
        return Ratarata;
    }
    
}
