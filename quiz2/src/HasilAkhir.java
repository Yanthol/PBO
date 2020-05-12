
public class HasilAkhir implements Penilaian{
    private int nilai1,nilai2,nilai3,nilai4,rata ;
    private String check ; 
 
    public HasilAkhir (int nilai1, int nilai2, int nilai3, int nilai4) {
        this.nilai1 = nilai1 ;
        this.nilai2 = nilai2 ; 
        this.nilai3 = nilai3 ;
        this.nilai4 = nilai4 ;
    }
    
     private int setAvg() {
        rata = (nilai1 + nilai2 + nilai3 + nilai4)/4 ;
        return rata; 
    }
    
    @Override
    public int getAvg() {
        return setAvg() ;
    }
    
    @Override
    public String cekLulus() {
        if (getAvg() > 85 && getAvg() <101) {
            return check = "LULUS" ;
        }
        else {
            return check = "GAGAL" ;
        }
    }

    
}