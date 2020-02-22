public class Lingkaran {
    
    private final double jariDou;
    private int jariInt;
    static double luas;
    double pi = 3.14;
    
    Lingkaran(double jari){
        jariDou = jari;
    }
    
    double luasLingkaran(){
        luas = pi*jariDou*jariDou;
        return luas;
    }
    
    int luasLingkaran(int jari){
        jariInt = jari;
        luas = pi*jariInt*jariInt;
        return (int) luas;
    }
    
}
