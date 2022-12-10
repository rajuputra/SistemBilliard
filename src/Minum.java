import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Minum extends Konsum{
    Scanner in = new Scanner(System.in);
    int pil;
    public void pesan(){
        System.out.println("Masukan nik : ");
        nik = in.nextInt();
        System.out.println("Masukkan nama : ");
        nama = in.next();
        System.out.println("Menu : ");
        System.out.println("1. Es Teh");
        System.out.println("2. Teh Hangat");
        pil = in.nextInt();
        if (pil == 1){
            try{
                FileWriter tulisan = new FileWriter("src\\konsumlist.txt", true);
                BufferedWriter tulis = new BufferedWriter(tulisan);
                tulis.write(nik+"\n");
                tulis.write(nama+"\n");
                tulis.write("Es Teh"+"\n");
                tulis.append("\n");
                tulis.close();
                System.out.println("Pesanan Sudah Masuk ! Silahkan ke meja kasir untuk mengambil pesanan");
            }catch (IOException e) {
                System.out.println("Terjadi kesalahan");
                e.printStackTrace();
            }
        }
        else if(pil == 2){
            try{
                FileWriter tulisan = new FileWriter("src\\konsumlist.txt", true);
                BufferedWriter tulis = new BufferedWriter(tulisan);
                tulis.write(nik+"\n");
                tulis.write(nama+"\n");
                tulis.write("Teh Hangat"+"\n");
                tulis.append("\n");
                tulis.close();
                System.out.println("Pesanan Sudah Masuk ! Silahkan ke meja kasir untuk mengambil pesanan");
            }catch (IOException e) {
                System.out.println("Terjadi kesalahan");
                e.printStackTrace();
            }
        }
    }
}
