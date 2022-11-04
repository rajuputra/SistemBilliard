import java.util.Scanner;
public class Customer {
    Scanner in = new Scanner(System.in);
    Pegawai pegawai = new Pegawai();
    public String nama;
    public int nik;
    public int pilMeja;

    public int getPilMeja() {
        return pilMeja;
    }

    public void setPilMeja(int pilMeja) {
        this.pilMeja = pilMeja;
    }

    public String getNama() {
        return nama;
    } //SETTER DAN GETTER

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getNik() {
        return nik;
    }
    //SETTER DAN GETTER
    public void setNik(int nik) {
        this.nik = nik;
    }

    public void pesan(){

        System.out.println("Silahkan masukkan namaa anda : ");
        setNama(in.next());
        System.out.println("Silahkan masukkan nik anda : ");
        setNik(in.nextInt());
        System.out.println("Silahkan pilih jenis meja : ");
        System.out.println("1. Vip\n2. Biasa");
        pilMeja = in.nextInt();
        if(pilMeja == 1){
            pegawai.vip = 1;
            System.out.println("Terimakasih Sudah memesan VIP, Pesanan anda akan masuk di waiting list :)");
        }
        else {
            pegawai.vip = 0;
            System.out.println("Terimakasih Sudah memesan Biasa, Pesanan anda akan masuk di waiting list :)");
        }
    }
}
