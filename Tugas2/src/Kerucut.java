public class Kerucut extends Lingkaran{
    
    double tinggiKerucut;
    private double volume;
    
    public Kerucut(double jari) {
        super(jari);
    }
    
    @Override
    double luasLingkaran(){
        return luas;
    }
    
    double volume(double Tinggi2){
        tinggiKerucut = Tinggi2;
        volume = luasLingkaran()*Tinggi2/3;
        return volume;
    }
}
