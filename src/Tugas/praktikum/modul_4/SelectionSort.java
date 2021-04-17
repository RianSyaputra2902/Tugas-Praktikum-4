package Tugas.praktikum.modul_4;
public class SelectionSort {
    public static void selectionSort(int[] C) {
        int smallindex;
        int pass, j, n=C.length;
        int temp;
        
        for(pass=0; pass<n-2; pass++){
            smallindex=pass;
            for(j=pass+1; j<n; j++){
                if(C[j]<C[smallindex]){
                    smallindex=j;
                }
            }
            temp=C[pass];
            C[pass] = C[smallindex];
            C[smallindex] = temp;
        }
    }
    
    public static void tampil(int data[]){
        for (int i=0; i<data.length; i++){
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int C[] = {25, 7, 9, 13, 3};
        SelectionSort.tampil(C);
        SelectionSort.selectionSort(C);
        SelectionSort.tampil(C);
    }
    
}
