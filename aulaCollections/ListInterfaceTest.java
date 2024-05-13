package aulaCollections;

import java.util.*;

public class ListInterfaceTest {

    public static void main(String[] args) {

//        ---- LIST ----
//        PERMITE REPETIÇÃO DE ITENS
//        MANTEM A ORDEM DE INSERÇÃO

//        ---- LIST: ARRAYLIST ----
//        FUNCIONA BEM PARA ACESSO POR INDICES (é mais performatico, pois os itens da lista são posicionados de forma sequencial na memoria)
//        Ou seja, funciona bem para operações de busca a medida que a lista cresce em numero de elementos
//        NÃO FUNCIONA BEM PARA INSERÇÃO/REMOÇÃO EM POSIÇÕES INTERMEDIÁRIAS (pois copia a lista restante com o item removido)
//        List<Pessoa> pessoas = new ArrayList<>();

//        ---- LIST: LINKEDLIST ----
//        NÃO FUNCIONA PARA ACESSO POR INDICES (mais lento, pois volta para o principal para percorrer todos até encontrar o indicado)
//        FUNCIONA BEM PARA INSERÇÃO/REMOÇÃO EM POSIÇÕES INTERMEDIÁRIAS (pois apenas altera a indicação do nó no ponteiro do indice)
        List<Pessoa> pessoas = new LinkedList<>();

        Pessoa pessoa1 = new Pessoa("Ana", 31);
        Pessoa pessoa2 = new Pessoa("Julia", 29);
        Pessoa pessoa3 = new Pessoa("Tereza", 27);

        pessoas.add(pessoa1);
        pessoas.add(pessoa2);
        pessoas.add(pessoa3);
        pessoas.add(pessoa1);
        pessoas.add(new Pessoa("Jessica", 28));

        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa.getNome() + " , " + pessoa.getIdade());
        }
        System.out.println("Nº itens: " + pessoas.size());
    }
}
