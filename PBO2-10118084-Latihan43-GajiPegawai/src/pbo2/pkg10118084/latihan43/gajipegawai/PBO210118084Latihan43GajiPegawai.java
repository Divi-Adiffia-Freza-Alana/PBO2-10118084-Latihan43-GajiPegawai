/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118084.latihan43.gajipegawai;

/**
 *
*Nama  : Divi Adiffia Freza Alana
*Kelas : PBO2
*Nim   : 10118084
*Deskripsi Program : Program ini berisi program untuk menampilkan gaji

 */
public class PBO210118084Latihan43GajiPegawai {
private int gatot;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GajiPegawai gajipegawai = new GajiPegawai();
       gajipegawai.tampilData("Rizki","jember",1000,2000,1000,gajipegawai.getTotalGaji());
       
        System.out.println("Toyal Gaji:"+gajipegawai.totalGaji(gajipegawai.getUangTunjangan(),gajipegawai.getUangTransport(),gajipegawai.getUangTransport()));
    }
    
}