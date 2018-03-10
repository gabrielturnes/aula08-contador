package poo;

public class Contador {

    // Atributos
    private int valorAtual;

    // Métodos

    /**
     * Construtor do Contador (inicia o valor em 0)
     */
    public void Contador(){
        valorAtual = 0;
    }

    /**
     * Define valor do Contador
     * @param valor valor do contador
     */
    public void defineValor(int valor){
        valorAtual = valor;
    }

    /**
     * Retorna valor do contador
     * @return valor do contador
     */
    public int retornaValor(){
        return valorAtual;
    }

    /**
     * Incrementa 1 no contador
     */
    public void incrementa(){
        valorAtual += 1;
    }

    /**
     * Incrementa um valor no contador
     * @param valor valor que vai ser incrementado
     */
    public void incrementa(int valor){
        valorAtual += valor;
    }

    /**
     * Define o valor do contador em 0
     */
    public void reseta(){
        valorAtual = 0;
    }


}
