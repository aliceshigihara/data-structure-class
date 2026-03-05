import java.util.Random;
import java.util.Arrays;

public class bubble {
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
    public static void main(String[] args) {
        int tamanho = 10;
        int valor_max = 10;
        int[] novaArray = new int[tamanho];
    
        Random gerarRandomNum = new Random();

        int i;
        for(i = 0; i < tamanho; i++){
            novaArray[i] = gerarRandomNum.nextInt(valor_max);
        
        }

        bubbleSort(novaArray);
        System.out.println("Array ordenada com Valores Aleatórios: " + Arrays.toString(novaArray));
        
    }
}