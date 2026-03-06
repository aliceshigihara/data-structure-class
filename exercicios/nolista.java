package exercicios;

public class nolista {
    int info;
    nolista prox;

    public void setInfo(int info) {
        this.info = info;
    }

    public int getInfo() {
        return info;
    }

    public void setProx(nolista prox) {
        this.prox = prox;
    }

    public nolista getProx() {
        return prox;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
