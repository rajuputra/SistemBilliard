//PEWARISAN
public class Vip extends Meja{
    Boolean[] no_urut = {false, false, false, false, false};
    public int harga = 60000;
    //Methode Overriding
    String fasilitas (){
        return "Fasilitas = Meja Billiard, Karaoke, AC, Chalk, Stik"+stik;
    }
    public void pemesanan(){
        for(int i = 0; i<3; i++){
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
