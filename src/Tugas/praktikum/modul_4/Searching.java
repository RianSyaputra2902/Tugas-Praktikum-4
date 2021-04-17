package Tugas.praktikum.modul_4;

import java.util.Scanner;

public class Searching {
    public static void main(String[] args){
        System.out.println("\t***** BINARY SEARCH *****\n");
        int B[] = {25, 7, 9, 13, 3};
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan Data Yang Akan Dicari : ");
        int cari = input.nextInt();
        
        int indexawal = 0;
        int indexakhir = B.length - 1;
        int ketemu = 0;
        int point = 0;
        
        System.out.println("Isi Data Adalah : ");
        for (int i = 0; i<B.length; i++){
            System.out.print(B[i] +" ");
        }
        System.out.println("");
        System.out.println("");
        
        while ((indexawal <= indexakhir) && (ketemu== 0)){
        point = (indexawal + indexakhir) / 2;
        System.out.println("Index Pointer : "+ point);
            
            if(cari == B[point]){
                ketemu = 1;
                System.out.println("Data " +cari + " Telah Ditemukan pada Index ke "+ point);
        }
            else if (cari < B[point]){
                System.out.println("Cari dikiri ");
                indexakhir = point - 1;
            }
            
            else {
                indexawal = point + 1;
                System.out.println("Cari dikanan ");
            }
    }
        
        if (ketemu == 1)
            System.out.println("Kesimpulan : Data Ditemukan ");
        else
            System.out.println("Kesimpulan : Data Tidak Ditemukan ");
        
        System.out.println();
        System.out.println("***** Rian Syaputra *****");
    }
}
