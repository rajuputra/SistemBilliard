import java.util.Arrays;
public class Biasa extends Meja{ //PEWARISAN
    Boolean[] no_urut = {false, false, false, false, false};
    public int harga = 25000;

    public void pemesanan(){
        for(int i = 0; i<5; i++){
            if (no_urut[i] == false){
                System.out.println("Berhasil DI SET");
                System.out.println("Meja No"+(i+1));
                break;
            }
        }
        System.out.println("Harga perjam : "+harga);
        System.out.println(fasilitas());
    }
}
