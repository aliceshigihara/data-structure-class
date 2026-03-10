import java.util.Arrays;
import java.util.Random;

public class quick {
    public static void main(String[] args) {
        int tam = 10;
        int vm = 100;

        int[] ar = new int[tam];
        Random n = new Random();

        for (int i = 0; i < tam; i++){
            ar[i] = n.nextInt(vm);
        }

        System.out.println("desordenado: " + Arrays.toString(ar));
        quickSort(ar);
        System.out.println("ordenado: " + Arrays.toString(ar));
    }

    public static void quickSort(int v[]){
        if (v != null && v.length > 0){
            quicksort2(v, 0, v.length - 1);
        }
    }

    public static void quicksort2(int v[], int a, int b){
        if (a < b){
            int ip = particiona(v, a, b);   
            quicksort2(v, a, ip-1);
            quicksort2(v, ip+1, b);
        }
    }

    private static int particiona(int v[], int a, int b){
        int x = v[a];
        while (a < b){
            while (v[a] < x){
                a++;
            }
            while (v[b] > x){
                b--;

            }

            troca(v, a, b);
        }
        return a;
    }

    private static void troca(int v[], int a, int b){
        int t = v[a];
         v[a] = v[b];
         v[b] = t;
    }
}   
