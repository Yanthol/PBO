public class Segitiga {
    
    private final double alasDou;
    private final double tinggiDou;
    private int alasInt, tinggiInt;
    static double luas;
    
    Segitiga(double alas, double tinggi){
        alasDou = alas;
        tinggiDou = tinggi;
    }
    
    double luasSegitiga(){
        luas = 1.0/2.0*alasDou*tinggiDou;
        return luas;
    }
    
    int luasSegitiga(int alas, int tinggi){
        alasInt = alas;
        tinggiInt = tinggi;
        luas = alasInt*tinggiInt/2;
        return (int) luas;
    }    
}
