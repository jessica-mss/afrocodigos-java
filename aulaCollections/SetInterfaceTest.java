package aulaCollections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterfaceTest {

    public static void main(String[] args) {
//        ---- SET ----
//        NÃO PERMITE REPETIÇÃO DE ITENS (deduplicar)

//        ---- SET: HASHSET ----
//        NÃO MANTEM A ORDEM DE INSERÇÃO
//        MAIS RAPIDO
//        baseada em uma tabela de dispersão (hash table)
//        REMOVE: não remove itens pelo indice, apenas pelo objeto exato
//        Set<Pessoa> pessoas = new HashSet<>();

//        ---- SET: TREESET ----
//        MAIS LENTA QUE HASHSET
//        baseada em arvores binária
//        ORDENA POR COMPARAÇÃO (Usa a ordem natural dos elementos para organiza-los e se for um objeto é necessário definir através do metodo compareTo() da interface comparable)
//        Set<Pessoa> pessoas = new TreeSet<>();

//        ---- SET: LINKEDHASHSET ----
//        MAIS LENTO QUE o hashset e mais rapido que o treeset
//        MANTEM A ORDEM DE INSERÇÃO
//        utiliza uma lista duplamente encadeada para manter a ordem dos elementos
        Set<Pessoa> pessoas = new LinkedHashSet<>();

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
;}
