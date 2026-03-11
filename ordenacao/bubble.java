import java.util.Random;
import java.util.Arrays;

public class bubble {
    public static void main(String[] args) {
        int tamanho = 10;

        int[] novaArray = norepeat(tamanho);

        bubbleSort(novaArray);
        System.out.println("ordenado: " + Arrays.toString(novaArray));
        
    }

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
}