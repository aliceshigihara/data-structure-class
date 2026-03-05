package lista_encadeada;

public class singlenodelist {
    singlenodelist proximo;
    int elemento;

    singlenodelist(int elemento) {
        this.elemento = elemento;
        this.proximo = null;
    }
}
