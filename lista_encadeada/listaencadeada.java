package lista_encadeada;

public class listaencadeada {
    private singlenodelist primeiro;
    private singlenodelist ultimo;
    private int tamanho;

    public void inserir(int elemento) {
        singlenodelist no = new singlenodelist(elemento);
        if (vazio()){
            primeiro = no;
        } else {
            ultimo.proximo = no;
        }
        ultimo = no;
        tamanho++;
    }

    public boolean vazio() {
        return tamanho == 0;
    }

    public void mostrarlista() {
        singlenodelist atual = primeiro;
        while (atual != null) {
            System.out.println(atual.elemento);
            atual = atual.proximo;
        }
    }

    public static void main(String[] args) {
        listaencadeada novaLista = new listaencadeada();
        novaLista.inserir(3);
        novaLista.inserir(5);
        novaLista.inserir(10);

        novaLista.mostrarlista();

    }
}
