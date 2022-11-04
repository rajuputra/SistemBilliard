import java.util.Scanner;
import java.util.Arrays;

public class Main {
    Main(){
        System.out.println("Program Sistem Billiard");
    }
    public static void main(String[] args) {
        int pil = 1,pilMeja;
        Pegawai pegawai = new Pegawai();
        Vip vip = new Vip();
        Biasa biasa = new Biasa();
        Customer cust = new Customer();
        Scanner in = new Scanner(System.in);
        Main main = new Main();
        pegawai.setNama("Raju Putra");
        while (pil != 3){
            Meja meja = new Meja();
            System.out.println("Masuk sebagai : ");
            System.out.println("1. Pelanggan\n2. Pegawai");
            System.out.println("Masukkan pilihan : ");
            pil = in.nextInt();

            if (pil == 1) {
                cust.pesan();
            }
            else {
                System.out.println("Selamat Datang dimode Admin "+pegawai.getNama());
                pegawai.namaCust = cust.getNama();
                pegawai.nikCust = cust.getNik();
                pegawai.inputPesanan();

                break;

            }

        }

    }


}