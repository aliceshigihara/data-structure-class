import java.util.Arrays;
import java.util.Random;

public class merge {
    public static void main(String[] args) {
        int tam = 10;
        int vm = 100;

        int[] ar = new int[tam];
        Random n = new Random();

        for (int i = 0; i < tam; i++){
            ar[i] = n.nextInt(vm);
        }

        System.out.println("desordenado: " + Arrays.toString(ar));
        mergetemp(ar);
        System.out.println("ordenado: " + Arrays.toString(ar));
    }

    public static void mergetemp(int[] a){
        if (a !=  null && a.length > 0){
            mergesort(a, 0, a.length - 1);
        }
    }
    
    public static void mergesort(int[] a, int p, int r){
            if (p < r){
                int q = ((p + r)/2);
                mergesort(a, p, q);
                mergesort(a, q + 1, r);
                merges(a, p, q, r);
        }
    }

    public static void merges(int[] a, int p, int q, int r){
        int n1 = q - p + 1;
        int n2 = r - q;

        int[] arr = new int[n1 + 1];
        int[] arr2 = new int[n2 + 1];

        for (int i = 0; i < n1; i++){
            arr[i] = a[p + i];
        for (int j = 0; j < n2; j++){
            arr2[j] = a[q + j + 1];
            }
        }

        arr[n1] = Integer.MAX_VALUE;
        arr2[n2] = Integer.MAX_VALUE;
        
        int i = 0;
        int j = 0;

        for (int k = p; k <= r; k++){
            if (arr[i] <= arr2[j]){
                a[k] = arr[i];
                i++;
            } else {
                a[k] = arr2[j];
                j++;
            }
        }
    }
}
