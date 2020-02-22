public class LimasSegitiga extends Segitiga{
    
    double tinggiLimas;
    private double volume;
    
    public LimasSegitiga(double alas, double tinggi) {
        super(alas, tinggi);
    }
    
    @Override
    double luasSegitiga(){
        return luas;
    }
    
    double volume(double Tinggi1){
        tinggiLimas = Tinggi1;
        volume = 1.0/3.0*luasSegitiga()*Tinggi1;
        return volume;
    }
}
