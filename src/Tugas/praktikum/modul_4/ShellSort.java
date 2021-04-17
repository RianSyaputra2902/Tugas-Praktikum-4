package Tugas.praktikum.modul_4;
public class ShellSort {
    public static void shellSort(int[] D) {
        int n=D.length;
        int x,y;
        int jarak, i, j, kondisi;
        boolean sudah = true;
        int temp;
        x=0;
        y=0;
        jarak=n;
        
        while(jarak>=1){
            jarak=jarak/2;
            sudah=true;
            while(sudah){
                sudah=false;
                for(j=0; j<n-jarak; j++){
                    i=j+jarak;
                    x++;
                    if(D[j]>D[i]){
                        temp=D[j];
                        D[j]=D[i];
                        D[i]=temp;
                        sudah=true;
                    }
                }
            }
        }
    }
    public static void tampil(int data[]){
        for (int i=0; i<data.length; i++){
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int B[] = {25, 7, 9, 13, 3};
        SelectionSort.tampil(B);
        SelectionSort.selectionSort(B);
        SelectionSort.tampil(B);
    }
    
}
