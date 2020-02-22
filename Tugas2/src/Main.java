
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        byte pil;
        char y;
        
        do{
            System.out.println("Menu : ");
            System.out.println("1. Segitiga dan turunannya ");
            System.out.println("2. Lingkaran dan turunannya ");
            System.out.println("3. GTFO");
            System.out.print("Pilih Menu : ");
            pil = input.nextByte();
            
            switch (pil) {
                case 1:
                    double alas, tinggi, Tinggi1;
                    System.out.println("Order: ");
                    System.out.println("- Luas Segitiga");
                    System.out.println("- Volume Prisma Segitiga");
                    System.out.println("- Volume Limas Segitiga");
                    System.out.print("Alas: ");
                    alas = input.nextDouble();
                    System.out.print("Tinggi Alas Segitiga: ");
                    tinggi = input.nextDouble();
                    System.out.print("Tinggi Bangun 3D: ");
                    Tinggi1 = input.nextDouble();
                    System.out.println("---Segitiga---");
                    Segitiga s3 = new Segitiga(alas, tinggi);
                    System.out.println("Luas Segitiga(Koma): " + s3.luasSegitiga());
                    System.out.println("Luas Segitiga(Pembulatan): " + s3.luasSegitiga((int)alas, (int)tinggi));
                    System.out.println("---Prisma Segitiga---");
                    PrismaSegitiga prism = new PrismaSegitiga(alas, tinggi);
                    System.out.println("Volume Prisma: " + prism.volume(Tinggi1));
                    System.out.println("---Limas Segitiga---");
                    LimasSegitiga lim = new LimasSegitiga(alas, tinggi);
                    System.out.println("Volume Limas: " + lim.volume(Tinggi1));
                    break;
                case 2:
                    double jari, Tinggi2;
                    System.out.println("Order: ");
                    System.out.println("- Luas Lingkaran");
                    System.out.println("- Volume Tabung");
                    System.out.println("- Volume Kerucut");
                    System.out.print("Jari-jari: ");
                    jari = input.nextDouble();
                    System.out.print("Tinggi Bangun 3D: ");
                    Tinggi2 = input.nextDouble();
                    System.out.println("---Lingkaran---");
                    Lingkaran ling = new Lingkaran(jari);
                    System.out.println("Luas Lingkaran(Koma): " + ling.luasLingkaran());
                    System.out.println("Luas Lingkaran(Pembulatan): " + ling.luasLingkaran((int)jari));
                    System.out.println("---Tabung---");
                    Tabung sil = new Tabung(jari);
                    System.out.println("Volume Tabung: " + sil.volume(Tinggi2));
                    System.out.println("---Kerucut---");
                    Kerucut ker = new Kerucut(jari);
                    System.out.println("Volume Kerucut: " + ker.volume(Tinggi2));
                    break;
                case 3:
                    System.out.println("LATA BIJ!!!");
                    break;
                default:
                    System.out.println("Pilihan Tidak Tersedia");
                    break;
            }
        }while(pil!=3);
        
    }
    
}