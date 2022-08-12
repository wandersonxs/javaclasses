package predicate;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExemplo {



    public static void main(String[] args) {

        PredicateExemplo predicateExemplo = new PredicateExemplo();
        List<Pessoa> pessoas = predicateExemplo.criarListaPessoas();

        predicateExemplo.filterPessoasSPUsingMethodReference(pessoas);

        predicateExemplo.filterPessoasPRUsingLambda(pessoas);

        pessoas.stream().filter(n -> "PR".equals(n.getEstadoNascimenteo())).forEach(n -> System.out.println(n.getNome() + " " + n.getEstadoNascimenteo() + " " + n.getDataNascimento()));

    }



    public List<Pessoa> filterPessoas(List<Pessoa> pessoas , Predicate<Pessoa> p ){

        List<Pessoa> result = new ArrayList<>();

        for(Pessoa pessoa : pessoas){
            if(p.test(pessoa)){
                result.add(pessoa);
            }
        }

        return result;
    }

    public void filterPessoasSPUsingMethodReference(List<Pessoa> pessoas){
        List<Pessoa> pessoasSP = filterPessoas(pessoas, Pessoa::isEstadoSP);
        pessoasSP = filterPessoas(pessoas, Pessoa::isNascimentoSeculoXXI);

        pessoasSP.forEach( n -> {
            System.out.println(n.getNome() + " " + n.getEstadoNascimenteo() + " " + n.getDataNascimento());
        });
    }


    public void filterPessoasPRUsingLambda(List<Pessoa> pessoas){
        List<Pessoa> pessoasPR = filterPessoas(pessoas, (Pessoa p) -> "PR".equals(p.getEstadoNascimenteo()));

        pessoasPR.forEach( n -> {
            System.out.println(n.getNome() + " " + n.getEstadoNascimenteo() + " " + n.getDataNascimento());
        });
    }
    public List<Pessoa> criarListaPessoas(){

        List<Pessoa> pessoas = new ArrayList<>();

        Pessoa p1 = new Pessoa("Wanderson", "SP", LocalDate.of(1977,8,2));
        Pessoa p2 = new Pessoa("Enderson", "SP", LocalDate.of(1983,8,2));
        Pessoa p3 = new Pessoa("Caroline", "PR", LocalDate.of(1982,8,2));
        Pessoa p4 = new Pessoa("Nadir", "PR", LocalDate.of(1967,8,2));
        Pessoa p5 = new Pessoa("Alexander", "SP", LocalDate.of(2009,4,1));
        Pessoa p6 = new Pessoa("Stephany", "SP", LocalDate.of(1998,1,20));
        Pessoa p7 = new Pessoa("Zandonai", "SC", LocalDate.of(1986,8,2));

        pessoas.add(p1);
        pessoas.add(p2);
        pessoas.add(p3);
        pessoas.add(p4);
        pessoas.add(p5);
        pessoas.add(p6);
        pessoas.add(p7);

        return pessoas;

    }

}
