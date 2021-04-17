package Tugas.praktikum.modul_4;
public class BubbleSort {
    public static void bubbleSort(int[] B) {
        int i=1, j, n=B.length;
        int temp;
        while (i<n){
            j=n-1;
            while (j>=i){
                if(B[j-1]>B[j]){
                    temp = B[j];
                    B[j]=B[j-1];
                    B[j-1]=temp;
                }
                j=j-1;
            }
            i=i+1;
        }
    }
    public static void tampil(int data[]){
        for(int i=0; i<data.length; i++){
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int B[] = {25, 7, 9, 13, 3};
        BubbleSort.tampil(B);
        BubbleSort.bubbleSort(B);
        BubbleSort.tampil(B);
    }
}
