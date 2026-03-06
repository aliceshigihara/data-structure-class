package exercicios;

public class lista {
    private nolista prim;

    public static void main(String[] args) {
        lista lista1 = new lista();
        lista1.insere(4);
        lista1.insere(7);
        lista1.insere(9);
        lista1.insere(12);
        
        lista1.imprime();
        System.out.println("\n");
        lista1.busca(7);
        System.out.println("\n");
        int comp = lista1.comprimento();
        System.out.println("comprimento: " + comp + "\n");
        lista1.retira(9);
        lista1.imprime();
    }

    public lista(){
        this.prim = null;
    }

    public void insere(int v){
        nolista novo = new nolista();
        novo.info = v;
        novo.prox = prim;
        this.prim = novo;
    }

    public void imprime(){
        nolista p = prim;
        while(p != null){
            System.out.println(p.info);
            p = p.prox;
        }
    }

    public boolean vazia() {
        if(prim == null){
            return true;
        } else {
            return false;
        }
    }

    public nolista busca(int v) {
        nolista p = prim;
        while(p != null){
            if (p.info == v){
                System.out.println(p.info);
                return p;
            }
            p = p.prox;
        } return null;
    }

    public int comprimento(){
        int c = 0;
        nolista p = prim;
        while( p != null){
            c++;
            p = p.prox;
        }
        return c;
    }

    public nolista ultimo(){
        if (vazia()){
            return null;
        }

        nolista p = prim;
        while (p.prox != null){
            p = p.prox;
        }
        return p;
    }

    public void retira(int v){
        nolista ant = null;
        nolista p = prim;

        while(p != null && p.info != v){
            ant = p;
            p = p.prox;
        }

        if (p == null){
            return;
        }

        if (ant == null){
            this.prim = p.prox;
        } else {
            ant.prox = p.prox;
        }
    }

    public void libera(){
        this.prim = null;
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
