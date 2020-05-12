
import java.util.*;

public class Main {

    public static void main(String[] args) {
        
        int pilih, bnyk, jmlh;
        int nilaiTulis, nilaiCoding, nilaiWawancara, nilaiMicro, nilaiJaringan, nim;
        char lanjut;
        String nama;
        Scanner input = new Scanner(System.in);
        Scanner inputNama = new Scanner(System.in);
        do {
            try {
                System.out.println("Menu Form Pendaftaran ");
                System.out.println("1.Asisten Laboratorium ");
                System.out.println("2.Admin Laboratorium ");
                System.out.print("Pilih Jenis Form : ");
                pilih = input.nextInt();
                switch (pilih) {
                    case 1:
                        System.out.println("\nFORM PENDAFTARAN CALON ASISTEN LABORATORIUM");
                        jmlh = 1;
                        System.out.print("Banyak Data Yang Ingin Diiputkan : ");
                        bnyk = input.nextInt();
                        if (bnyk < 1) {
                            throw new RuntimeException();
                        }   while (jmlh <= bnyk) {
                            System.out.print("\nInput Nama : ");
                            nama = "";
                            nama += input.next();
                            System.out.print("Input NIM : ");
                            nim = input.nextInt();
                            System.out.print("Input Nilai Tes Tulis : ");
                            nilaiTulis = input.nextInt();
                            System.out.print("Input Nilai Coding : ");
                            nilaiCoding = input.nextInt();
                            System.out.print("Input Nilai Wawancara : ");
                            nilaiWawancara = input.nextInt();
                            System.out.print("Input Nilai MicroTeaching : ");
                            nilaiMicro = input.nextInt();
                            if (nilaiTulis >100 || nilaiMicro>100 || nilaiCoding>100 || nilaiWawancara>100 || nilaiTulis <1 || nilaiMicro <1 || nilaiCoding <1 || nilaiWawancara <1 ) {
                                throw new RuntimeException();
                            }
                            HasilAkhir hasil = new HasilAkhir(nilaiTulis, nilaiCoding, nilaiWawancara, nilaiMicro);
                            System.out.println("Nilai Akhir : " + hasil.getAvg());
                            if (hasil.getAvg() > 85) {
                                System.out.println("Keterangan : " + hasil.cekLulus());
                                System.out.println( nama + " dengan nim " + nim + " Berhasil lolos menjadi asisten lab ! ");
                            } else {
                                System.out.println("Keterangan : " + hasil.cekLulus());
                                System.out.println( nama + " dengan nim " + nim + " ditolak sebagai calon asisten lab, silahkan coba lagi!");
                            }
                            jmlh++;
                        }   break;
                    case 2:
                        jmlh = 1;
                        System.out.println("\nFORM PENDAFTARAN CALON ADMIN LABORATORIUM");
                        System.out.print("Banyak Data Yang Ingin Diiputkan : ");
                        bnyk = input.nextInt();
                        if (bnyk < 1) {
                            throw new RuntimeException();
                        }   while (jmlh <= bnyk) {
                            System.out.print("\nMasukkan Nama : ");
                            nama = "";
                            nama += input.next();
                            System.out.print("Input NIM : ");
                            nim = input.nextInt();
                            System.out.print("Input Nilai Tes Tulis : ");
                            nilaiTulis = input.nextInt();
                            System.out.print("Input Nilai Coding : ");
                            nilaiCoding = input.nextInt();
                            System.out.print("Input Nilai Wawancara : ");
                            nilaiWawancara = input.nextInt();
                            System.out.print("Input Nilai Praktek Jaringan : ");
                            nilaiJaringan = input.nextInt();
                            if (nilaiTulis >100 || nilaiJaringan>100 || nilaiCoding>100 || nilaiWawancara>100 || nilaiTulis <1 || nilaiJaringan <1 || nilaiCoding <1 || nilaiWawancara <1 ) {
                                throw new RuntimeException();
                            }
                            HasilAkhir hasil = new HasilAkhir(nilaiTulis, nilaiCoding, nilaiWawancara, nilaiJaringan);
                            System.out.println("Nilai Akhir : " + hasil.getAvg());
                            if (hasil.getAvg() > 85) {
                                System.out.println("Keterangan : " + hasil.cekLulus());
                                System.out.println( nama + " dengan nim " + nim + " Berhasil lolos menjadi admin lab ! ");
                            } else {
                                System.out.println("Keterangan : " + hasil.cekLulus());
                                System.out.println( nama + " dengan nim " + nim + " ditolak menjadi admin lab, silahkan coba lagi!");
                            }
                            jmlh++;
                        }   break;
                    default:
                        throw new RuntimeException();
                }
            } catch (RuntimeException e) {
                System.err.println("Invalid Input");
                input.nextLine();
            } finally {
                System.out.print("\nApa anda ingin lanjut mengisi form? (y/n) : ");
                lanjut = input.next().charAt(0);
            }
        } while (lanjut == 'y');

    }

}
