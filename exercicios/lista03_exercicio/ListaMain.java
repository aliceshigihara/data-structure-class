package exercicios.lista03_exercicio;

public class ListaMain {
    public static void main(String[] args) {
        Lista l1 = new Lista();
        Lista l2 = new Lista();

        l1.insereFim(1);
        l1.insereFim(2);
        l1.insereFim(3);
        l1.imprime();

        System.out.println("comprimento recursivo: " + l1.comprimentoRecursivo());
        
        l1.imprimeRecursivo();

        System.out.println("\n");
        System.out.println(l1.busca(2) != null ? "achou" : "nao achou");
        System.out.println("\n");

        l1.retiraRecursivo(2);
        l1.imprimeRecursivo();

        l2.insereFim(2);
        l2.insereFim(3);
        l2.insereFim(4);
        
        System.out.println("\nigual: " + l1.igualRecursivo(l2));
        
        l1.insereFim(2);

        System.out.println("\nigual: " + l1.igualRecursivo(l2) + "\n");

        System.out.println("liberar\n");
        l1.libera();
        System.out.println("vazio: " + l1.vazia());
    }
    
}
