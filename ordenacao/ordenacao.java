import java.util.Arrays;
import java.util.Random;

public class ordenacao {
    public static void main(String[] args) {
        int[] t = {10, 100, 1000, 10000};

        for (int n : t){
        int[] arr = norepeat(n);

        int[] arrb = Arrays.copyOf(arr, n);
        int[] arrq = Arrays.copyOf(arr, n);
        int[] arrm = Arrays.copyOf(arr, n);

        System.out.printf("fazendo " + n + " tamanho\n\n");

        long startb = System.nanoTime();
        bubbleSort(arrb);
        long timeb = System.nanoTime() - startb;

        long startq = System.nanoTime();
        quickSort(arrq);
        long timeq = System.nanoTime() - startq;

        long startm = System.nanoTime();
        mergetemp(arrm);
        long timem = System.nanoTime() - startm;

        System.out.printf("tempo bubble: %.4f ms\n", (timeb / 1_000_000.0));
        System.out.printf("tempo quick: %.4f ms\n", (timeq / 1_000_000.0));
        System.out.printf("tempo merge: %.4f ms\n\n", (timem / 1_000_000.0));

        }
    }

//embaralha

    public static int[] norepeat(int n){
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = i;
        }

        Random random = new Random();
        for (int i = n - 1; i > 0; i--) {
            int j = random.nextInt(i + 1); 

            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }

        return array;
    }

//bubblesort

    public static void bubbleSort(int v[]) {
        int i, j;
        int n = v.length;
        for(i = 0; i < n - 1; i++) {
            for(j = 0; j < n - i - 1; j++) {
                if (v[j] > v[j + 1]) {
                    int temp;
                    temp = v[j];
                    v[j] = v[j+1];
                    v[j+1] = temp;
                }
            }
        }
    }

//quicksort

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

//mergesort

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
