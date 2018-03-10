package poo;

public class Principal {
    /**
     * Método que é chamado pelo sistema operacional
     *
     * @param args argumentos de linha de comando
     */
    public static void main(String[] args) {
        Contador cont = new Contador();
        System.out.println("Valor do contador: " + cont.retornaValor());
        cont.incrementa();
        System.out.println("Valor do contador: " + cont.retornaValor());
        cont.incrementa(5);
        System.out.println("Valor do contador: " + cont.retornaValor());
        cont.defineValor(69);
        System.out.println("Valor do contador: " + cont.retornaValor());
        cont.reseta();
        System.out.println("Valor do contador: " + cont.retornaValor());
    }
}
