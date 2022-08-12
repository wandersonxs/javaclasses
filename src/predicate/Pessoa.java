package predicate;

import java.time.LocalDate;
import java.util.Objects;

public class Pessoa {

    private String nome;

    private String estadoNascimenteo;

    private LocalDate dataNascimento;

    public Pessoa(String nome, String estadoNascimenteo, LocalDate dataNascimento) {
        this.nome = nome;
        this.estadoNascimenteo = estadoNascimenteo;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEstadoNascimenteo() {
        return estadoNascimenteo;
    }

    public void setEstadoNascimenteo(String estadoNascimenteo) {
        this.estadoNascimenteo = estadoNascimenteo;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return Objects.equals(nome, pessoa.nome) && Objects.equals(estadoNascimenteo, pessoa.estadoNascimenteo) && Objects.equals(dataNascimento, pessoa.dataNascimento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, estadoNascimenteo, dataNascimento);
    }

    public static boolean isEstadoSP(Pessoa pessoa) {
        return pessoa.estadoNascimenteo.equals("SP");
    }

    public static boolean isNascimentoSeculoXXI(Pessoa pessoa) {
        return pessoa.dataNascimento.isAfter(LocalDate.of(2000, 12,31));
    }
}
