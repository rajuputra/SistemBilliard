public class Vip extends Meja{
    int a;

    public Vip(int nikCust, String namaCust, String jmCust, String jamMulai) {
        super(nikCust, namaCust, jmCust, jamMulai);
    }

    public int harga(int a){
        return a*1000;
    }
}