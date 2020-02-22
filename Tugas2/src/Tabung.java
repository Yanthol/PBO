public class Tabung extends Lingkaran{
    
    double tinggiTabung;
    private double volume;
    
    public Tabung(double jari) {
        super(jari);
    }
    
    @Override
    double luasLingkaran(){
        return luas;
    }
    
    double volume(double Tinggi2){
        tinggiTabung = Tinggi2;
        volume = luasLingkaran()*Tinggi2;
        return volume;
    }
}
