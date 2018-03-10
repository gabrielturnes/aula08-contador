package poo;

import org.junit.Test;

import java.util.Random;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertArrayEquals;

/**
 * Classe para realizar testes de unidade e verificar a corretude das soluções desenvolvidas pelos alunos
 *
 * Alguns exemplos de como usar JUnit podem ser obtidos aqui: https://github.com/junit-team/junit4/wiki/Assertions
 */
public class TesteDoContador {

    @Test
    public void incrementa() {
        Contador cont = new Contador();
        cont.incrementa();
        assertEquals("falha no incrementa", 1, cont.retornaValor());
        for(int i = 0; i<5; i++){
            cont.incrementa();
        }
        assertEquals("falha no incrementa", 6, cont.retornaValor());
    }

    @Test
    public void incrementaX(){
        Contador cont = new Contador();
        cont.incrementa(5);
        assertEquals("falha no incrementa", 5, cont.retornaValor());
    }

    @Test
    public void define(){
        Contador cont = new Contador();
        cont.defineValor(15);
        assertEquals("falha no incrementa", 15, cont.retornaValor());
    }

    @Test
    public void reseta(){
        Contador cont = new Contador();
        cont.defineValor(15);
        cont.reseta();
        assertEquals("falha no incrementa", 0, cont.retornaValor());
    }

}