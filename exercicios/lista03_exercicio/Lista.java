package exercicios.lista03_exercicio;

public class Lista {
    private NoLista prim;

    public Lista(){
        this.prim = null;
    }

    public void insere(int v){
        NoLista novo = new NoLista();
        novo.info = v;
        novo.prox = prim;
        this.prim = novo;
    }

    public void imprime(){
        NoLista p = prim;
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

    public NoLista busca(int v) {
        NoLista p = prim;
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
        NoLista p = prim;
        while( p != null){
            c++;
            p = p.prox;
        }
        return c;
    }

    public NoLista ultimo(){
        if (vazia()){
            return null;
        }

        NoLista p = prim;
        while (p.prox != null){
            p = p.prox;
        }
        return p;
    }

    public void retira(int v){
        NoLista ant = null;
        NoLista p = prim;

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

    public void insereFim(int v){
        NoLista novo = new NoLista();
        novo.setInfo(v);
        novo.setProx(null);
        if (vazia()){
            prim = novo;
        } else {
            ultimo().setProx(novo);
        }
    }

    public boolean igual(Lista L){
        NoLista p1 = this.prim;
        NoLista p2 = L.prim;
        while (p1 != null && p2 != null){
            if (p1.getInfo() != p2.getInfo()){
                return false;
            }
            p1 = p1.getProx();
            p2 = p2.getProx();
        }
        return p1 == null && p2 == null;
    }

//implementação recursiva

    public void imprimeRecursivo(){
        imprimeRecursivoAux(prim);
    }

    private void imprimeRecursivoAux(NoLista no){
        if (no != null){
            System.out.println(no.getInfo());
            imprimeRecursivoAux(no.getProx());
        }
    }

    public void retiraRecursivo(int v){
        prim = retiraRecursivoAux(prim, v);
    }

    private NoLista retiraRecursivoAux(NoLista no, int v){
        if (no == null){
            return null;
        }
        if (no.getInfo() == v){
            return no.getProx();
        }

        no.setProx(retiraRecursivoAux(no.getProx(), v));
        return no;
    }

    public boolean igualRecursivo(Lista l){
        return igualRecursivoAux(prim, l.prim);
    }

    private boolean igualRecursivoAux(NoLista l1, NoLista l2){
        if (l1 == null && l2 == null){
            return true;
        }
        if (l1 == null || l2 == null){
            return false;
        }
        return igualRecursivoAux(l1.getProx(), l2.getProx());
    }

    public int comprimentoRecursivo(){
        return comprimentoRecursivoAux(this.prim);
    }

    private int comprimentoRecursivoAux(NoLista no){
        if (no == null){
            return 0;
        }
        return 1 + comprimentoRecursivoAux(no.getProx());
    }

    @Override
    public String toString() {
        return super.toString();
    }

}