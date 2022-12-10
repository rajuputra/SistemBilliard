import java.util.Scanner;
import java.io.FileWriter;   // Mengimport Class FileWriter
import java.io.IOException;  // Mengimport Class IOException untuk menangani error
import java.io.BufferedWriter;
public class Customer {
    private int nik;
    private String nama;
    private String jenis_meja;

    public int getNik() {
        return nik;
    }

    public void setNik(int nik) {
        this.nik = nik;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenis_meja() {
        return jenis_meja;
    }

    public void setJenis_meja(String jenis_meja) {
        this.jenis_meja = jenis_meja;
    }
    Minum minum = new Minum();
    int pilih,pilihMeja;
    Scanner in = new Scanner(System.in);
    public void pesan_meja(){
        System.out.println("Selamat datang Pelanggan yang terhormat di Slebew Billiar !!!");
        System.out.println("Pilih Menu");
        System.out.println("1. Pesan Meja" );
        System.out.println("2. Pesan Minum");
        pilih = in.nextInt();
        if (pilih == 1){
            System.out.println("Masukkan Nik : ");
            nik = in.nextInt();
            System.out.println("Masukkan Nama : ");
            nama = in.next();
            System.out.println("Jenis meja :" );
            System.out.println("1. Biasa ");
            System.out.println("2. Vip");
            pilihMeja = in.nextInt();
            if (pilihMeja == 1){
                jenis_meja = "biasa";
            }
            else {
                jenis_meja = "vip";
            }
            try {
                FileWriter tulisan = new FileWriter("src\\waitinglist.txt", true);
                BufferedWriter tulis = new BufferedWriter(tulisan);
                tulis.write(nik+"\n");
                tulis.write(nama+"\n");
                tulis.write(jenis_meja+"\n");
                tulis.append("\n");
                tulis.close();
                System.out.println("Pesanan Sudah Masuk ! Silahkan Tunggu Waiting List Anda");
            } catch (IOException e) {
                System.out.println("Terjadi kesalahan");
                e.printStackTrace();
            }
        }
        else {
            minum.pesan();
        }

    }
}