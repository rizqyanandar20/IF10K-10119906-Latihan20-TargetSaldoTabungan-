/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if10k.pkg10119906.latihan20.targetsaldotabungan;

import java.text.DecimalFormat;
/**
 *
 * @author senenngahenen
 * Nama     : Rizqy Ananda Rusmana
 * Kelas    : IF-10K
 * Deskripsi Program : menampilkan target saldo tabungan.
 */
public class IF10K10119906Latihan20TargetSaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i = 1;
        int saldoAwal = 3500000;
        double bunga = 0.08;
        int saldoBulanan;
        
        DecimalFormat df = new DecimalFormat("#,###,##0");
        
        do{
            saldoBulanan = (int) (bunga * saldoAwal);
            saldoAwal = (saldoAwal + saldoBulanan);
            System.out.println("Saldo di bulan ke-"+ i + " Rp. " + df.format(saldoAwal));
            i++;
        } while (i<=8);
    }
    
}
