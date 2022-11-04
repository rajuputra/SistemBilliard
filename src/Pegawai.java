import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.Scanner;
public class Pegawai {
    private String nama ;

    public String getNama() { //SETTER DAN GETTER
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }


    public char data;
    Scanner in = new Scanner(System.in);
    public String namaCust;
    public int nikCust;
    public int vip = 0;
    Vip mejaVip = new Vip();
    Biasa biasa = new Biasa();




    public void inputPesanan(){
        System.out.println("Daftar Data Pelanggan");
        System.out.println("[1]");
        System.out.println(namaCust);
        System.out.println(nikCust);
        if (vip == 1){
            System.out.println("Memesan VIP");
        }
        else {
            System.out.println("Memesan Meja Biasa");
        }
        System.out.println("Masukkan data ? [Y/T]");
        data = in.next().charAt(0);
        if (data == 'Y' || data == 'y'){
            if (vip == 1){
                mejaVip.pemesanan();
            }
            else {
                biasa.pemesanan();
            }

        }
        else {
            System.out.println("Oke, Semangat Bertugas");
        }
    }
}
