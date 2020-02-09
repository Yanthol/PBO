
import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float rata2 = 0;
        int nilai[] = new int [6];
        String nama;
        int max, min;
        
        
        System.out.print("Masukkan Nama : ");
        nama =  input.nextLine();
        for(int i=0; i < 5; i++)
        {
            System.out.print("Nilai " + (i+1) + " = " );
            nilai [i] = input.nextInt();
            rata2 += nilai[i];
        }
        
        max= nilai[0];
        min = nilai[0];
        rata2 = rata2 / 5;
        
        for (int j=0; j < 5; j++)
        {
            if (nilai[j] > max)
            {
                max = nilai[j];
            }
            else if (nilai[j] < min)
            {
                min = nilai[j];
            } 
        }
             
        System.out.println("Nama : " +nama);
        System.out.println("Nilai Tertinggi = " + max);
        System.out.println("Nilai Terendah = " + min);
        System.out.println("Nilai Rata-rata = " + rata2);
}
}
