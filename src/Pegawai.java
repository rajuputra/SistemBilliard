
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
public class Pegawai {
    Scanner in = new Scanner(System.in);
    Vip x = new Vip(000,"Billiard","Meja","00.00");
    Biasa y = new Biasa(000, "Billiard","Meja", "00.00");

    int a,b,pilih,nomor,menit;
    String namaCust;
    int nikCust;
    String jenisMeja, jamMulai;

    List<Vip> daftarVip = new ArrayList<>();
    List<Biasa> daftarBiasa = new ArrayList<>();

    public void list(){
        while (pilih != 3){
            System.out.println("Silahkan pilih List!");
            System.out.println("1. List Vip");
            System.out.println("2. List Biasa");
            System.out.println("3. Keluar");
            pilih = in.nextInt();
            if (pilih == 1){
                a = 0;
                while (a!=4){
                    System.out.println("1. Lihat List Vip");
                    System.out.println("2. Tambahkan Pesanan");
                    System.out.println("3. Cetak Struk Pesanan Selesai");
                    System.out.println("4. Keluar");
                    a = in.nextInt();
                    if (a == 1){
                        tampilkanDaftarVip(daftarVip);
                    } else if(a == 2){
                        System.out.println("Masukkan Nik : ");
                        nikCust = in.nextInt();
                        System.out.println("Masukkan Nama : ");
                        namaCust = in.next();
                        System.out.println("Jenis Meja : ");
                        jenisMeja = in.next();
                        System.out.println("Jam Mulai : ");
                        jamMulai = in.next();
                        daftarVip.add(new Vip(nikCust, namaCust, jenisMeja,jamMulai));
                    }
                    else if(a == 3){
                        System.out.println("Masukkan nomor index pesanan yang selesai : ");
                        nomor = in.nextInt();
                        daftarVip.remove(nomor);
                        System.out.println("Masukkan jam mulai : ");
                        jamMulai = in.next();
                        System.out.println("Masukkan jumlah menit : ");
                        menit = in.nextInt();
                        System.out.println("Total bayar : " + x.harga(menit));
                        try {
                            FileWriter tulisan = new FileWriter("src\\struk.txt");
                            BufferedWriter tulis = new BufferedWriter(tulisan);
                            tulis.write("=========================================\n");
                            tulis.write("STRUK\n");
                            tulis.write("Jam mulai : "+jamMulai+"\n");
                            tulis.write("Jumlah Menit : "+menit+"\n");
                            tulis.write("Total Bayar : "+x.harga(menit)+"\n");
                            tulis.write("=========================================\n");
                            tulis.close();
                            System.out.println("Struk Berhasi Di Cetak");
                        } catch (IOException e) {
                            System.out.println("Terjadi kesalahan");
                            e.printStackTrace();
                        }
                    }
                    else {
                        System.out.println("    ");
                    }
                }
            }
            else if (pilih == 2){
                b = 0;
                while (b!= 4){
                    System.out.println("1. Lihat List Biasa");
                    System.out.println("2. Tambahkan Pesanan");
                    System.out.println("3. Cetak Struk");
                    System.out.println("4. Keluar");
                    b = in.nextInt();
                    if (b == 1){
                        tampilkanDaftarBiasa(daftarBiasa);
                    } else if(b == 2){
                        System.out.println("Masukkan Nik : ");
                        nikCust = in.nextInt();
                        System.out.println("Masukkan Nama : ");
                        namaCust = in.next();
                        System.out.println("Jenis Meja : ");
                        jenisMeja = in.next();
                        System.out.println("Jam Mulai : ");
                        jamMulai = in.next();

                        daftarBiasa.add(new Biasa(nikCust, namaCust, jenisMeja,jamMulai));
                    }
                    else if(b==3){
                        System.out.println("Masukkan nomor index pesanan yang selesai : ");
                        nomor = in.nextInt();
                        daftarVip.remove(nomor);
                        System.out.println("Masukkan jam mulai : ");
                        jamMulai = in.next();
                        System.out.println("Masukkan jumlah menit : ");
                        menit = in.nextInt();
                        System.out.println("Total bayar : " + y.harga(menit));
                        try {
                            FileWriter tulisan = new FileWriter("src\\struk.txt");
                            BufferedWriter tulis = new BufferedWriter(tulisan);
                            tulis.write("=========================================\n");
                            tulis.write("STRUK\n");
                            tulis.write("Jam mulai : "+jamMulai+"\n");
                            tulis.write("Jumlah Menit : "+menit+"\n");
                            tulis.write("Total Bayar : "+y.harga(menit)+"\n");
                            tulis.write("=========================================\n");
                            tulis.close();
                            System.out.println("Struk Berhasi Di Cetak");
                        } catch (IOException e) {
                            System.out.println("Terjadi kesalahan");
                            e.printStackTrace();
                        }
                    }
                    else {
                        System.out.println("    ");
                    }
                }
            }
            else {
                System.out.println("Anda Keluar!");
            }
        }

    }
    public static void tampilkanDaftarVip(List<Vip> daftarVip) {
        System.out.println("Daftar Vip:");
        for (int i = 0; i < daftarVip.size(); i++) {
            Vip vip = daftarVip.get(i);
            System.out.println("- Index: " + i );
            System.out.println(" ID: " + vip.getNikCust());
            System.out.println(" Nama: " + vip.getNamaCust());
            System.out.println(" Jenis Meja: " + vip.getJmCust());
            System.out.println(" Jam Mulai: "+ vip.getJamMulai());
            System.out.println("    ");
        }
    }
    public static void tampilkanDaftarBiasa(List<Biasa> daftarBiasa) {
        System.out.println("Daftar Biasa:");
        for (int i = 0; i < daftarBiasa.size(); i++) {
            Biasa biasa = daftarBiasa.get(i);
            System.out.println("- Index: " + i );
            System.out.println(" ID: " + biasa.getNikCust());
            System.out.println(" Nama: " + biasa.getNamaCust());
            System.out.println(" Jenis Meja: " + biasa.getJmCust());
            System.out.println(" Jam Mulai: "+ biasa.getJamMulai());
        }
    }

}
