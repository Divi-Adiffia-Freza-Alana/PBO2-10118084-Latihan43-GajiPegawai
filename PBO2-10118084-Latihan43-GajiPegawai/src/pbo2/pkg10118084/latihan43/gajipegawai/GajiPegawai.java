/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118084.latihan43.gajipegawai;

/**
 *
 * @author Freza
 */
public class GajiPegawai {
    private String nama;
    private String alamat;
    private int UangTransport;
    private int UangTunjangan;
    private int gajiPokok;
    private int totalGaji;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int getUangTransport() {
        return UangTransport;
    }

    public void setUangTransport(int UangTransport) {
        this.UangTransport = UangTransport;
    }

    public int getUangTunjangan() {
        return UangTunjangan;
    }

    public void setUangTunjangan(int UangTunjangan) {
        this.UangTunjangan = UangTunjangan;
    }

    public int getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(int gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public int getTotalGaji() {
        return totalGaji;
    }

    public void setTotalGaji(int totalGaji) {
        this.totalGaji = totalGaji;
    }
    
   int totalGaji(int UangTunjangan,int UangTransport,int gajiPokok){
       return UangTunjangan+UangTransport+gajiPokok;
    }
   
   void tampilData(String nama,String alamat,int UangTunjangan,int UangTransport,int gajiPokok,int totalGaji){
       this.nama =nama;
       this.alamat =alamat;
       this.UangTunjangan =UangTunjangan;
       this.UangTransport=UangTransport;
       this.gajiPokok =gajiPokok;
       System.out.println("### Data Gaji Karyawan PT. KAKATU ###");
       System.out.println("--------------------");
       System.out.println("Nama Karyawan:"+nama);
       System.out.println("Alamat: Jalan semar dlm 4 No 72/66");
       System.out.println("Uang Transport: Rp. "+UangTransport);
       System.out.println("Uang Tunjangan: Rp. "+UangTunjangan);
       System.out.println("Uang gaji pokok: Rp."+(gajiPokok));
       
       
   }
}
