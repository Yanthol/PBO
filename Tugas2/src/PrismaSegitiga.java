public class PrismaSegitiga extends Segitiga{
    
    double tinggiPrism;
    private double volume;
    
    public PrismaSegitiga(double alas, double tinggi) {
        super(alas, tinggi);
    }
    
    @Override
    double luasSegitiga(){
        return luas;
    }
    
    double volume(double Tinggi1){
        tinggiPrism = Tinggi1;
        volume = luasSegitiga()*Tinggi1;
        return volume;
    }
}
